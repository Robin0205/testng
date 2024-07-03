package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class configur {

	public static void main(String[] args) throws IOException {

		ExtentReports ex = new ExtentReports();
		File fi = new File("report.html");

		ExtentSparkReporter spark = new ExtentSparkReporter(fi);
		//ExtentSparkReporterConfig config = spark.config();
		
		
		
		// we can load these entire data in the form of son or xml by using the load method in extentsparkreporterconfig
		
		
		spark.loadXMLConfig(new File("./src/test/resources/exreports-config-xml")); //for xml
		
         //spark.loadJSONConfig(new File("./src/test/resources/exreports-config-json")); //for json
         ex.attachReporter(spark);
		
		/*spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("Report Name");
		spark.config().setDocumentTitle("Doc Title");
		spark.config().setTimeStampFormat("dd-mm-yy hh:mm:ss");*/
		
		
		
		   ex.createTest("test1","test desciption")           //return type of createtest is extentreports in dat 3 methods are there by using that we can assign values of category,author,and device.
	       .assignAuthor("yadagiri")
	       .assignCategory("smoke")
	       .assignDevice("chrome 99")
	       .pass("this is a passed test");
		
		
		

		ex.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}

}
