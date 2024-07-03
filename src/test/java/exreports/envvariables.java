package exreports;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class envvariables {

	public static void main(String[] args) {
		
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
	 System.out.println( cap.getBrowserName());
	System.out.println(cap.getBrowserVersion());
	
	//to get all the properties of the device
	
	
	System.getProperties().list(System.out);
	System.out.println(System.getProperty("os.name"));
	System.out.println(System.getProperty("os.version"));

	  
	  driver.quit();
	  
	  
	 
	  
	  
	  
		
		

	}

}
