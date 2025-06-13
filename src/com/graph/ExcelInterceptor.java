package com.graph;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.Main;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class ExcelInterceptor {
	static int zerothRow = 0;
	static int rowCount = 0;
	static int colCount = 0;
	// static Integer[] col2Remove = { 0, 2, 3, 4, 5, 6, 7, 17, 18, 20, 21, 22, 23,
	// 24, 25, 26, 27, 28, 29 };
	// static Integer[] col2Process = { 30, 31 };
	static List<DatasetObject> dataset = new ArrayList<>();
	static List<MalwareFamily> malwarefamily = new ArrayList<>();

	public static void main(String[] args) {

		try {
            File f = new File(ExcelInterceptor.class.getClassLoader().getResource("drebin_mal_family.csv").getPath());

			FileReader filereader0 = new FileReader(f);

			// create csvReader object and skip first Line
			CSVReader csvReader0 = new CSVReaderBuilder(filereader0).withSkipLines(1).build();
			
		    String[] line;
		    int col = 0;
		    while ((line = csvReader0.readNext()) != null) {
		    	col = 0;
		    	String sha256 = "";
		    	String family = "";
		    	for (String cell : line) {
		    		switch(col) {
		    		case 0:
		    			sha256 = cell;
		    			++col;
		    			continue;
		    		case 1:
		    			family = cell;
		    			++col;
		    			continue;
		    		}
		    	}
		    	MalwareFamily.family.put(sha256, family);
		    }
		    
		    filereader0.close();
		    csvReader0.close();

			
			// Create an object of file reader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(args[0]);

			// create csvReader object and skip first Line
			CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).build();
			String[] nextRecord;

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
				colCount = 0;
				DatasetObject d = new DatasetObject();

				for (String cell : nextRecord) {
					switch (colCount) {
					case 0:
						d.appName = cell;
						d.family = MalwareFamily.family.get(cell);					
						++colCount;
						continue;
					case 1:
						d.appPackageName = cell;
						Nodes.addNodes(d.appPackageName, d.family);
						Edges.addEdge(d.appPackageName, d.family);
						++colCount;
						continue;
					case 2:
						d.appName2 = cell;
						++colCount;
						continue;
					case 3:
						d.appSize = cell;
						++colCount;
						continue;
					case 4:
						d.noOfClz = cell;
						++colCount;
						continue;
					case 5:
						d.noOfMethods = cell;
						++colCount;
						continue;
					case 6:
						d.noOfIntents = cell;
						++colCount;
						continue;
					case 7:
						d.noOfPendingIntents = cell;
						++colCount;
						continue;
					case 8:
						d.FLAG_ONE_SHOT = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 9:
						d.FLAG_NO_CREATE = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 10:
						d.FLAG_CANCEL_CURRENT = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 11:
						d.FLAG_UPDATE_CURRENT = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 12:
						d.FLAG_IMMUTABLE = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 13:
						d.unsafePICreation = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 14:
						d.unsafeBroadcast = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 15:
						d.unsafePITransfer = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 16:
						d.NoOfProtectedBroadcast = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 17:
						d.UnsafeProtectedBroadcast = cell;
						++colCount;
						continue;
					case 18:
						d.TotalBroadcast = cell;
						++colCount;
						continue;
					case 19:
						d.SharedUIDLabel = cell;
						Edges.addEdge(d.appPackageName, cell);
						++colCount;
						continue;
					case 20:
						d.QuantifySUID = cell;
						++colCount;
						continue;
					case 21:
						d.TotalPermissions = cell;
						++colCount;
						continue;
					case 22:
						d.minSDKVersion = cell;
						++colCount;
						continue;
					case 23:
						d.targetSDKVersion = cell;
						++colCount;
						continue;
					case 24:
						d.TotActivities = cell;
						++colCount;
						continue;
					case 25:
						d.TotServices = cell;
						++colCount;
						continue;
					case 26:
						d.TotBroadcastReceivers = cell;
						++colCount;
						continue;
					case 27:
						d.TotExposedActivities = cell;
						++colCount;
						continue;
					case 28:
						d.TotExposedServices = cell;
						++colCount;
						continue;
					case 29:
						d.TotExposedBroadcastReceivers = cell;
						++colCount;
						continue;
					case 30:
						if (cell != null) {
							if (cell.contains(",")) {
								String[] outlist = cell.split(",");
								for (String s : outlist) {								
									d.OutBroadcastTags.add(s);
									Edges.addEdge(d.appPackageName, s);
								}
							}
						}
						++colCount;
						continue;
					case 31:
						if (cell != null) {
							if (cell.contains(",")) {
								String[] outlist = cell.split(",");
								for (String s : outlist) {
									if(s.equals("android.intent.action.MAIN"))
										continue;
									d.InBroadcastTags.add(s);
									Edges.addEdge(d.appPackageName, s);
								}
							}
						}
						++colCount;
						continue;
					default:
						if (cell != null) {
							if (!cell.isEmpty()) {
								d.permissions.add(cell);
								Edges.addEdge(d.appPackageName, cell);
							}
						}
						++colCount;
						continue;
					}
				}
				dataset.add(d);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		Nodes.generate();
		Edges.generate();
		
		System.out.println("DATASET>> "+dataset.size());
	}
}

// FileInputStream file;
// List<Integer> col2RemoveList = Arrays.asList(col2Remove);

// try {
// file = new FileInputStream(new File(args[0]));
// FileReader filereader = new FileReader(args[0]);
//
// CSVReader csvReader =
// new CSVReaderBuilder(reader).withSkipLines(1).build();
//
// XSSFWorkbook workbook = new XSSFWorkbook(file);
//
// XSSFSheet sheet = workbook.getSheetAt(0);
//
// Map<Integer, List<String>> data = new HashMap<>();
//
// for (Row row : sheet) {
// if (rowCount == 0) {
// rowCount++;
// continue;
// }
//
// data.put(rowCount, new ArrayList<String>());
//
// for (org.apache.poi.ss.usermodel.Cell cell : row) {
// DatasetObject dataset = new DatasetObject();
//
// if (col2RemoveList.contains(colCount)) {
// colCount++;
// continue;
// }
// switch (cell.getCellType()) {
// case STRING:
// System.out.print(cell.getStringCellValue() + ", ");
// break;
// case NUMERIC:
// System.out.print(cell.getNumericCellValue() + ", ");
// break;
// case BOOLEAN:
// System.out.print(cell.getBooleanCellValue() + ", ");
// break;
// case BLANK:
// System.out.print("_ , ");
// break;
// case _NONE:
// System.out.print(cell.getRichStringCellValue() + ", ");
// break;
// }
//
// colCount++;
// }
// colCount = 0;
// System.out.println();
// rowCount++;
// }
//
// } catch (FileNotFoundException e) {
// e.printStackTrace();
// } catch (IOException e) {
// e.printStackTrace();
// }
