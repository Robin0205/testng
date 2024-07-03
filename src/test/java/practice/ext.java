package practice;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ext {
  
public  static void main (String[][] args) {
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  Capabilities cap=((RemoteWebDriver)driver).getCapabilities();
	 System.out.println( cap.getBrowserName());
	System.out.println(cap.getBrowserVersion());
	  
	  driver.quit();
	  
	  
	 
	  
  }
}
