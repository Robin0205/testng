package intrgration;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

/*----------------Itestcontext dependency-------------
 * It is a native dependency context injection in a TestNG ,not a reflection one
 * Addinf parameter context to the method , while execution in the run time TestNG will insert value for this variable.
 * We are adding because to read the testname from xml file in dynamic way we are creating this variable.
 * 
 * 
 */

public class BaseTest {
	public static WebDriver driver;
	public static String Screenshotsubfoldername;
	public static ExtentReports ex;
	public static ExtentTest etest;

	@Parameters("browsername")
	@BeforeTest
	public void setup(ITestContext context, @Optional("chrome") String browsername) {
		switch (browsername.toLowerCase()) {

		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		default:
			System.out.println("Browser is invalid");
			break;

		}
		driver.manage().window().maximize();
		Capabilities cap=((RemoteWebDriver)driver).getCapabilities();       //to get the browser version and author related info
		String device=cap.getBrowserName()+" "+cap.getBrowserVersion().substring(0, cap.getBrowserVersion().indexOf("."));  //to get device info
		String author=context.getCurrentXmlTest().getParameter("Author");                                               //to get the author related infor from xml
		etest = ex.createTest(context.getName()); // we are creating test in extentreports and getting the test name
		etest.assignAuthor("author");   // from xml dynamically by using the context object
		etest.assignDevice("device");
		
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

	@BeforeSuite

	public void initializeextentreports() {
		ExtentSparkReporter sparkreport_all = new ExtentSparkReporter("Alltests.html");
		ex = new ExtentReports();
		ex.attachReporter(sparkreport_all);
		ex.setSystemInfo("OS", System.getProperty("os.name"));
		ex.setSystemInfo("Java Version", System.getProperty("javaversion.name"));

	}

	@AfterSuite

	public void generateextentreports() throws IOException {
		ex.flush();
		Desktop.getDesktop().browse(new File("Alltests.html").toURI());
	}

	
	
	@AfterMethod
	
	public void checkstatus(Method m,ITestResult result)        //native injection dependency concept  //method m from java.lang
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String screenshotpath =null;
			screenshotpath=capturescreenshot(result.getTestContext().getName()+" "+result.getMethod().getMethodName()+".jpg");
			etest.addScreenCaptureFromPath(screenshotpath);
			etest.fail(result.getThrowable());

		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			etest.pass(m.getName()+"is passed");
		}
		
	}
	public String capturescreenshot(String filename) {
		if (Screenshotsubfoldername == null) {
			LocalDateTime mydateobj = LocalDateTime.now();
			DateTimeFormatter myformatobj = DateTimeFormatter.ofPattern("ddmmyy");
			Screenshotsubfoldername = mydateobj.format(myformatobj);
		}
		return filename;

	}

}
