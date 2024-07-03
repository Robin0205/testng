package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//we attributed inside the annotations so that attributes alter the functionality of the test method.
//wt is timeout? how to use it? wt is expected exception? how to use expected exception.
//if we need to complete the test method in expected time we need to use the (timeout attribute)//SLA (SERVICE LEVEL AGGREMENT)
//when u give particular timeout to the method to execute n if it not does so TESTNG will fail the
//testcase incase of the timeout attribute.

public class timeoutepectedexceptions {
  @SuppressWarnings("unused")
 //@Test(expectedexceptions =NosuchelementException.class,TimeoutException.class) 
@Test(timeOut = 8000)
  public void testmethod() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.hyrtutorials.com/");
	  driver.quit();
  }
}
