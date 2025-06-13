package com;

import com.projects.Project;
import com.utils.Env;
import grammar.SmaliLexer;
import grammar.SmaliParser;
import grammar.parser.Parser;
import net.dongliu.apk.parser.ApkFile;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.collections4.ListUtils;
import org.jf.baksmali.Adaptors.ClassDefinition;
import org.jf.baksmali.BaksmaliOptions;
import org.jf.baksmali.formatter.BaksmaliWriter;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main_1 {
    static List<String> whitel1;
    static List<String> whitel2;
    static List<File> listOfBatchfiles = new ArrayList<>();

    private static Document convertStringToXMLDocument(String xmlString)
    {
        //Parser that produces DOM object trees from XML content
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //API to obtain DOM Document instance
        DocumentBuilder builder = null;
        try
        {
            //Create DocumentBuilder with default configuration
            builder = factory.newDocumentBuilder();

            //Parse the content to Document object
            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
            return doc;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            ////System.out.println("arguments missing [file.smali]");
            return;
        }

//        String basedir = args[0];
        Env.basedir = args[0];
        List<String> results = new ArrayList<String>();
        whitel1 = Arrays.asList(Env.whitelist1);
        whitel2 = Arrays.asList(Env.whitelist2);

        Env.init();

        File[] files = new File(Env.basedir).listFiles();
        //System.out.println(Env.basedir);
        List<File> fileset = Arrays.asList(files);
        List<List<File>> batch = ListUtils.partition(fileset, Env.batchsize);

        if (files != null) {
            for (List<File> batches : batch) {
                listOfBatchfiles = new ArrayList<>();
                Env.stats.noOfProjects += Env.batchsize;
                Env.projects = new LinkedHashMap<>();

                for (File file : batches) {
                    if (file.isFile()) {
                        if (file.getName().endsWith(".apk")) {
                            results.add(file.getName());
                            String apkfilename = file.getName();
                            String pathname = Env.basedir + "\\" + apkfilename.replace(".apk", "");
                            File isApkDirExists = new File(pathname);

                            if (isApkDirExists.isDirectory()) {
                                if (isApkDirExists.length() > 0) {
//                                file.delete();
                                    continue;
                                } else {
//                                isApkDirExists.delete();
                                }
                            }
//                        else{
//                            new File(pathname).mkdir();
//                        }

                            try {
                                Path path = Paths.get(file.getAbsolutePath());
                                String fullpathname = path.toString().replace(".apk", "");
                                Env.activeprojectname = fullpathname;

                                listOfBatchfiles.add(new File(fullpathname));

                                long bytes = Files.size(path);
                                long kilobytes = (bytes / 1024);
                                long megabytes = (kilobytes / 1024);

                                    System.out.println("Processing > " + file.getName() + " : " + megabytes);
                                ApkFile apkFile = new ApkFile(file);
                                String manifestXml = apkFile.getManifestXml();
//                                System.out.println("MANIFEST>>> "+manifestXml);
                                String sharedUID = null;
                                try
                                {
                                    Document doc = convertStringToXMLDocument( manifestXml );
                                    doc.getDocumentElement().normalize();

                                    //Here comes the root node
                                    Element root = doc.getDocumentElement();
                                    sharedUID = root.getAttribute("android:sharedUserId");
                                    Env.sharedUID = sharedUID;
                                    Env.appname = file.getName();
                                    Env.addSharedUserIDs(sharedUID, file.getName());

//                                    System.out.println(root.getNodeName());
//                                    System.out.println(root.getAttribute("android:sharedUserId"));
                                } catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
//                                DexClass[] cls = apkFile.getDexClasses();
                                //System.out.println("APK VERSION>> "+ apkFile.getApkMeta().getMinSdkVersion());
//                                int minsdk0 = 25;
//                                try {
//                                    ApkMeta apkMeta = apkFile.getApkMeta();
//                                    String minsdk = apkFile.getApkMeta().getMinSdkVersion();
//
//                                    if(minsdk != null)
//                                        minsdk0 = Integer.parseInt(apkFile.getApkMeta().getMinSdkVersion());
//                                }catch(Exception e){
//                                    //System.out.println("116>>>>>>>>"+e.getMessage());
//                                }

                                DexFile dexFile = null;
                                try {
                                    MultiDexContainer<? extends DexBackedDexFile> multiDexContainer
                                            = DexFileFactory
                                            .loadDexContainer(new File(file.getAbsolutePath()),
                                                    Opcodes.forApi(15));
                                    List<String> dexnames = multiDexContainer.getDexEntryNames();
                                    for (String s : dexnames) {
                                        MultiDexContainer.DexEntry dexEntry = multiDexContainer.getEntry(s);
                                        dexFile = dexEntry.getDexFile();

                                        if (dexFile != null) {
                                            for (ClassDef cd : dexFile.getClasses()) {
                                                boolean pass = true;
                                                if (cd != null) {
                                                    try {
                                                        String type = cd.getType();
                                                        if (type != null) {
                                                            for (String whitelabel : whitel1) {
                                                                if (type.startsWith(whitelabel)) {
                                                                    pass = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (!pass)
                                                                continue;

                                                            pass = true;
                                                            for (String whitelabel2 : whitel2) {
                                                                if (type.contains(whitelabel2)) {
                                                                    pass = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (!pass)
                                                                continue;
                                                        }
                                                    } catch (Exception e) {
                                                        continue;
                                                    }
                                                }

//                                            Iterable<? extends Method> methods = cd.getMethods();
                                                ClassDef classDef = cd;
                                                try {
                                                    StringWriter stringWriter = new StringWriter();
                                                    BaksmaliWriter writer = new BaksmaliWriter(
                                                            stringWriter,
                                                            classDef.getType());
                                                    BaksmaliOptions baksmaliOptions = new BaksmaliOptions();
                                                    baksmaliOptions.implicitReferences = true;
                                                    ClassDefinition classDefinition = new ClassDefinition(baksmaliOptions, classDef);
                                                    classDefinition.writeTo(writer);
                                                    writer.close();

                                                    String newFileName = classDef.getType();
                                                    newFileName = newFileName.replaceFirst("L", "");
                                                    String[] folders = newFileName.split("/");
                                                    String folderPath = "";
                                                    for (int i = 0; i < folders.length - 1; i++) {
                                                        folderPath += folders[i] + "/";
                                                    }
                                                    String fname = folders[folders.length - 1];
                                                    fname = fname.replace(";", "");
                                                    String filename = fname + ".smali";
//                                                newFileName = newFileName.replaceAll("/", "#");
                                                    Env.createFile(folderPath, filename, pathname, stringWriter);
                                                } catch (Exception e) {
                                                    continue;
                                                }

                                            }
                                        }
                                    }
                                } catch (Exception ioe) {
                                    ioe.printStackTrace();
                                    continue;
                                }

//                            Process p = null;
//                            try {
//                                p = Runtime.getRuntime().exec(
//                                        "java -jar apktool.jar d " + apkfilename,
//                                        null,
//                                        new File(Env.basedir)
//                                );
//
//                                final BufferedReader wr = new BufferedReader(new InputStreamReader(p.getInputStream()));
//
//                                BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//
//                                final BufferedWriter writer = new BufferedWriter(
//                                        new OutputStreamWriter(p.getOutputStream()));
//
//                                BufferedReader errorReader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
//                                errorReader.lines().forEach(//System.out::println);
//
//                                String line = "";
//                                try {
//                                    while ((line = wr.readLine()) != null || (line = stdError.readLine()) != null) {
//                                        if (line.contains("Press any key")) {
//                                            String newLine = "\n\r";
//                                            writer.write(newLine);
//                                        }
////                                        //System.out.println(line);
//                                    }
//                                    //System.out.println("ERROR>> "+ stdError.readLine());
//                                } catch (IOException e) {
//                                    e.printStackTrace();
//                                }
//
//                            } catch (IOException e) {
//                                e.printStackTrace();
//                            }
//                            p.waitFor();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            if (file.delete()) {
                                //System.out.println("Deleted the file: " + file.getName());
                            } else {
                                //System.out.println("Failed to delete the file.");
                            }
                        }
                    }
                }//end 1
                smaliParser(Env.basedir);
            }
        }
    }


    private static void walk(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
//                if(whitelistfolders.contains(f.getName())){
//                    continue;
//                }
                String projectRootDir = f.getAbsolutePath();
                walk(f.getAbsolutePath());
            } else {
                if (f.getName().startsWith("R$") | f.getName().equals("R.smali")) {
                    continue;
                }
                if (f.getName().startsWith("AndroidManifest.xml")) {
//                    ////System.out.println( "Manifest File:" + f.getAbsoluteFile() );
                    activeProject.setAndroidmanifest(f);
                    continue;
                }
                if (f.getName().equals("BuildConfig.smali")) {
                    continue;
                }
                if (f.getName().endsWith(".smali")) {
                    activeProject.setSmaliFiles(f);
                    continue;
                }
            }
        }
    }

    static String[] whitelistFolderNames = {"android", "androidx", "google", "original",
            "res", "java", "javax", "jetbrains", "intellij",
            "kotlinx", "okhttp3", "assets", "kotlin", "unknown",
            "org", "META-INF", "jackson"};
    static List<String> whitelistfolders = new ArrayList<>();
    private static Project activeProject;
    static int batchSize = 100;
    static int totalNoOfFile = 0;
    static int quotient = 0;
    static int remainder = 0;
    static HashMap<Integer, List<File>> batchOfFiles = new HashMap<>();
    static List<String> processedFileName = new ArrayList<>();

    private static void processFilesInBatches(File[] files) {
        for (File file : listOfBatchfiles) {
            if (file.isDirectory()) {
                if (processedFileName.contains(file.getAbsolutePath())) {
                    continue;
                }
                processedFileName.add(file.getAbsolutePath());
                activeProject = new Project();
                walk(file.getAbsolutePath());
                Env.projects.put(file.getName(), activeProject);
            }
        }
        analyzeProjects();

//        for (File file : listOfBatchfiles) {
//            try {
//                FileUtils.deleteDirectory(file);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
    }

    public static <T> Stream<List<File>> batches(List<File> source, int length) {
        if (length <= 0)
            throw new IllegalArgumentException("length = " + length);
        int size = source.size();
        if (size <= 0)
            return Stream.empty();
        int fullChunks = (size - 1) / length;
        return IntStream.range(0, fullChunks + 1).mapToObj(
                n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
    }

    private static void smaliParser(String basedir) {
//        for(String s : whitelistFolderNames) {
//            whitelistfolders.add(s);
//        }
        //System.out.println(basedir);
        File[] files = new File(basedir).listFiles();

        if (files != null) {
            totalNoOfFile = files.length;
            processFilesInBatches(files);
            Env.stats.statsAsExcel();
            System.out.println(Env.log.toString());
        }
    }

    private static void analyzeProjects() {

//        analyzeManifestXML();

        for (Map.Entry<String, Project> p : Env.projects.entrySet()) {
            {//parsing block
                Env.activeproject = p.getValue();
                Env.activeprojectname = p.getKey();

                List<File> smalifiles = Env.activeproject.getSmaliFiles();
                for (File f : smalifiles) {
                    ////System.out.println("Smalifile>> "+f.getAbsolutePath());

                    String smalifilename = f.getAbsolutePath();
                    Env.activeSmaliFileName = smalifilename;
                    //System.out.println(smalifilename);
                    String encoding = "utf8";
                    Charset charset = (encoding == null ? Charset.defaultCharset() : Charset.forName(encoding));
                    CharStream charStream = null;
                    try {
                        charStream = CharStreams.fromPath(Paths.get(smalifilename), charset);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    SmaliLexer lexer = new SmaliLexer(charStream);//new ANTLRFileStream(smalifilename));
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    SmaliParser parser = new SmaliParser(tokens);
                    ParseTree tree = parser.parse();
                    ParseTreeWalker walker = new ParseTreeWalker();
                    walker.walk(new Parser(), tree);
                }
                //System.out.println("END");
            }
        }

    }
}
