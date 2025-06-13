package com;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import grammar.SmaliLexer;
import grammar.SmaliParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.jf.baksmali.BaksmaliOptions;
import org.jf.baksmali.Adaptors.ClassDefinition;
import org.jf.baksmali.formatter.BaksmaliWriter;
import org.jf.dexlib2.DexFileFactory;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.MultiDexContainer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.projects.Project;
import com.utils.Env;
import com.utils.Perms;

import grammar.parser.Parser;
import net.dongliu.apk.parser.ApkFile;

public class Main {
	static List<String> whitel1;
	static List<String> whitel2;
	static List<File> listOfBatchfiles = new ArrayList<>();

	private static Document convertStringToXMLDocument(String xmlString) {
		// Parser that produces DOM object trees from XML content
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// API to obtain DOM Document instance
		DocumentBuilder builder = null;
		try {
			// Create DocumentBuilder with default configuration
			builder = factory.newDocumentBuilder();

			// Parse the content to Document object
			Document doc = null;
			if (!xmlString.isEmpty())
				doc = builder.parse(new InputSource(new StringReader(xmlString)));
			return doc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			// System.out.println("arguments missing [Folder of APKs]");
			return;
		}

		// String basedir = args[0];
		Env.basedir = args[0];
		Env.basedir = Env.basedir.replace("\"", "");
		// System.out.println(Env.basedir);
		String zipfolder = Env.basedir + File.separator + "ZipFolder";
		new File(zipfolder).mkdir();

		whitel1 = Arrays.asList(Env.whitelist1);
		whitel2 = Arrays.asList(Env.whitelist2);

		// Perms.fileReader = new
		// InputStreamReader(Main.class.getClassLoader().getResourceAsStream("permissionslist.txt"));
		File appDir = new File(System.getProperty("user.dir"));
		// System.out.println("appDir.toURI()>> "+appDir.toURI());
		URI uri;
		URI uri_processedhash;
		try {
			uri = new URI(appDir.toURI() + "permissionslist.txt");
			File f = new File(uri);
			Perms.fileReader = new FileReader(f);

			uri_processedhash = new URI(appDir.toURI() + "processedhash.txt");
			File f1 = new File(uri_processedhash);
			Perms.processedHashFileReader = new FileReader(f1);
		} catch (URISyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		}

		Perms.build();

		Env.init();

		walkForAPK(Env.basedir);
		//
		// File[] files = new File(Env.basedir).listFiles();
		// //System.out.println(Env.basedir);
		// List<File> fileset = Arrays.asList(files);
		// List<List<File>> batch = ListUtils.partition(fileset, Env.batchsize);
		//
		//
		// if (files != null) {
		// for (List<File> batches : batch) {
		// listOfBatchfiles = new ArrayList<>();
		// Env.stats.noOfProjects += Env.batchsize;
		// Env.projects = new LinkedHashMap<>();
		//
		// for (File file : batches) {
		// isAPK = true;
		// if (file.isFile()) {
		// if (!file.getName().endsWith(".apk")) {
		// isAPK = false;
		// continue;
		// }
		//
		// parseAPK(file);
		// }
		//
		// }//end 1
		//// if (isAPK)
		// smaliParser(Env.basedir);
		// }
		// }

		for (String s : Env.infectedSmaliFiles) {
			// System.out.println(s);
		}
	}

	public static void walkForAPK(String path) {

		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {
			if (f.isDirectory()) {
				continue;//walkForAPK(f.getAbsolutePath());
			} else {
				// System.out.println( "File:" + f.getAbsoluteFile() );
				listOfBatchfiles = new ArrayList<>();
				Env.stats.noOfProjects += Env.batchsize;
				Env.projects = new LinkedHashMap<>();
				isAPK = true;
				if (f.isFile()) {
					// if (!f.getName().endsWith(".apk")) {
					// isAPK = false;
					// continue;
					// }
					MessageDigest mdigest;
					try {
						mdigest = MessageDigest.getInstance("MD5");
						String checksum;
						checksum = checksum(mdigest, f);
						Env.checksum = checksum;
						if (checksum != null) {
							if (Perms.processedHashMap.containsKey(checksum)) {
								System.out.println("HASH EXISTS>> " + checksum);
								continue;
							}
							System.out.println("HASH DOES NOT EXISTS>> " + checksum);
						}
						System.out.println(checksum);
					} catch (IOException | NoSuchAlgorithmException e) {
						e.printStackTrace();
					}

					parseAPK(f);
					System.out.println(f.getAbsolutePath());
				}
				smaliParser(Env.basedir);
			}
		}

		// for (String s : Env.infectedSmaliFiles) {
		// // System.out.println("Infected Files>> "+s);
		// }
	}

	static boolean isAPK = true;
	static List<String> results = new ArrayList<String>();

	public static void parseAPK(File file) {
		Env.startTime = System.nanoTime();

		isAPK = true;
		Perms.build();
		// if (file.getName().endsWith(".apk")) {
		results.add(file.getName());
		String apkfilename = file.getName();
		String filenameNoExt;
		int dotIndex = apkfilename.lastIndexOf('.');
		if (dotIndex == -1)
			filenameNoExt = apkfilename;
		else
			filenameNoExt = apkfilename.substring(0, dotIndex);

		String pathname = Env.basedir + File.separator + filenameNoExt;
		File isApkDirExists = new File(pathname);

		// if (isApkDirExists.isDirectory()) {
		// if (isApkDirExists.length() > 0) {
		//// file.delete();
		// return;
		// } else {
		//// isApkDirExists.delete();
		// }
		// }
		// else{
		// new File(pathname).mkdir();
		// }

		try {
			Path path = Paths.get(file.getAbsolutePath());
			// String fullpathname = path.toString().replace(".apk", "");
			Env.activeFile = file;
			Env.activeprojectname = file.getName();
			String pathName; // = file.getName().replace(".apk", "");
			String fileName = file.getName();
			dotIndex = fileName.lastIndexOf('.');
			if (dotIndex == -1)
				pathName = fileName;
			else
				pathName = fileName.substring(0, dotIndex);

			String fullpathname = Env.basedir + File.separator + pathName;
			long bytes = Files.size(path);
			Env.activeprojectsize = bytes / 1024;

			listOfBatchfiles.add(new File(fullpathname));

			// long bytes = Files.size(path);
			// long kilobytes = (bytes / 1024);
			// long megabytes = (kilobytes / 1024);

			//// System.out.println("Processing > " + file.getName() + " : " + megabytes);
			MessageDigest mdigest;
			try {
				mdigest = MessageDigest.getInstance("MD5");
				String checksum = checksum(mdigest, file);
				Env.checksum = checksum;
				System.out.println(checksum);
			} catch (NoSuchAlgorithmException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				String manifestXml = "";
				ApkFile apkFile = null;
				try {
					apkFile = new ApkFile(file);
					if (apkFile != null) {
						manifestXml = apkFile.getManifestXml();
						if (apkFile.getApkMeta() != null) {
							Env.activePackageName = apkFile.getApkMeta().getPackageName();
							Env.activeName = apkFile.getApkMeta().getName();
						}
					}
				} catch (Exception ze) {
					System.out.println("MANIFEST NOT FOUND..");
					// Env.zipErrorFiles.add(file.getAbsolutePath());
					// try {
					// String newfilename = zipfolder + "\\"+file.getName();
					// FileUtils.copyFile(file, new File(newfilename));
					// } catch (IOException e) {
					// e.printStackTrace();
					// }

					// Junrar.extract(file, new File(Env.basedir));
					// apkFile = new ApkFile(file);
					// manifestXml = apkFile.getManifestXml();
				}

				BufferedWriter writer = new BufferedWriter(new FileWriter("maniestxml", true));
				writer.append(manifestXml);
				writer.close();

				ApkCertificates apkcertificate = new ApkCertificates(file);
				Env.apkcertificates.put(Env.activePackageName, apkcertificate);

				// System.out.println("MANIFEST>>> " + file.getName());
				String sharedUID = null;
				Document doc = convertStringToXMLDocument(manifestXml);
				if (doc != null) {
					doc.getDocumentElement().normalize();

					// Here comes the root node
					Element root = doc.getDocumentElement();
					sharedUID = root.getAttribute("android:sharedUserId");
					Env.sharedUID = sharedUID;
					Env.appname = file.getName();
					Env.addSharedUserIDs(sharedUID, file.getName());

					NodeList list = doc.getElementsByTagName("manifest");

					// root = doc.getDocumentElement();

					XPathFactory xFactory = XPathFactory.newInstance();
					XPath xPath = xFactory.newXPath();

					XPathExpression xExpresssdk = xPath.compile("/manifest/uses-sdk");
					NodeList nodessdk = (NodeList) xExpresssdk.evaluate(root, XPathConstants.NODESET);
					for (int index = 0; index < nodessdk.getLength(); index++) {
						Node node = nodessdk.item(index);
						if (node != null) {
							Env.minSDKVersion = "";
							Env.targetSDKVersion = "";
							if (node.getAttributes().getNamedItem("android:minSdkVersion") != null)
								Env.minSDKVersion = node.getAttributes().getNamedItem("android:minSdkVersion")
										.getNodeValue();
							if (node.getAttributes().getNamedItem("android:targetSdkVersion") != null)
								Env.targetSDKVersion = node.getAttributes().getNamedItem("android:targetSdkVersion")
										.getNodeValue();
						}
					}

					xExpresssdk = xPath.compile("/manifest/application/activity");
					nodessdk = (NodeList) xExpresssdk.evaluate(root, XPathConstants.NODESET);
					Env.totActivities = nodessdk.getLength();
					for (int index = 0; index < nodessdk.getLength(); index++) {
						Node node = nodessdk.item(index);
						Node exportedNode = node.getAttributes().getNamedItem("android:exported");
						NodeList nl = node.getChildNodes();
						if (nl != null) {
							if (nl.getLength() > 0) {
								for (int i = 0; i < nl.getLength(); i++) {
									if (nl.item(i).getNodeName().equals("intent-filter")) {
										NodeList nl1 = nl.item(i).getChildNodes();
										for (int j = 0; j < nl1.getLength(); j++) {
											if (nl1.item(j).getNodeName().equals("action")) {
												if(nl1.item(j).getAttributes() != null) {
													if(nl1.item(j).getAttributes().getNamedItem("android:name") != null) {
														String action = nl1.item(j).getAttributes().getNamedItem("android:name")
																.getNodeValue();
														if (exportedNode != null) {
															String value = exportedNode.getNodeValue();
															if (value.equals("true")) {
																Env.stats.inBroadcastTags.add(action);
															}
														}
													}
												}												
											}
										}
									}
								}
							}
						}
						if (exportedNode != null) {
							String value = exportedNode.getNodeValue();
							if (value.equals("true")) {
								Env.totExposedActivity++;
								continue;
							}
						}
						NodeList nlx = node.getChildNodes();
						if (nlx != null) {
							if (nlx.getLength() > 0) {
								// System.out.println(">> " + nlx.item(0).getNodeName());
								for (int i = 0; i < nlx.getLength(); i++) {
									if (nlx.item(i).getNodeName().equals("intent-filter")) {
										Env.totExposedActivity++;
										continue;
									}
								}
							}
						}
					}

					xExpresssdk = xPath.compile("/manifest/application/receiver");
					nodessdk = (NodeList) xExpresssdk.evaluate(root, XPathConstants.NODESET);
					Env.totReceiver = nodessdk.getLength();
					for (int index = 0; index < nodessdk.getLength(); index++) {
						Node node = nodessdk.item(index);
						Node exportedNode = node.getAttributes().getNamedItem("android:exported");
						NodeList nl = node.getChildNodes();
						if (nl != null) {
							if (nl.getLength() > 0) {
								for (int i = 0; i < nl.getLength(); i++) {
									if (nl.item(i).getNodeName().equals("intent-filter")) {
										NodeList nl1 = nl.item(i).getChildNodes();
										for (int j = 0; j < nl1.getLength(); j++) {
											if (nl1.item(j).getNodeName().equals("action")) {
												if(nl1.item(j).getAttributes().getNamedItem("android:name") != null) {
													String action = nl1.item(j).getAttributes().getNamedItem("android:name")
															.getNodeValue();
													Env.stats.inBroadcastTags.add(action);
												}												
											}
										}
									}
								}
							}
						}
						if (exportedNode != null) {
							String value = exportedNode.getNodeValue();
							if (value.equals("true")) {
								Env.totExposedReceiver++;
								continue;
							}
						}
						NodeList nlx = node.getChildNodes();
						if (nlx != null) {
							// System.out.println(nlx.getLength());
							if (nlx.getLength() > 0) {
								// System.out.println(">> " + nlx.item(0).getNodeName());
								for (int i = 0; i < nlx.getLength(); i++) {
									if (nlx.item(i).getNodeName().equals("intent-filter")) {
										Env.totExposedReceiver++;
										continue;
									}
								}
							}
						}
					}

					xExpresssdk = xPath.compile("/manifest/application/service");
					nodessdk = (NodeList) xExpresssdk.evaluate(root, XPathConstants.NODESET);
					Env.totService = nodessdk.getLength();
					for (int index = 0; index < nodessdk.getLength(); index++) {
						Node node = nodessdk.item(index);
						Node exportedNode = node.getAttributes().getNamedItem("android:exported");
						if (exportedNode != null) {
							String value = exportedNode.getNodeValue();
							if (value.equals("true")) {
								Env.totExposedService++;
								continue;
							}
						}
						NodeList nl = node.getChildNodes();
						if (nl != null) {
							// System.out.println(nl.getLength());
							if (nl.getLength() > 0) {
								// System.out.println(">> " + nl.item(0).getNodeName());
								for (int i = 0; i < nl.getLength(); i++) {
									if (nl.item(i).getNodeName().equals("intent-filter")) {
										Env.totExposedService++;
										continue;
									}
								}
							}
						}
					}

					XPathExpression xExpress = xPath.compile("/manifest/uses-permission");
					NodeList nodes = (NodeList) xExpress.evaluate(root, XPathConstants.NODESET);

					for (int index = 0; index < nodes.getLength(); index++) {
						boolean x = false;
						String permission = null;
						Node node = nodes.item(index);
						if (node != null)
							if (node.getAttributes() != null)
								if (node.getAttributes().getNamedItem("android:name") != null) {
									permission = node.getAttributes().getNamedItem("android:name").getNodeValue();

									if (permission != null)
										x = Perms.permsMap.containsKey(permission);
								}

						if (x == true) {
							if (permission != null)
								Perms.permsMap.put(permission, 1);
						} else {
							try {
								// XSSFRow rowhead = null;
								// XSSFSheet sheet = Env.workbook.getSheetAt(0);
								// rowhead = sheet.getRow(0);
								// int lastCellNum = rowhead.getLastCellNum();
								// if(lastCellNum < 15000)
								// rowhead.createCell(lastCellNum).setCellValue(permission);

								File appDir = new File(System.getProperty("user.dir"));
								// System.out.println("appDir.toURI()>> "+appDir.toURI());
								URI uri = new URI(appDir.toURI() + "permissionslist.txt");
								// System.out.println("appDir.toURI()2>> "+uri.toString());
								// InputStream is =
								// Main.class.getClassLoader().getResourceAsStream("/permissionslist.txt");
								// Reader targetReader = new InputStreamReader(is);

								File f = new File(uri);

								FileWriter fileReader = new FileWriter(f, true);
								BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
								Perms.permsMap.put(permission, 1);
								bufferedWriter.append(permission + "\n");
								bufferedWriter.flush();
								bufferedWriter.close();
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
						// System.out.println(permission + ">> " + Perms.permsMap.get(permission));
					}
				}
				// ////System.out.println(root.getNodeName());
				// ////System.out.println(root.getAttribute("android:sharedUserId"));
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}

			DexFile dexFile = null;
			try {
				MultiDexContainer<? extends DexBackedDexFile> multiDexContainer = DexFileFactory
						.loadDexContainer(new File(file.getAbsolutePath()), Opcodes.forApi(15));
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
										String whitelabel1 = null;
										for (String whitelabel : whitel1) {
											if (type.startsWith(whitelabel)) {
												whitelabel1 = whitelabel;
												pass = false;
												break;
											}
										}
										if (!pass) {
//											System.out.println("PASS 1 >> "+whitelabel1);
											continue;
										}

										pass = true;
										for (String whitelabel2 : whitel2) {
											if (type.contains(whitelabel2)) {
												whitelabel1 = whitelabel2;
												pass = false;
												break;
											}
										}
										if (!pass) {
//											System.out.println("PASS 2 >> "+whitelabel1);
											continue;
										}
									}
								} catch (Exception e) {
									System.out.println("Exception >> "+e);
									continue;
								}
							}

							// Iterable<? extends Method> methods = cd.getMethods();
							ClassDef classDef = cd;
							try {
								StringWriter stringWriter = new StringWriter();
								BaksmaliWriter writer = new BaksmaliWriter(stringWriter, classDef.getType());
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
								// newFileName = newFileName.replaceAll("/", "#");
								Env.createFile(folderPath, filename, pathname, stringWriter);
							} catch (Exception e) {
								continue;
							}

						}
					}
				}
			} catch (Exception ioe) {
				ioe.printStackTrace();
				return;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		if (!file.getName().endsWith(".xlsx")) {
			System.out.println("FILE NAME>>> " + file.getName());
			// if (file.delete()) {
			// System.out.println("Deleted the file: " + file.getName());
			// } else {
			// System.out.println("Failed to delete the file.");
			// }
		}

	}

	private static String checksum(MessageDigest digest, File file) throws IOException {
		// Get file input stream for reading the file
		// content
		FileInputStream fis = new FileInputStream(file);

		// Create byte array to read data in chunks
		byte[] byteArray = new byte[1024];
		int bytesCount = 0;

		// read the data from file and update that data in
		// the message digest
		while ((bytesCount = fis.read(byteArray)) != -1) {
			digest.update(byteArray, 0, bytesCount);
		}
		;

		// close the input stream
		fis.close();

		// store the bytes returned by the digest() method
		byte[] bytes = digest.digest();

		// this array of bytes has bytes in decimal format
		// so we need to convert it into hexadecimal format

		// for this we create an object of StringBuilder
		// since it allows us to update the string i.e. its
		// mutable
		StringBuilder sb = new StringBuilder();

		// loop through the bytes array
		for (int i = 0; i < bytes.length; i++) {

			// the following line converts the decimal into
			// hexadecimal format and appends that to the
			// StringBuilder object
			sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
		}

		// finally we return the complete hash
		return sb.toString();
	}

	private static void walk(String path) {
		File root = new File(path);
		File[] list = root.listFiles();

		if (list == null)
			return;

		for (File f : list) {
			if (f.isDirectory()) {
				// if(whitelistfolders.contains(f.getName())){
				// continue;
				// }
				String projectRootDir = f.getAbsolutePath();
				walk(f.getAbsolutePath());
			} else {
				if (f.getName().startsWith("R$") | f.getName().equals("R.smali")) {
					continue;
				}
				if (f.getName().startsWith("AndroidManifest.xml")) {
					// ////////System.out.println( "Manifest File:" + f.getAbsoluteFile() );
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

	static String[] whitelistFolderNames = { "android", "androidx", "google", "original", "res", "java", "javax",
			"jetbrains", "intellij", "kotlinx", "okhttp3", "assets", "kotlin", "unknown", "org", "META-INF",
			"jackson" };
	static List<String> whitelistfolders = new ArrayList<>();
	private static Project activeProject;
	static int totalNoOfFile = 0;
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

		// for (File file : listOfBatchfiles) {
		// try {
		// FileUtils.deleteDirectory(file);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// }
	}

	public static <T> Stream<List<File>> batches(List<File> source, int length) {
		if (length <= 0)
			throw new IllegalArgumentException("length = " + length);
		int size = source.size();
		if (size <= 0)
			return Stream.empty();
		int fullChunks = (size - 1) / length;
		return IntStream.range(0, fullChunks + 1)
				.mapToObj(n -> source.subList(n * length, n == fullChunks ? size : (n + 1) * length));
	}

	private static void smaliParser(String basedir) {
		// for(String s : whitelistFolderNames) {
		// whitelistfolders.add(s);
		// }
		////// System.out.println(basedir);
		File[] files = new File(basedir).listFiles();

		if (files != null) {
			totalNoOfFile = files.length;
			processFilesInBatches(files);
			Env.stats.statsAsExcel();
			//// System.out.println(Env.log.toString());
		}
	}

	private static void analyzeProjects() {

		// analyzeManifestXML();

		for (Map.Entry<String, Project> p : Env.projects.entrySet()) {
			{// parsing block
				Env.activeproject = p.getValue();
				Env.activeprojectname = p.getKey();

				List<File> smalifiles = Env.activeproject.getSmaliFiles();
				for (File f : smalifiles) {
					//////// System.out.println("Smalifile>> "+f.getAbsolutePath());

					String smalifilename = f.getAbsolutePath();
					Env.activeSmaliFileName = smalifilename;
					////// System.out.println(smalifilename);
					String encoding = "utf8";
					Charset charset = (encoding == null ? Charset.defaultCharset() : Charset.forName(encoding));
					CharStream charStream = null;
					try {
						charStream = CharStreams.fromPath(Paths.get(smalifilename), charset);
					} catch (IOException e) {
						e.printStackTrace();
					}

					SmaliLexer lexer = new SmaliLexer(charStream);// new ANTLRFileStream(smalifilename));
					lexer.removeErrorListeners();
					CommonTokenStream tokens = new CommonTokenStream(lexer);
					SmaliParser parser = new SmaliParser(tokens);
					parser.removeErrorListeners();
					ParseTree tree = parser.parse();
					ParseTreeWalker walker = new ParseTreeWalker();
					walker.walk(new Parser(), tree);
				}
				////// System.out.println("END");
			}
		}

	}
}
