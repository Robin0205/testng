package intrgration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotcapture {
	
	public static WebDriver driver;
	public static String screenshotsubfoldernamee;
	
	
	
	public void setup()
	{
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
	}
	
	public void screenshotcapturee (ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//capturescreenshot(result.getTestContext().getName()+" "+result.getMethod().getMethodName()+".jpg");
		}
		
	}
	

}
