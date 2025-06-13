package com.utils;

import com.ApkCertificates;
import com.core.CLASS;
import com.core.METHOD;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.projects.Project;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tools.ant.util.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Stats {
	public int noOfProjects = 0;
	public int noOfClz = 0;
	public int noOfPendingIntents = 0;
	public int noOfOutputStreamObject = 0;
	public int noOfIntents = 0;
	public int noOfMethods = 0;
	public int FLAG_ONE_SHOT = 0;
	public int FLAG_NO_CREATE = 0;
	public int FLAG_CANCEL_CURRENT = 0;
	public int FLAG_UPDATE_CURRENT = 0;
	public int FLAG_IMMUTABLE = 0;
	public int paLocationApps = 0;
//	public int paContactsApps = 0;
//	public int possiblePAApps = 0;
	
	public int unsafeGoogleCDMFound = 0;
	public int unsafeGoogleCDMCreated = 0;
	public int unsafeGoogleCDMTransfered = 0;
	
//	public int paSMSApps = 0;
	// public int totalBroadcast = 0;
	// public String SharedUID = "";
	// public String SharedLabel = "";
	// public int totalSharedUID = 0;
	public int unsafeBroadcast = 0;
	public int totBroadcasts = 0;
	public int unsafePITransfer = 0;
	public int unsafePICreation = 0;
	public int unsafeProtectedBroadcast;
	public int noOfProtectedBroadcast;
	public int noOfPermissions = 0;
	// public List<String> apkPermissions = new ArrayList<>();
	// public LinkedHashMap<String, Integer> permsMap = new LinkedHashMap<>();

	public HashMap<String, List<String>> broadcast2flagMap = new HashMap<>();
	public List<String> allBroadcasts = new ArrayList<>();
	public List<String> allFlags = new ArrayList<>();
	public HashMap<String, List<String>> flag2fileMap = new HashMap<>();
	public List<String> unknownPIList = new ArrayList<>();
	public List<String> oneshotfiles = new ArrayList<>();
	public List<String> nocreatefiles = new ArrayList<>();
	public List<String> cancelcurrentfiles = new ArrayList<>();
	public List<String> updatecurrentfiles = new ArrayList<>();
	public List<String> immutablefiles = new ArrayList<>();
	public List<String> outBroadcastTags = new ArrayList<>();
	public List<String> inBroadcastTags = new ArrayList<>();

	public boolean incrementedUnsafePIRecently = false;

	public HashMap<String, List<String>> getBroadcast2flagMap() {
		return broadcast2flagMap;
	}

	public List<String> getBroadcast2flagMap(String key) {
		if (broadcast2flagMap.containsKey(key)) {
			return broadcast2flagMap.get(key);
		}
		return null;
	}

	public int totalFlagCount() {
		return FLAG_IMMUTABLE + FLAG_ONE_SHOT + FLAG_NO_CREATE + FLAG_CANCEL_CURRENT + FLAG_UPDATE_CURRENT;
	}

	public void setBroadcast2flagMap(String key) {
		if (broadcast2flagMap == null)
			broadcast2flagMap = new HashMap<>();
		if (!broadcast2flagMap.containsKey(key)) {
			List<String> flaglist = new ArrayList<>();
			broadcast2flagMap.put(key, flaglist);
		}
	}

	public void setBroadcast2flagMap(String key, String value) {
		if (broadcast2flagMap == null)
			broadcast2flagMap = new HashMap<>();
		if (broadcast2flagMap.containsKey(key)) {
			List<String> flaglist = broadcast2flagMap.get(key);
			flaglist.add(value);
		} else {
			List<String> flaglist = new ArrayList<>();
			flaglist.add(value);
			broadcast2flagMap.put(key, flaglist);
		}
	}

	public void setFlag2fileMap(String key) {
		if (flag2fileMap == null)
			flag2fileMap = new HashMap<>();
		if (!flag2fileMap.containsKey(key)) {
			List<String> filelist = new ArrayList<>();
			flag2fileMap.put(key, filelist);
		}
	}

	public void setFlag2fileMap(String key, String value) {
		if (flag2fileMap == null)
			flag2fileMap = new HashMap<>();
		if (flag2fileMap.containsKey(key)) {
			List<String> filelist = flag2fileMap.get(key);
			filelist.add(value);
		} else {
			List<String> filelist = new ArrayList<>();
			filelist.add(value);
			flag2fileMap.put(key, filelist);
		}
	}

	String fileName = "Stats";
	String xlsFilename = Env.basedir + System.getProperty("file.separator") + fileName + ".xlsx";
	XSSFSheet sheet = null;
	XSSFWorkbook workbook = new XSSFWorkbook();
	XSSFRow rowhead = null;
	FileOutputStream fileOut = null;
	int rowcount = 1;
	int cellno = 0;	
	

	public Stats() {
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet("Stats");
		// addHead();
	}

	public void statsAsExcel() {
		// cellno = 0;
		// SXSSFRow row = sheet.createRow(rowcount);
		// createCell(row, noOfProjects);
		// createCell(row, noOfClz);
		//// createCell(row, SharedUID);
		//// createCell(row, SharedLabel);
		//// createCell(row, totalBroadcast);
		// createCell(row, noOfPendingIntents);
		// createCell(row, noOfIntents);
		// createCell(row, noOfMethods);
		// createCell(row, FLAG_ONE_SHOT);
		// createCell(row, FLAG_NO_CREATE);
		// createCell(row, FLAG_CANCEL_CURRENT);
		// createCell(row, FLAG_UPDATE_CURRENT);
		// createCell(row, FLAG_IMMUTABLE);
		// createCell(row, unsafeBroadcast);
		// createCell(row, unsafePITransfer);
		//
		// rowcount++;

		writeToFile();

		initStatsEnvironment();
	}

	public void write() {
		if (Env.projects.size() > 0) {
			for (Map.Entry<String, Project> p : Env.projects.entrySet()) {
				// Env.stats.noOfProjects++;
				Project project = p.getValue();

				Iterator iterator = project.getActivities().entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry mapElement = (Map.Entry) iterator.next();
					String sourceFileName = (String) mapElement.getKey();

					List<CLASS> clz = (List<CLASS>) mapElement.getValue();
					noOfClz += clz.size();
					for (CLASS c : clz) {
						List<METHOD> methods = c.getMethods();
						noOfMethods += methods.size();
					}
				}
			}
			try {
				StatsPojo sp = new StatsPojo();
				FileInputStream myxls = new FileInputStream(new File(Env.xlsFilename));
				XSSFWorkbook workbook = new XSSFWorkbook(myxls);
				XSSFSheet sheet = workbook.getSheetAt(0);
				int lastRow = sheet.getLastRowNum();
				//// //System.out.println(lastRow);
				XSSFRow row = sheet.createRow(++lastRow);
				// createCell(row, noOfProjects);
				createCell(row, Env.checksum);
				createCell(row, Env.activePackageName);
				createCell(row, Env.activeName);
				createCell(row, Env.activeprojectsize);
				createCell(row, noOfClz);
				// if(noOfClz == 0){
				//
				// try {
				// String zipfolder = Env.basedir + "\\" + "ZipFolder" +
				// "\\"+Env.activeFile.getName();
				// FileUtils.copyDirectory(Env.activeFile, new File(zipfolder));
				// } catch (IOException e) {
				// e.printStackTrace();
				// }
				// }
				createCell(row, noOfMethods);
				createCell(row, noOfIntents);
				createCell(row, noOfPendingIntents);

				createStatsCellsAsNumbers(row, true);

				int quantifysuid = 0;
				if (Env.sharedUID != "")
					quantifysuid = 1;
				createCell(row, quantifysuid);

				int totPermissions = 0;
				for (Map.Entry<String, Integer> entry : Perms.permsMap.entrySet()) {
					totPermissions += entry.getValue();
				}
				;
				createCell(row, totPermissions);

				createCell(row, Env.minSDKVersion);
				createCell(row, Env.targetSDKVersion);

				createCell(row, Env.totActivities);
				createCell(row, Env.totService);
				createCell(row, Env.totReceiver);
				createCell(row, Env.totExposedActivity);
				createCell(row, Env.totExposedService);
				createCell(row, Env.totExposedReceiver);

				String outbrtags = "";
				for (String out : outBroadcastTags) {
					outbrtags += out + ",";
				}
				createCell(row, outbrtags);

				String inbrtags = "";
				for (String in : inBroadcastTags) {
					inbrtags += in + ",";
				}
				createCell(row, inbrtags);

				ApkCertificates apkcertificate = Env.apkcertificates.get(Env.activePackageName);
				createCell(row, apkcertificate.owner);
				createCell(row, apkcertificate.issuer);
				createCell(row, apkcertificate.serialnumber);
				createCell(row, apkcertificate.algorithm);
				createCell(row, apkcertificate.bit);
				createCell(row, apkcertificate.version);
				createCell(row, paLocationApps);
//				createCell(row, paContactsApps);				
//				createCell(row, possiblePAApps);
				createCell(row, unsafeGoogleCDMFound);
				createCell(row, unsafeGoogleCDMCreated);
				createCell(row, unsafeGoogleCDMTransfered);
				
				Env.endTime = System.nanoTime();
		    	Env.duration = (Env.endTime - Env.startTime);  //divide by 1000000 to get milliseconds.
		    	Long milliseconds = Env.duration/1000000;
		    	createCell(row, milliseconds);
		    	
				// createCell(row, Env.appname);
				Perms.permsMap.forEach((key, value) -> {
					if (value > 0)
						createCell(row, key);
					// createCell(row, value);
				});

				writePojo1();

				myxls.close();
				FileOutputStream output_file = new FileOutputStream(new File(Env.xlsFilename));
				// write changes
				workbook.write(output_file);
				output_file.flush();
				output_file.close();
				//// //System.out.println(" is successfully written");
				initStatsEnvironment();
			} catch (Exception e) {
				//System.out.println(e);
			} finally {
				Env.infectedSmaliFiles = new ArrayList<String>();
				Env.activeLineNos = new ArrayList<>();
			}
		}
	}

	private void createStatsCellsAsNumbers(XSSFRow row, boolean b) {
		if (b) {
			createCell(row, FLAG_ONE_SHOT);
			createCell(row, FLAG_NO_CREATE);
			createCell(row, FLAG_CANCEL_CURRENT);

			createCell(row, FLAG_UPDATE_CURRENT);

			createCell(row, FLAG_IMMUTABLE);

			createCell(row, unsafePICreation);

			createCell(row, unsafeBroadcast);

			createCell(row, unsafePITransfer);

			createCell(row, noOfProtectedBroadcast);
			createCell(row, unsafeProtectedBroadcast);
			createCell(row, totBroadcasts);

			// createCell(row, Env.activeLineNos);
			// String joined = StringUtils.join(Env.infectedSmaliFiles, ",");
			// createCell(row, joined);

			createCell(row, Env.sharedUID);
			return;
		}
		if (FLAG_ONE_SHOT > 0)
			createCell(row, "F1s");
		else
			createCell(row, "NO_F1s");

		if (FLAG_NO_CREATE > 0)
			createCell(row, "FNc");
		else
			createCell(row, "NO_FNc");

		if (FLAG_CANCEL_CURRENT > 0)
			createCell(row, "FCc");
		else
			createCell(row, "NO_FCc");

		if (FLAG_UPDATE_CURRENT > 0)
			createCell(row, "FUc");
		else
			createCell(row, "NO_FUc");

		if (FLAG_IMMUTABLE > 0)
			createCell(row, "FIm");
		else
			createCell(row, "NO_FIm");

		if (unsafePICreation > 0)
			createCell(row, "UnsafePiCreation");
		else
			createCell(row, "NO_UnsafePiCreation");

		if (unsafeBroadcast > 0)
			createCell(row, "unsafeBroadcast");
		else
			createCell(row, "NO_unsafeBroadcast");

		if (unsafePITransfer > 0)
			createCell(row, "unsafePITransfer");
		else
			createCell(row, "NO_unsafePITransfer");

		// createCell(row, FLAG_NO_CREATE);
		// createCell(row, FLAG_CANCEL_CURRENT);
		// createCell(row, FLAG_UPDATE_CURRENT);
		// createCell(row, FLAG_IMMUTABLE);
		// createCell(row, unsafePICreation);
		// createCell(row, unsafeBroadcast);
		// createCell(row, unsafePITransfer);
		if (noOfProtectedBroadcast > 0)
			createCell(row, "HasProtectedBroadcast");
		else
			createCell(row, "NO_ProtectedBroadcast");

		// createCell(row, noOfProtectedBroadcast);
		createCell(row, unsafeProtectedBroadcast);
		// createCell(row, noOfPermissions);
		createCell(row, totBroadcasts);

		// createCell(row, Env.activeLineNos);
		// String joined = StringUtils.join(Env.infectedSmaliFiles, ",");
		// createCell(row, joined);
		if (Env.sharedUID != "")
			createCell(row, Env.sharedUID);
		else
			createCell(row, "NO_sharedUID");

		// createCell(row, Env.sharedUID);
	}

	public void writePojo1() {
		//System.out.println("WRITE TO POJO>>");
		if (Env.activeprojectname != null)
			if (!Env.activeprojectname.equals("null"))
				if (noOfClz > 0) {
					StatsPojo1 sp = new StatsPojo1();
					sp.stats.add(Env.activeprojectname);
					sp.stats.add(Env.activePackageName);
					sp.stats.add(Env.activeName);
					sp.stats.add(String.valueOf(Env.activeprojectsize));
					sp.stats.add(String.valueOf(noOfClz));
					sp.stats.add(String.valueOf(noOfMethods));
					sp.stats.add(String.valueOf(noOfIntents));
					sp.stats.add(String.valueOf(noOfPendingIntents));
					sp.stats.add(String.valueOf(FLAG_ONE_SHOT));
					sp.stats.add(String.valueOf(FLAG_NO_CREATE));
					sp.stats.add(String.valueOf(FLAG_CANCEL_CURRENT));
					sp.stats.add(String.valueOf(FLAG_UPDATE_CURRENT));
					sp.stats.add(String.valueOf(FLAG_IMMUTABLE));
					sp.stats.add(String.valueOf(unsafePICreation));
					sp.stats.add(String.valueOf(unsafeBroadcast));
					sp.stats.add(String.valueOf(unsafePITransfer));
					sp.stats.add(String.valueOf(noOfProtectedBroadcast));
					sp.stats.add(String.valueOf(unsafeProtectedBroadcast));
					sp.stats.add(String.valueOf(totBroadcasts));

					int quantifysuid = 0;
					if (Env.sharedUID != "")
						quantifysuid = 1;
					sp.stats.add(String.valueOf(quantifysuid));

					int totPermissions = 0;
					for (Map.Entry<String, Integer> entry : Perms.permsMap.entrySet()) {
						totPermissions += entry.getValue();
					}
					;
					sp.stats.add(String.valueOf(totPermissions));

					sp.stats.add(String.valueOf(Env.minSDKVersion));
					sp.stats.add(String.valueOf(Env.targetSDKVersion));

					sp.stats.add(String.valueOf(Env.totActivities));
					sp.stats.add(String.valueOf(Env.totService));
					sp.stats.add(String.valueOf(Env.totReceiver));
					sp.stats.add(String.valueOf(Env.totExposedActivity));
					sp.stats.add(String.valueOf(Env.totExposedService));
					sp.stats.add(String.valueOf(Env.totExposedReceiver));

					String outbrtags = "";
					for (String out : outBroadcastTags) {
						outbrtags += out + ",";
					}
					sp.stats.add(String.valueOf(outbrtags));

					String inbrtags = "";
					for (String in : inBroadcastTags) {
						inbrtags += in + ",";
					}
					sp.stats.add(String.valueOf(inbrtags));

					Perms.permsMap.forEach((key, value) -> {
						sp.stats.add(String.valueOf(value));
					});

					// Creating Object of ObjectMapper define in Jakson Api
					ObjectMapper Obj = new ObjectMapper();

					try {
						// get Organisation object as a json string
						Env.convertedJson = Obj.writeValueAsString(sp);
						//System.out.println(Env.convertedJson);
						// Displaying JSON String
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
	}

	public void writePojo() {
		//System.out.println("WRITE TO POJO>>");
		if (Env.activeprojectname != null)
			if (!Env.activeprojectname.equals("null")) {
				StatsPojo sp = new StatsPojo();
				sp.activeprojectname = Env.activeprojectname;
				sp.activePackagename = Env.activePackageName;
				sp.activeName = Env.activeName;
				sp.activePackagename = Env.activePackageName;
				sp.activeprojectsize = Env.activeprojectsize;
				sp.noOfClz = noOfClz;
				sp.noOfMethods = noOfMethods;
				sp.noOfIntents = noOfIntents;
				sp.noOfPendingIntents = noOfPendingIntents;
				sp.FLAG_ONE_SHOT = FLAG_ONE_SHOT;
				sp.FLAG_NO_CREATE = FLAG_NO_CREATE;
				sp.FLAG_CANCEL_CURRENT = FLAG_CANCEL_CURRENT;
				sp.FLAG_UPDATE_CURRENT = FLAG_UPDATE_CURRENT;
				sp.FLAG_IMMUTABLE = FLAG_IMMUTABLE;
				sp.unsafePICreation = unsafePICreation;
				sp.unsafeBroadcast = unsafeBroadcast;
				sp.unsafePITransfer = unsafePITransfer;
				sp.noOfProtectedBroadcast = noOfProtectedBroadcast;
				sp.unsafeProtectedBroadcast = unsafeProtectedBroadcast;
				sp.totBroadcasts = totBroadcasts;

				int quantifysuid = 0;
				if (Env.sharedUID != "")
					quantifysuid = 1;
				sp.quantifysuid = quantifysuid;

				int totPermissions = 0;
				for (Map.Entry<String, Integer> entry : Perms.permsMap.entrySet()) {
					totPermissions += entry.getValue();
				}
				;
				sp.totPermissions = totPermissions;

				sp.minSDKVersion = Env.minSDKVersion;
				sp.targetSDKVersion = Env.targetSDKVersion;

				sp.totActivities = Env.totActivities;
				sp.totService = Env.totService;
				sp.totReceiver = Env.totReceiver;
				sp.totExposedActivity = Env.totExposedActivity;
				sp.totExposedService = Env.totExposedService;
				sp.totExposedReceiver = Env.totExposedReceiver;
				sp.permsMap.putAll(Perms.permsMap);

				//System.out.println(">>>>>>>>>>>1>" + Env.convertedJson);
				//System.out.println("))))))))))" + sp.toString());

				// Creating Object of ObjectMapper define in Jakson Api
				ObjectMapper Obj = new ObjectMapper();

				try {
					// get Organisation object as a json string
					Env.convertedJson = Obj.writeValueAsString(sp);

					// Displaying JSON String
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}

	public void writeToFile() {
		//System.out.println("WRITE TO FILE>>");
//		for(Map.Entry<String, METHOD> m : Env.methodreport.entrySet()) {
//			System.out.println(m.getKey() + ":>>>>>> "+ m.getValue().isVulnerable());
//		}
		
//		System.out.println("---------------------------------");
		
		outer:
		for(String s : Env.paInfectedPoints) {
			for(Map.Entry<String, List<String>> m : Env.instruction2methodReferenceMap.entrySet()) {
				if(m.getKey().equals(s)) {
					for(Map.Entry<String, METHOD> n : Env.methodreport.entrySet()) {
						if(n.getKey().equals(s)) {
							if(n.getValue().isVulnerable()) {
								System.out.println(n.getKey() + ":>>>>>> "+ n.getValue().isVulnerable());
								System.out.println("INTO stats(paInfectedPoints) - 1 ");
								System.out.println(n.getKey()+"\t"+n.getValue().toString());
								
								paLocationApps++;
//								Env.stats.possiblePAApps++;
//								System.out.println("STATS>> "+Env.stats.paLocationApps);
								break outer;
							}
							else {
								List<String> val = m.getValue();
								for(String v : val) {
									for(Map.Entry<String, METHOD> n1 : Env.methodreport.entrySet()) {
										if(n1.getKey().equals(v)) {
											if(n1.getValue().isVulnerable()) {
												System.out.println(n.getKey() + ":>>>>>> "+ n.getValue().isVulnerable());
												System.out.println("INTO stats(paInfectedPoints) - 2 ");
												System.out.println(n1.getKey()+"\t"+n1.getValue().toString());

												paLocationApps++;
//												Env.stats.possiblePAApps++;
//												System.out.println("STATS>> "+Env.stats.paLocationApps);
												break outer;
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
		
		write();
		// try {
		// String statsFilename = Env.basedir + System.getProperty("file.separator") +
		// "Stats" + "_" + Env.datetime + ".txt";
		// BufferedWriter writer = null;
		// writer = new BufferedWriter(new FileWriter(statsFilename));
		// writer.write(this.toString());
		// writer.close();
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		for(String s: Env.infectedSmaliFiles) {
        	//System.out.println("Infected Files>> "+s);
        }
	}

	void initStatsEnvironment() {
		cellno = 0;
		noOfProjects = 0;
		noOfClz = 0;
		noOfPendingIntents = 0;
		noOfIntents = 0;
		noOfMethods = 0;
		FLAG_ONE_SHOT = 0;
		FLAG_NO_CREATE = 0;
		FLAG_CANCEL_CURRENT = 0;
		FLAG_UPDATE_CURRENT = 0;
		FLAG_IMMUTABLE = 0;
		unsafeBroadcast = 0;
		unsafePITransfer = 0;
		unsafePICreation = 0;
		unsafeProtectedBroadcast = 0;
		noOfPermissions = 0;
		noOfProtectedBroadcast = 0;
		totBroadcasts = 0;
		paLocationApps = 0;
//		possiblePAApps = 0;
		unsafeGoogleCDMFound = 0;
		unsafeGoogleCDMCreated = 0;
		unsafeGoogleCDMTransfered = 0;
		
		Env.minSDKVersion = "";
		Env.targetSDKVersion = "";
		Env.totActivities = 0;
		Env.totReceiver = 0;
		Env.totService = 0;

		Env.totExposedActivity = 0;
		Env.totExposedReceiver = 0;
		Env.totExposedService = 0;

	    Env.convertedJson = new String();
	    Env.activePackageName = new String();
	    Env.methodreport = new HashMap<>();
	    Env.instruction2methodReferenceMap = new HashMap<>();
	    Env.paInfectedPoints = new ArrayList<>();
	    Env.isMethodVulnerable  = false;
	    Env.zipErrorFiles = new ArrayList();
	    Env.hs = new ArrayList<>();
	    Env.rMap = new HashMap<>(); //registry -to- position mapping
	    Env.activeLineNos = new ArrayList<>();
	    Env.infectedSmaliFiles = new ArrayList<>();
	    Env.apkcertificates = new HashMap<>();
	    
		broadcast2flagMap = new HashMap<>();
		outBroadcastTags = new ArrayList<>();
		inBroadcastTags = new ArrayList<>();
		allFlags = new ArrayList<>();
		// apkPermissions = new ArrayList<>();
		// permsMap = new LinkedHashMap<>();
	}

	void createCell(XSSFRow row, int value) {
		XSSFCell cell = row.createCell(cellno);
		cell.setCellValue(value);
		cellno++;
	}

	void createCell(XSSFRow row, long value) {
		XSSFCell cell = row.createCell(cellno);
		cell.setCellValue(value);
		cellno++;
	}

	void createCell(XSSFRow row, List<Integer> value) {
		XSSFCell cell = row.createCell(cellno);
		cell.setCellValue(StringUtils.join(value, ","));
		cellno++;
	}

	void createCell(XSSFRow row, String value) {
		XSSFCell cell = row.createCell(cellno);
		cell.setCellValue(value);
		cellno++;
	}
	// void createCell(SXSSFRow row, String value){
	// SXSSFCell cell = row.createCell(cellno);
	// cell.setCellValue(value);
	// cellno++;
	// }

	@Override
	public String toString() {
		return "Stats{" + "noOfProjects=" + noOfProjects + ", noOfClz=" + noOfClz + ", noOfPendingIntents="
				+ noOfPendingIntents + ", noOfIntents=" + noOfIntents + ", noOfMethods=" + noOfMethods
				+ ", FLAG_ONE_SHOT=" + FLAG_ONE_SHOT + ", FLAG_NO_CREATE=" + FLAG_NO_CREATE + ", FLAG_CANCEL_CURRENT="
				+ FLAG_CANCEL_CURRENT + ", FLAG_UPDATE_CURRENT=" + FLAG_UPDATE_CURRENT + ", FLAG_IMMUTABLE="
				+ FLAG_IMMUTABLE + ", unsafeBroadcast=" + unsafeBroadcast + ", unsafePITransfer=" + unsafePITransfer
				+ ", unsafePICreation=" + unsafePICreation + ", broadcast2flagMap=" + broadcast2flagMap
				+ ", allBroadcasts=" + allBroadcasts + ", allFlags=" + allFlags + ", flag2fileMap=" + flag2fileMap
				+ ", unknownPIList=" + unknownPIList + ", oneshotfiles=" + oneshotfiles + ", nocreatefiles="
				+ nocreatefiles + ", cancelcurrentfiles=" + cancelcurrentfiles + ", updatecurrentfiles="
				+ updatecurrentfiles + ", immutablefiles=" + immutablefiles + ", incrementedUnsafePIRecently="
				+ incrementedUnsafePIRecently + ", fileName='" + fileName + '\'' + ", xlsFilename='" + xlsFilename
				+ '\'' + ", sheet=" + sheet + ", workbook=" + workbook + ", rowhead=" + rowhead + ", fileOut=" + fileOut
				+ ", rowcount=" + rowcount + ", cellno=" + cellno + '}';
	}

	// private void addHead() {
	// rowhead = sheet.createRow(0);
	// rowhead.createCell(0).setCellValue("noOfProjects");
	// rowhead.createCell(1).setCellValue("noOfClz");
	// rowhead.createCell(2).setCellValue("noOfMethods");
	// rowhead.createCell(3).setCellValue("noOfIntents");
	// rowhead.createCell(4).setCellValue("noOfPendingIntents");
	// rowhead.createCell(5).setCellValue("FLAG_ONE_SHOT");
	// rowhead.createCell(6).setCellValue("FLAG_NO_CREATE");
	// rowhead.createCell(7).setCellValue("FLAG_CANCEL_CURRENT");
	// rowhead.createCell(8).setCellValue("FLAG_UPDATE_CURRENT");
	// rowhead.createCell(9).setCellValue("FLAG_IMMUTABLE");
	// rowhead.createCell(10).setCellValue("unsafeBroadcast(PubBR)");
	// rowhead.createCell(11).setCellValue("unsafePICreation(VulPI)");
	// rowhead.createCell(12).setCellValue("unsafePiWR(VulWR)");
	// rowhead.createCell(13).setCellValue("NoOfProtectedBroadcast");
	// rowhead.createCell(14).setCellValue("UnsafeProtectedBroadcast");
	// rowhead.createCell(15).setCellValue("TotalBroadcast");
	//
	// rowhead.createCell(16).setCellValue("Infected LineNos");
	// rowhead.createCell(17).setCellValue("Infected Project");
	// rowhead.createCell(18).setCellValue("Infected Smalifiles");
	// }
}
