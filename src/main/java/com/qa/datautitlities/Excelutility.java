package com.qa.datautitlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.qa.globals.Constants;

import org.apache.poi.ss.usermodel.Row;
//xssf for xlsx file but hssf for xls
public class Excelutility {
          
	private static MissingCellPolicy xRow;

	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;
	
	// Create a new Excel file
		public static void CreateExcelFile(String filePath, String fileName, String sheetName) throws IOException {
			File excelFile = new File(filePath + "\\" + fileName);
			// Assuming XLSX here. If XLS use HSSFWorkbook
			Workbook excelWorkbook = new XSSFWorkbook();
			
			// Create the sheet in the workbook
			Sheet sheet1 = excelWorkbook.createSheet(sheetName);
			
			//Create the row in the sheet
			Row row = sheet1.createRow(0);
			
			// Create cells in the row
			Cell cell = row.createCell(0);
			
			// Add cell value
			cell.setCellValue("Test123");
					
			// Now actually create the entire file
			FileOutputStream excelOutputStream = new FileOutputStream(excelFile);
			excelWorkbook.write(excelOutputStream);
			
			// Close our open objects
			excelOutputStream.close();
			excelWorkbook.close();
			
		}
		
		
		
		public static void log(String msg) {
			System.out.println(msg);
		}
		
		
		
		// Load Excel data from file
		/*public static void loadExcelData(String filePath, String fileName, String sheetName) throws IOException {
			File excelFile = new File(filePath + "\\" + fileName);
			FileInputStream excelInputStream = new FileInputStream(excelFile);
			Workbook excelWorkbook = null;

			// Assuming XLSX here. If XLS use HSSFWorkbook
			excelWorkbook = new XSSFWorkbook(excelInputStream);

			// Read the sheet inside the excel workbook
			Sheet excelSheet = excelWorkbook.getSheet(sheetName);

			// Get the number of rows
			int rowCount = excelSheet.getLastRowNum() - excelSheet.getFirstRowNum();

			// Read all the rows
			for (int i = 0; i <= rowCount; i++) {
				Row excelRow = excelSheet.getRow(i);

				/ Now we need to read all the cell (column) values in each row
				for (int j = 0; j < excelRow.getLastCellNum(); j++) {
					// Output value to the console for now
					log(excelRow.getCell(j).getStringCellValue());
					excelData.add(excelRow.getCell(j).getStringCellValue());
				}

			}*/

			/*// Close the file stream
			excelWorkbook.close();
			excelInputStream.close();

		}
    */
		
		//This method is to read the test data from the Excel sheet, in this we are passing parameters as Row num and Col num
		 
		public static String excelData(int rownum, int cellnum, int sheetnum) throws Exception {
			
			File src = new File(Constants.excelFilePath);	
			
			FileInputStream fis = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sh = wb.getSheetAt(sheetnum);
			
			String cellData = sh.getRow(rownum).getCell(cellnum).getStringCellValue();
		
			wb.close();
		
			return cellData;
		
		}
		
		
	   
	  //This method is to write in the Excel cell, Row num and Col num are the parameters
	    
		public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

   			try{

      			Row  = ExcelWSheet.getRow(RowNum);

				Cell = Row.getCell(ColNum, xRow.RETURN_BLANK_AS_NULL);

				if (Cell == null) {

					Cell = Row.createCell(ColNum);

					Cell.setCellValue(Result);

					} else {

						Cell.setCellValue(Result);

					}

      // Constant variables Test Data path and Test Data file name

      				FileOutputStream fileOut = new FileOutputStream("Constant.Path_TestData + Constant.File_TestData");

      				ExcelWBook.write(fileOut);

      				fileOut.flush();

						fileOut.close();

					}catch(Exception e){

						throw (e);

				}

			}

}

