package exreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	
	
static WebDriver driver;
	
	public static void main (String[]argas) throws IOException, InterruptedException {
	
	
	ExtentReports ex = new ExtentReports();
	File fi = new File("report.html");
	ExtentSparkReporter spark = new ExtentSparkReporter(fi);
	ex.attachReporter(spark);
	
	WebDriverManager.chromiumdriver().setup();
	driver=new ChromeDriver();
	Thread.sleep(3000);
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	String base64=capturescreenshot();
   String path=capturescreenshot("Google.png");
   
	 ex.createTest("screenshot based test 1","This is for attaching screenshot to the test at test level ")  //test name and test description
	.info("this is a info msg")
	.addScreenCaptureFromBase64String(base64);
	 
	 ex.createTest("screenshot based test 2","This is for attaching screenshot to the test at test level ")  //test name and test description
		.info("this is a info msg")
		.addScreenCaptureFromBase64String(base64,"Googlehome1.png")
		.addScreenCaptureFromBase64String(base64,"Googlehome2.png")
	 .addScreenCaptureFromBase64String(base64,"Googlehome3.png")
	 .addScreenCaptureFromBase64String(base64,"Googlehome4.png")
	 .addScreenCaptureFromBase64String(base64,"Googlehome5.png")
	 .addScreenCaptureFromBase64String(base64,"Googlehome6.png");
	 

	 
	 ex.createTest("screenshot  test 3","This is for attaching screenshot to the test at test level ")  //test name and test description
		.info("this is a info msg")
		.addScreenCaptureFromPath(path);

	 
	 ex.createTest("screenshot  test 4","This is for attaching screenshot to the test at test level ")  //test name and test description
	  .info("this is a info msg")
	 .addScreenCaptureFromPath(path,"Googlehome1.png")
	 .addScreenCaptureFromPath(path,"Googlehome2.png")
	 . addScreenCaptureFromPath(path,"Googlehome3.png")
	 .addScreenCaptureFromPath(path,"Googlehome4.png")
	 .addScreenCaptureFromPath(path,"Googlehome5.png")
	 .addScreenCaptureFromPath(path,"Googlehome6.png");
	 
ex.createTest("screenshot test 5","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build())
.fail( MediaEntityBuilder.createScreenCaptureFromBase64String(base64,"google home page").build());
	 
ex.createTest("screenshot test 6","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( MediaEntityBuilder.createScreenCaptureFromPath(path).build())
.fail( MediaEntityBuilder.createScreenCaptureFromPath(path,"google home page").build());

ex.createTest("screenshot test 7","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( "this is a info msg",MediaEntityBuilder.createScreenCaptureFromBase64String(base64).build())
.fail( "this is a info msg",MediaEntityBuilder.createScreenCaptureFromBase64String(base64,"google home page").build());

ex.createTest("screenshot test 8","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( "this is a info msg",MediaEntityBuilder.createScreenCaptureFromPath(path).build())
.fail( "this is a info msg",MediaEntityBuilder.createScreenCaptureFromPath(path,"google home page").build());
	 
Throwable t=new Throwable("This is a throwable exception");

ex.createTest("screenshot test 9","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( t,MediaEntityBuilder.createScreenCaptureFromPath(path).build())
.fail( t,MediaEntityBuilder.createScreenCaptureFromPath(path,"google home page").build());
	 

ex.createTest("screenshot test 10","this is for attaching screenshot for test at test level ")  //over riding methods
.info("this is a info msg")
.fail( t,MediaEntityBuilder.createScreenCaptureFromPath(path).build())
.fail( t,MediaEntityBuilder.createScreenCaptureFromPath(path,"google home page").build());
	 

	 
	
	ex.flush();
	driver.quit();
	Desktop.getDesktop().browse(new File("report.html").toURI());
	
	}
	
     public static String  capturescreenshot ( )
	
	{
		TakesScreenshot ts1=(TakesScreenshot)driver;
		String base64=ts1.getScreenshotAs(OutputType.BASE64);
		System.out.println("screenshot saved sucessfully");
		return base64;
		
	}


	public static String  capturescreenshot (String filename)
	
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screernshot/"+filename);
		
		try {
			FileUtils.copyFile(src, dst);	
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("screenshot saved sucessfully");
		return dst.getAbsolutePath();
		
	}
	


}

