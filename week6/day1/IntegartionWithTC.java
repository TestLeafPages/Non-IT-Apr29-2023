package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class IntegartionWithTC {

	//static- common refference
	//static -should remain
	
	//step4
	public static String[][] readData(String fileName) throws IOException {
				
	XSSFWorkbook wb=new XSSFWorkbook("./data/"+fileName+".xlsx");
	
	XSSFSheet sheet = wb.getSheetAt(0);
	
	
	int rowNum = sheet.getLastRowNum();
	
	System.out.println("Rows :"+rowNum);
	
	
	int cellNum = sheet.getRow(1).getLastCellNum();
	
	//step 1-assign data
	String[][] data=new String[rowNum][cellNum];

for (int i = 1; i <=rowNum; i++) {
	
	XSSFRow row2 = sheet.getRow(i);
	
	for (int j = 0; j <cellNum; j++) {
		XSSFCell cell = row2.getCell(j);
		
		String data1 = cell.getStringCellValue();

		//step2-data provider -index-0
		//data[0][0]
		data[i-1][j]=data1;
		
	}
}

wb.close();
//step3
return data;
	}

}
