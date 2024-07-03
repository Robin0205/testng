package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class failedts {

	public static void main(String[] args) throws IOException {
		
		ExtentReports ex = new ExtentReports();
		ExtentSparkReporter sparkall = new ExtentSparkReporter("alltests.html");
		ExtentSparkReporter sparkfailed = new ExtentSparkReporter("failedtest.html");
		ExtentSparkReporter sparkskippedandwarning = new ExtentSparkReporter("skippedwaningtest.html");
		
        sparkfailed.filter().statusFilter().as(new Status[] {Status.FAIL}).apply();
		ex.attachReporter(sparkall,sparkfailed,sparkskippedandwarning);
		

		sparkskippedandwarning.filter().statusFilter().as(new Status[] {Status.SKIP,Status.WARNING}).apply();
		ex.attachReporter(sparkall,sparkfailed,sparkskippedandwarning);
		
		

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
	       .warning("this is a warning test");
		   
		   
		   //we can pass multiple author,device,category by using staring array method
		   
		   
		   ex.createTest("test 7","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("rebaca","john","nike","yadagiri")
	       .assignCategory(new String[] {"sanity","smoke","regression"})
	       .assignDevice("edge 102","chrome 110","firefox 102","ie 115")
	       .pass("this is a passed test");

		    Throwable t=new RuntimeException("This is a customized exception");
		    ex.createTest("Exception test2").fail(t);
			
		
		ex.flush();
		
		Desktop.getDesktop().browse(new File("alltests.html").toURI());
		Desktop.getDesktop().browse(new File("failedtest.html").toURI());
		Desktop.getDesktop().browse(new File("skippedwaningtest.html").toURI());


		
		
		
	





	}

}
