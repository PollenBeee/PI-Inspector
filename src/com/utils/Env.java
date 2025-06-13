package com.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ApkCertificates;
import com.core.CELL;
import com.core.CELL_DESCRIPTION;
import com.core.CLASS;
import com.core.METHOD;
import com.core.InstructionThatReferesIPC;
import com.projects.Project;


public class Env {
    public static Stats stats = new Stats();
    public static String basedir;
    public static R r = new R();
    public static final int batchsize = 1;
    
    public static HashMap<String, ApkCertificates> apkcertificates = new HashMap<>();

    public static LinkedHashMap<String, Project> projects = new LinkedHashMap<>();
    public static Project activeproject = null;
    public static String activeName = null;

    public static String activeprojectname = null;
    public static String activeSmaliFileName = null;
    public static List<Integer> activeLineNos = new ArrayList<>();
    public static List<String> infectedSmaliFiles = new ArrayList<>();

    public static int globalRowCount = 1;
    public static final int maxRowsPerFile = 200000;
    public static boolean allWorkBookWrittenToFile = false;
    public static int aux_count =0;
    public static String minSDKVersion = "";
    public static String targetSDKVersion = "";
    public static int totActivities = 0;
    public static int totReceiver = 0;
    public static int totService = 0;

    public static int totExposedActivity = 0;
    public static int totExposedReceiver = 0;
    public static int totExposedService = 0;
    public static long activeprojectsize = 0;
    public static ArrayList zipErrorFiles = new ArrayList();
    public static File activeFile;

    public static String convertedJson = new String();
    public static String activePackageName = new String();
    public static HashMap<String, METHOD> methodreport = new HashMap<>();
    public static HashMap<String, List<String>> instruction2methodReferenceMap = new HashMap<>();
    public static ArrayList<String> paInfectedPoints = new ArrayList<>();
    public static boolean isMethodVulnerable  = false;
    
    //for excel processing
    static int rowcount = 1;
    static int cellno = 0;
    public static ArrayList<String> hs = new ArrayList<>();
    public static HashMap<String, Integer> rMap = new HashMap<>(); //registry -to- position mapping
    public static boolean isFirstTimeWorkbook = true;
    static XSSFRow rowhead = null;

    public static TreeMap<String, List<String>> appsSharingID = new TreeMap<>();
    public static String sharedUID = "";
    public static String appname;

    public static String _pifileName = "PendingIntents";
    public static String _pixlsFilename = basedir + System.getProperty("file.separator") + _pifileName + ".xlsx";
    public static XSSFSheet _pisheet = null;
    public static XSSFWorkbook _piworkbook = new XSSFWorkbook();
    static XSSFRow _pirowhead = null;
    public static FileOutputStream _pifileOut = null;
    public static boolean _piWorkBookWrittenToFile = false;
    static int _pirowcount = 1;
    static int _picellno = 0;
    public static int _piglobalRowCount = 1;
    public static boolean isHead2Add = true;
    public static boolean isPiHead2Add = true;
    static boolean reinitProjectStats = false;
    
    public static XSSFSheet sheet = null;
    public static XSSFWorkbook workbook = new XSSFWorkbook();
    public static String fileName = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
    public static String xlsFilename = basedir + System.getProperty("file.separator") + fileName + ".xlsx";
    public static String xlsFilename2 = basedir + System.getProperty("file.separator") + "appsThatShareUID.xls";
    public static FileOutputStream fileOut = null;

    public static String datetime = new SimpleDateFormat("ddHHmm").format(new Date());
    public static StringBuffer log = new StringBuffer();
	public static String checksum = "";
	public static long startTime = System.nanoTime();
	public static long endTime = System.nanoTime();
	public static long duration;
    
    public static void setInstruction2methodReferenceMap(String key, String ipcmethod) {
    	List<String> values = new ArrayList();
    	if(instruction2methodReferenceMap.containsKey(key)) {
    		values = instruction2methodReferenceMap.get(key);
    		values.add(ipcmethod);
    	}
    	else {
    		values.add(ipcmethod);
    		instruction2methodReferenceMap.put(key, values);
    	}
    }

    public static final String[] whitelist1 = {
            "Landroid/",
            "Landroidx/",
            "Lorg/",
            "Lnet/dongliu/",
            "Lnet/lingala/",
            "Ljavax/annotation",
            "Ljavax/json",
            "Lantlr/",
            "Lio/objectbox/",
            "Lorg/stringtemplate/",
            "Lcom/google/",
            "Lcom/java/",
            "Lcom/javax/",
            "Lcom/kotlin/",
            "Lcom/okhttp3/",
            "Lcom/intellij/",
            "Lcom/arc/pendingmutent/",
            "Lcom/ibm/",
            "Lorg/antlr/",
            "Lantlr/build/",
            "Lorg/jf/dexlib2/",
            "Ljava/util/",
            "Lorg/jf/",
            "Lorg/jf/baksmali/",
            "Lorg/apache/",
            "Lorg/w3c/",
            "Lorg/xml/",
            "Ljava/io/",
            "Ljava/net/",
            "Ljava/nio/",
            "Ljavax/xml/",
            "Lnet/dongliu/",
            "Lio/objectbox/",
            "Lorg/greenrobot/",
            "Lnet/lingala/",
            "Lcom/beust/",
            "Lorg/glassfish/",
            "Lorg/abego/",
            "Lorg/checkerframework/",
            "Lorg/codehaus/"
    };
    public static final String[] whitelist2 = {
            "/R$",
            "/R;",
            "/BuildConfig;"
    };

    public static void addSharedUserIDs(String key, String value){
        if(appsSharingID.isEmpty()) {
            List<String> values = new ArrayList<>();
            values.add(value);
            appsSharingID.put(key, values);
            return;
        }
        List<String> values = appsSharingID.get(key);
        if(values == null) {
            values = new ArrayList<>();
            values.add(value);
            appsSharingID.put(key, values);
        }
        values.add(value);
        appsSharingID.put(key, values);
        ////System.out.println(appsSharingID.toString());
    }

    public static boolean createFile(String folderpath,String filename, String dir, StringWriter content) {
        //////System.out.println(filename);
        File folder = new File(dir, folderpath);
        folder.mkdirs();
        String dirs = dir+File.separator+folderpath;
        File fx = new File(dirs);
        fx.mkdirs();
        File file = new File(dirs, filename);
//        if(!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        //System.out.println(file.getAbsolutePath());
        
        BufferedWriter filewriter = null;

        try {
            if (file.createNewFile())
            {
//                ////System.out.println(file.getAbsoluteFile()+" = File is created!");
            } else {
//                ////System.out.println(file.getAbsoluteFile()+ " = File already exists.");
            }

            filewriter = new BufferedWriter(new FileWriter(file));
            filewriter.write(content.toString());
            filewriter.close();
        } catch(FileNotFoundException f){
            File file2 = new File(dirs,"mu"+aux_count+"_"+file.getName());
            aux_count++;
            try {
                filewriter = new BufferedWriter(new FileWriter(file2));
                filewriter.write(content.toString());
                filewriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void describeAsExcel() {
        datetime = new SimpleDateFormat("ddHHmm").format(new Date());

        init4All();
//        init4PI();

        try {

            for (Map.Entry<String, Project> p : projects.entrySet()) {
//                stats.noOfProjects++;
                Project project = p.getValue();

                Iterator iterator = project.getActivities().entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry mapElement = (Map.Entry) iterator.next();
                    String sourceFileName = (String) mapElement.getKey();

                    List<CLASS> clz = (List<CLASS>) mapElement.getValue();
                    for (CLASS c : clz) {
                        List<METHOD> methods = c.getMethods();
                        String noOfMethods = String.valueOf(methods.size());

//                        ////////System.out.println("HS>> "+hs);
                        for (METHOD m : methods) {
                            for (Map.Entry<String, CELL> entry : m.getAllRegistry().entrySet()) {
//                                ////////System.out.print(entry.getKey()+":"+hs.contains(entry.getKey()));
                                if (!hs.contains(entry.getKey()))
                                    hs.add(entry.getKey());
                            }
                        }
                    }
                }
                //////////System.out.println(hs);
                int j = 1;
                int i = 13;
                for (String s : hs) {
                    rMap.put(s, i);
//                    //////System.out.println("rowhead<< "+rowhead+":"+_pirowhead);
                    if (rowhead == null)
                        break;
                    rowhead.createCell(i).setCellValue(s);
                    _pirowhead.createCell(i).setCellValue(s);
                    i++;
                    j++;
                }

                cellno = 0;
                _picellno = 0;
                parseProject(p.getKey(), project);
            }

            if (!Env._piWorkBookWrittenToFile) {
                try {
                    String pifileName = datetime;
                    Env._pixlsFilename = basedir + System.getProperty("file.separator") + Env._pifileName + "_" + pifileName + ".xlsx";
                    try {
                        Env._pifileOut = new FileOutputStream(Env._pixlsFilename);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    Env._piworkbook.write(Env._pifileOut);
                    Env._pifileOut.close();
                    Env._pifileOut.flush();
                    Env._piworkbook.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (!Env.allWorkBookWrittenToFile) {
                fileName = datetime;
                xlsFilename = basedir + System.getProperty("file.separator") + "AllData" + "_" + fileName + ".xlsx";
                try {
                    Env.fileOut = new FileOutputStream(Env.xlsFilename);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                try {
                    Env.workbook.write(Env.fileOut);
                    Env.fileOut.close();
                    Env.fileOut.flush();
                    Env.workbook.close();
//                    timeToCreateNewFile = true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
//                stats.writeToFile();
            }

//            //////System.out.println(stats.toString());

        } catch (Exception ex) {
            //////System.out.println("Env.java line 95, Exception>> " + activeprojectname + " ");
            ex.printStackTrace();
            System.exit(0);
        }
    }

    private static void init4All() {
        datetime = new SimpleDateFormat("ddHHmm").format(new Date());
        //initi environment
        allWorkBookWrittenToFile = false;
        Env.sheet = Env.createWorkbook();
        xlsFilename = basedir + System.getProperty("file.separator") + "AllData" + "_" + datetime + ".xlsx";
        addHead();
    }

    private static void parseProject(String projectname, Project project) {
        reinitProjectStats = false;
        Iterator iterator = project.getActivities().entrySet().iterator();
        int noOfActivities = project.getActivities().entrySet().size();

        while (iterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry) iterator.next();
            String sourceFileName = (String) mapElement.getKey();

            List<CLASS> clz = (List<CLASS>) mapElement.getValue();
            String noOfClz = String.valueOf(clz.size());

            for (CLASS c : clz) {
                stats.noOfClz++;
                List<METHOD> methods = c.getMethods();
                String noOfMethods = String.valueOf(methods.size());

                for (METHOD m : methods) {
                    stats.noOfMethods++;
                    for (Map.Entry<String, CELL> entry : m.getAllRegistry().entrySet()) {
                        String objtype = entry.getValue().getCurrent_descriptions().getObjType();
                        String clstype = entry.getValue().getCurrent_descriptions().getClsType();
                        String desctype = entry.getValue().getCurrent_descriptions().getDescType();

                        if (objtype != null) {
                            if (objtype.contains("PendingIntent") || objtype.contains("/Intent")) {
//                                pendingIntentDataEntry(projectname, entry,
//                                        noOfActivities, sourceFileName, noOfClz,
//                                        c, noOfMethods, m);
                            }
                        }
//                        allDataEntry(projectname, entry,
//                                noOfActivities, sourceFileName, noOfClz,
//                                c, noOfMethods, m);
//                        Env.describeAsExcel(sheet, isHead2Add);
                    }
                }
            }
        }
        if(reinitProjectStats){
//            Env.stats.statsAsExcel();
            reinitProjectStats = false;
        }
    }

    private static void pendingIntentDataEntry(String projectname, Map.Entry<String, CELL> entry,
                                               int noOfActivities, String sourceFileName, String noOfClz,
                                               CLASS c, String noOfMethods, METHOD m) {
        String objtype = entry.getValue().getCurrent_descriptions().getObjType();
        String clstype = entry.getValue().getCurrent_descriptions().getClsType();
        String desctype = entry.getValue().getCurrent_descriptions().getDescType();

        XSSFRow row = _pisheet.createRow(_pirowcount);
        createPendingIntentCell(row, projectname, "s");   //projectname
        createPendingIntentCell(row, String.valueOf(noOfActivities), "n");   //no.of Activities
        createPendingIntentCell(row, sourceFileName, "s"); //sourcefilename
        createPendingIntentCell(row, noOfClz, "n");  //no.of classes
        createPendingIntentCell(row, c.getClassname(), "s");  //cls name
        createPendingIntentCell(row, noOfMethods, "n");  //no.of methods
        createPendingIntentCell(row, m.getMethodname(), "s");
        createPendingIntentCell(row, objtype, "s"); //entry for PendingIntents ahead
        createPendingIntentCell(row, clstype, "s");
        createPendingIntentCell(row, desctype, "s");

        List<String> pointsFrom = entry.getValue().getCurrent_descriptions().getPointsFrom();
        List<String> flag = new ArrayList<>();
        if (pointsFrom != null) {
            for (String s : pointsFrom) {
                CELL cl = m.getRegistry(s);
                if(cl != null) {
                    if(cl.getCurrent_descriptions() != null) {
                        if (cl.getCurrent_descriptions().getDescType() != null) {
                            if (cl.getCurrent_descriptions().getDescType().equals(CELL_DESCRIPTION.T_NUMERIC)) {
                                flag.add(cl.getCurrent_descriptions().getInitValue());
                            }
                        }
                    }
                }
            }
        }

        createPendingIntentCell(row, entry.getKey() + ":=" + flag.toString(), "s");  //key registry
        createPendingIntentCell(row, entry.getValue().getDeclaredVariableName(), "s");
        createPendingIntentCell(row, entry.getValue().getCurrent_descriptions().getRhs(), "s");

        List<CELL_DESCRIPTION> previousLinks = entry.getValue().getPrevious_descriptions();
        String sb = "[ ";
        sb += entry.getValue().getCurrent_descriptions().getPointsTo() + ", ";

        String pointsTo = entry.getValue().getCurrent_descriptions().getPointsTo();

        if (rMap != null) {
            if (rMap.containsKey(pointsTo)) {
                _picellno = rMap.get(pointsTo);
            }
        }


        createPendingIntentCell(row, pointsTo, "s");  //points-to registry

        for (CELL_DESCRIPTION cd : previousLinks) {
            sb += cd.getPointsTo() + ", ";

            pointsTo = cd.getPointsTo();
            pointsFrom = cd.getPointsFrom();
            if (rMap != null) {
                if (rMap.containsKey(pointsTo)) {
                    _picellno = rMap.get(pointsTo);
                }
            }
            createPendingIntentCell(row, pointsTo, "s");  //points-to registry
        }
        sb += " ]";
//                        ////////System.out.println(" PointsTo -> " + sb);
        _pirowcount++;
        _piglobalRowCount++;
        _picellno = 0;
    }

    public static XSSFSheet createWorkbook() {
        isHead2Add = true;
        Env.globalRowCount = 1;
        Env.rMap = new HashMap<>();
        Env.hs = new ArrayList<>();

        String sheetname = "sheet";
        int sheetcount = 1;

        workbook = new XSSFWorkbook();
        sheet = workbook.createSheet(sheetname + sheetcount);

        return sheet;
    }


    private static void addHead() {
        rowhead = sheet.getRow(0);
//        if (isHead2Add) {
        rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("Checksum");
        rowhead.createCell(1).setCellValue("appPackageName");      
        rowhead.createCell(2).setCellValue("appName2");
        rowhead.createCell(3).setCellValue("appSize(KB)");

        rowhead.createCell(4).setCellValue("noOfClz");
        rowhead.createCell(5).setCellValue("noOfMethods");
        rowhead.createCell(6).setCellValue("noOfIntents");
        rowhead.createCell(7).setCellValue("noOfPendingIntents");
        rowhead.createCell(8).setCellValue("FLAG_ONE_SHOT");
        rowhead.createCell(9).setCellValue("FLAG_NO_CREATE");
        rowhead.createCell(10).setCellValue("FLAG_CANCEL_CURRENT");
        rowhead.createCell(11).setCellValue("FLAG_UPDATE_CURRENT");
        rowhead.createCell(12).setCellValue("FLAG_IMMUTABLE");
        rowhead.createCell(13).setCellValue("unsafePICreation");
        rowhead.createCell(14).setCellValue("unsafeBroadcast");
        rowhead.createCell(15).setCellValue("unsafePITransfer");
        rowhead.createCell(16).setCellValue("NoOfProtectedBroadcast");
        rowhead.createCell(17).setCellValue("UnsafeProtectedBroadcast");
        rowhead.createCell(18).setCellValue("TotalBroadcast");
        rowhead.createCell(19).setCellValue("SharedUIDLabel");
        rowhead.createCell(20).setCellValue("QuantifySUID");
        rowhead.createCell(21).setCellValue("TotalPermissions");
        rowhead.createCell(22).setCellValue("minSDKVersion");
        rowhead.createCell(23).setCellValue("targetSDKVersion");

        rowhead.createCell(24).setCellValue("TotActivities");
        rowhead.createCell(25).setCellValue("TotServices");
        rowhead.createCell(26).setCellValue("TotBroadcastReceivers");
        rowhead.createCell(27).setCellValue("TotExposedActivities");
        rowhead.createCell(28).setCellValue("TotExposedServices");
        rowhead.createCell(29).setCellValue("TotExposedBroadcastReceivers");
        rowhead.createCell(30).setCellValue("OutBroadcastTags");
        rowhead.createCell(31).setCellValue("InBroadcastTags");
        
        rowhead.createCell(32).setCellValue("owner");
        rowhead.createCell(33).setCellValue("issuer");
        rowhead.createCell(34).setCellValue("serialnumber");
        rowhead.createCell(35).setCellValue("algorithm");
        rowhead.createCell(36).setCellValue("bit");
        rowhead.createCell(37).setCellValue("version");
        rowhead.createCell(38).setCellValue("PA-Apps");
//        rowhead.createCell(39).setCellValue("PA-SMSandContactsApps");        
//        rowhead.createCell(39).setCellValue("possible-Inter-PA-Apps");
        rowhead.createCell(39).setCellValue("GoogleCDM-Found");
        rowhead.createCell(40).setCellValue("GoogleCDM-Captued");
        rowhead.createCell(41).setCellValue("GoogleCDM-ActuallyTransfered");
    	rowhead.createCell(42).setCellValue("Milliseconds");
    	
//        rowhead.createCell(16).setCellValue("BatchSize");
//        rowhead.createCell(17).setCellValue("BaseDirectory");
//        rowhead.createCell(18).setCellValue("InfectedSmaliFile");

//        rowhead.createCell(20).setCellValue("Apps");
        int count = 43;
        for (Map.Entry<String,Integer> entry : Perms.permsMap.entrySet()){
            rowhead.createCell(count).setCellValue(entry.getKey());
            count++;
        }

        rowcount = 1;
//        }
    }

    private static void addSharedUIDHead(HSSFSheet sheet) {
        HSSFRow rowhead = sheet.getRow(0);
        rowhead = sheet.createRow(0);
        rowhead.createCell(0).setCellValue("SharedUID");
        rowhead.createCell(1).setCellValue("App List");
    }

    private static void createCell(XSSFRow row, String value, String type) {
        XSSFCell cell = row.createCell(cellno);
        switch (type) {
            case "s":
                cell.setCellValue((String.valueOf(value)));
                break;
            case "n":
                cell.setCellValue(Integer.parseInt(value));
                break;
        }

        cellno++;
    }

    private static void createPendingIntentCell(XSSFRow row, String value, String type) {
        XSSFCell cell = row.createCell(_picellno);
        switch (type) {
            case "s":
                cell.setCellValue((String.valueOf(value)));
                break;
            case "n":
                cell.setCellValue(Integer.parseInt(value));
                break;
        }

        _picellno++;
    }

    public static void init() {
        xlsFilename = Env.basedir+ "Stats"+"_"+ Env.datetime + ".xlsx";

        File yourFile = new File(xlsFilename);

        try {
            yourFile.createNewFile();

            FileInputStream file = new FileInputStream(new File(xlsFilename));
            //Create Workbook instance holding reference to .xlsx file
//            XSSFWorkbook workbook = new XSSFWorkbook(file);

            String sheetname = "sheet";
            int sheetcount = 1;
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet(sheetname + sheetcount);
            addHead();
            FileOutputStream ostream = new FileOutputStream(yourFile);
            workbook.write(ostream);
            ostream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
