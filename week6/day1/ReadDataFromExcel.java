package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		//xssf-xml spreadsheet format
		//Step -1
		
	XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
	
	//step 2-go to sheet
	
	XSSFSheet sheet = wb.getSheetAt(0);
	
	//step3 - get row num
	int rowNum = sheet.getLastRowNum();
	
	System.out.println("Rows :"+rowNum);
	
	//include -header
	
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

	System.out.println("physicalNumberOfRows :"+physicalNumberOfRows);
	
	//cell count 
	
	int cellNum = sheet.getRow(1).getLastCellNum();
	System.out.println("cell :"+cellNum );
	
	//step 4- cell
XSSFRow row = sheet.getRow(1);
//System.out.println(row);
String stringCellValue = row.getCell(1).getStringCellValue();
System.out.println(stringCellValue);

//print all set of data

//row - 1
//cell- 0
for (int i = 1; i <=rowNum; i++) {
	
	XSSFRow row2 = sheet.getRow(i);
	
	for (int j = 0; j <cellNum; j++) {
		XSSFCell cell = row2.getCell(j);
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
	}
}
	//step6
wb.close();
	}

}
