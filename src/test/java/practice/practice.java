package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice {

	public static void main (String[]args) throws IOException

	{
		HSSFWorkbook wv=new HSSFWorkbook();
		HSSFSheet sheet=wv.createSheet("Test");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Radhe");
		sheet.getRow(0).createCell(0).setCellValue("Radhe");
		
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Radha");
		sheet.getRow(1).createCell(1).setCellValue("krishna");
		
		File fi=new File("C:\\Users\\Robin\\eclipse-workspace\\testng\\src\\test\\java\\Excel\\test.xls");
		//FileOutputStream sf=new FileOutputStream(fi);
		wv.write();
		wv.close();
		
		// to create the newer versrion of excel sheet

		XSSFWorkbook wv1=new XSSFWorkbook();
		XSSFSheet sheet1=wv1.createSheet("Test1");
		sheet1.createRow(0);
		sheet1.getRow(0).createCell(0).setCellValue("Radhe");
		sheet1.getRow(0).createCell(0).setCellValue("Radhe");
		
		sheet1.createRow(1);
		sheet1.getRow(1).createCell(0).setCellValue("Radha");
		sheet1.getRow(1).createCell(1).setCellValue("krishna");
		
		File fi1=new File("C:\\Users\\Robin\\eclipse-workspace\\testng\\src\\test\\java\\Excel\\test1.xlsx");
		//FileOutputStream sf1=new FileOutputStream(fi);
		wv1.write(null);
		wv1.close();

		
		
	}
	
}
