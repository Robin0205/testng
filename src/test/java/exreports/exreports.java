package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class exreports {
	
	public static void main (String[]args) throws IOException
	{
		
		ExtentReports ex=new ExtentReports();     //it is report engine that creates the extent reports
		File fi=new File("report.html");
		//ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\Robin\\eclipse-workspace\\testng\\report.html"); //all the reposrts are stored in this location
		ExtentSparkReporter spark=new ExtentSparkReporter(fi);
		//ExtentSparkReporter spark=new ExtentSparkReporter("report.html");   //to open file directly in a automated way
		ex.attachReporter(spark);  //we are attaching type of the reporter to the report engine
		
		
		// adding log to the test by using only methods
		ExtentTest test1=ex.createTest("test 1");
		test1.pass("This is a passed test");
		
		// adding log to the test by using only status methods
		ExtentTest test2=ex.createTest("test 2");
		test2.log(Status.FAIL, "This is a failed test");
		
		ex.createTest("test 3").skip("this is a skipped test");     //Method chaininh process
		ex.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());  //to open file directly in browser in a automated way
		
		
	}
	
	

}
