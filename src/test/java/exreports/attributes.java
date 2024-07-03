package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class attributes {

	public static void main(String[] args) throws IOException {

		ExtentReports ex = new ExtentReports();
		File fi = new File("report.html");
		ExtentSparkReporter spark = new ExtentSparkReporter(fi);
		ex.attachReporter(spark);
		
		ex.createTest("test1","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
       .assignAuthor("yadagiri")
       .assignCategory("smoke")
       .assignDevice("chrome 99")
       .pass("this is a passed test");
		
		   ex.createTest("test 2","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("john")
	       .assignCategory("regression")
	       .assignDevice("edge 110")
	       .fail("this is a failed test");
		   
		   
		   ex.createTest("test 3","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("jack")
	       .assignCategory("smoke")
	       .assignDevice("chrome 99")
	       .skip("this is a skipped test");
		   
		   
		   ex.createTest("test 4","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("rebaca")
	       .assignCategory("regression")
	       .assignDevice("firefox 100")
	       .pass("this is a passed test");
		   
		   //we can  assign muliple attributes to one test case also
		   
		   ex.createTest("test 5","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("rebaca")
	       .assignAuthor("yadigiri")
	       .assignAuthor("john")
	       .assignAuthor("nike")
	       .assignCategory("regression")
	       .assignCategory("smoke")
	       .assignCategory("sanity")
	       .assignDevice("firefox 100")
	       .assignDevice("edge 101")
	       .assignDevice("chrome 102")
	       .fail("this is a failed test");
		   
		   ex.createTest("test 6","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("rebaca")
	       .assignAuthor("john")
	       .assignAuthor("nike")
	       .assignCategory("regression")
	       .assignCategory("sanity")
	       .assignCategory("smoke")
	       .assignDevice("firefox 100")
	       .assignDevice("chrome 99")
	       .assignDevice("edge 102")
	       .skip("this is a skipped test");
		   
		   
		   //we can pass multiple author,device,category by using staring array method
		   
		   
		   ex.createTest("test 7","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("rebaca","john","nike","yadagiri")
	       .assignCategory(new String[] {"sanity","smoke","regression"})
	       .assignDevice("edge 102","chrome 110","firefox 102","ie 115")
	       .pass("this is a passed test");

			
		
		ex.flush();
		
		Desktop.getDesktop().browse(new File("report.html").toURI());
		
		
	}

}
