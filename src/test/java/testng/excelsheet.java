package testng;
//workbook
//sheet
//Row
//Cell


import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelsheet {

	
/*	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {
	HSSFWorkbook workbook=new HSSFWorkbook();
	HSSFSheet sheet=workbook.createSheet();
	sheet.createRow(0);
	sheet.getRow(0).createCell(0).setCellValue("Hello");
	sheet.getRow(0).createCell(0).setCellValue("world");
	
	sheet.createRow(1);
	sheet.getRow(1).createCell(0).setCellValue("HYR");
	sheet.getRow(1).createCell(1).setCellValue("Tutorials");
	
	
	File file = new File("C:\\Users\\Robin\\eclipse-workspace\\testng\\ExcelFiles\\TesT.xlsx");
	//FileOutputStream fos=Fileoutputstream(file);
		
    workbook.write(file);
	workbook.close();
	
	}
	
	
	/*public static void main(String[] args) throws Exception {  //creating xssf sheet reading raw data into file n getting values...
	File file = new File("C:\\Users\\Robin\\eclipse-workspace\\testng\\ExcelFiles\\TesT.xlsx");
	FileOutputStream fos=Fileoutputstream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheetAt(0);
	String cellvalue=sheet.getRow(0).getcell(0).getstringcellvalue();
	System.out.println(cellvalue);
	workbook.close();
	fls.close();
	*/
	
 //to get the row and colum no dynamically and string cell value, numberic vales also,


	//int rowcount=sheet.getphysicalNumberofRows();
	
	/*for(int i=0; i<rowcount;i++) {
		XSSFRow row= sheet.getRow(i);
		
		int cellcount=row.getPhysicalNumberOfCells();
		for(int j=0; j<cellcount;j++);
		
		XSSFCell cell=row.getcell(j);
		String cellvalue=getcellvalue(j);
		System.out.println("||"+getcellvalue(cell));*/
	
	/*system.out.println();
		
	

		
workbook.close();
fis.close();



public static String getcellvalue(XSSFCell cell) {
	
	switch (cell.getCellType()) {
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
	case BOOLEAN:
		return String.valueOf(cell.getBooleanCellValue());
	case STRING:
		return String.valueOf(cell.getStringCellValue());
		default:
			return cell.getStringCellValue();
	}
}*/

}

		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	


