package testng;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//capture screenshot for the failedd test cases in TESTNG using LISTERNS, DEPENDENCY INJECTION ,how to override screenshot overriding.
//screenshot and logs files are  important for the test failure and it will give the info about the test failure
//@Test

//This is for normal way to capture screenshot when testcase files.

/*public void test(){
* try{
* system.out.println("hello");
* }
* 
* catch(Exception e){
* 
*code screenshot
*}
*/

public class baseclass {
	
public static	WebDriver driver;
public static String screenshotsubFolderName;
	
  @SuppressWarnings("unused")
@BeforeTest
  public void setup() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
	  
	  @AfterTest
	  public void teardown() {
		  driver.quit();
		  
	  
	  
  }
  @AfterMethod
  @Test(testName="screenshot")
  public void screenshotcapture(ITestResult result) throws IOException 
  {
	  if (result.getStatus()==ITestResult.FAILURE) {
		  capturescreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());    //to get the screenshotname as same of testname.  
		  
	  }
  }
  
 
 

  @SuppressWarnings("unused")
public void capturescreenshot (String filenmae) throws IOException {  
	  //./represents the current project directory it will create screenshot file in current project and save the screenshot in that file.
	  if (screenshotsubFolderName ==null) 
	  {
	    LocalDateTime myDateObj = LocalDateTime.now() ;
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    screenshotsubFolderName = myDateObj.format(myFormatObj);
	    
	  }

	  	TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File srcfile=takescreenshot.getScreenshotAs(OutputType.FILE);
		File targetfile=new File("./screenshots/"+ screenshotsubFolderName+"/"+filenmae);
		try {
		FileUtils.copyFile(srcfile, targetfile);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	System.out.println("screenshot saved sucessfully");
	}
  
  
  
  }
