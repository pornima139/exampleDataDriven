package utility_all;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestDataExcelReader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowCount = 0;
	static int colCount = 0;
	static String excelpath=null;
	static String sheetName=null;

	public TestDataExcelReader(String excelpath, String sheetName) throws Exception {
			
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);
	}
	public static int getRowCount() {
		rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("row count= " + rowCount);
		return rowCount;
	}

	public static int getColCount() {
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("row count= " + colCount);
		return colCount;
	}

	public static String getCelldataString(int rowNum, int colNum) {
		String cellData = null;
		cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellData);
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int colNum) {
		double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellData);
	}

	static public Object[][] testData(String excelpath, String sheetName) throws Exception {
		
		TestDataExcelReader read=new TestDataExcelReader(excelpath, sheetName);
		
		int RC = read.getRowCount();
		int CC = read.getColCount();

		Object data[][] = new Object[RC - 1][CC];
		for (int i = 1; i < RC; i++) {
			for (int j = 0; j < CC; j++) {
				String CD = read.getCelldataString(i, j);
				System.out.println(CD + " | ");
				data[i - 1][j] = CD;
			}
		}
		return data;
	}

//	public static void main(String[] args) {
//		
//		getRowCount();
//		getColCount();
//		getCelldataString(0, 0);
//		getCellDataNumber(1, 1);
//	}
	
//		

}
