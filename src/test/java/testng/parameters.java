package testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



//paramerts- if we wish to pass any info to the methods we use parameters.
//similar to testng also those are called testng parameters.
//test(only test  level) and suite(entire test cases) levels methods are present 
//when u use suit level parameters all the test cases execute in one browser
//bt when we use testlevel parameters we can exceute dat testcases in different browseers

public class parameters {
	WebDriver  driver;
	
	  @SuppressWarnings("unused")
	  
	  
	  
     @Parameters("browserName")
	 @BeforeTest
	  public void initializebrowser(String browserName ) {
		  
		  switch(browserName) {
		  
		  case "chrome":
		  
			  
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			 break;
		  
			 
		  case"edge":
			  WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 break;
			 
		  case "firefox":
			  WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			 break;
			 default:
				 System.out.println("Browser is invalid");
			 
		  }		 
		  }
		  
		
	  @AfterTest
	  public void teardown() {
		  driver.close();
		  }
	  
      @Parameters("url")
	  @Test
	  public void launchapp(String url) {
		  driver.get("url");
		  }
	  
      @Parameters({ "userName" , "password"})
	  @Test
	  public void enterlogindetails(String username , String password) throws Exception{
		  driver.findElement(By.name("txtUsername")).sendKeys(username);
		  driver.findElement(By.name("txtPassword")).sendKeys(password);
		  driver.findElement(By.className("button")).click();
		  }
	  

	  @Test
	  public void Navigatetomyinfo() {
		 driver.findElement(By.xpath("//b[normalize-space()='My Info']")).click();
		  }
	  
	  @SuppressWarnings("unused")
	@Test
	  public void verifymyinfo() {
		Boolean actualvalue= driver.findElement(By.id("employee-details")).isDisplayed();
		assertTrue(actualvalue);
		  }
	  

	  @SuppressWarnings("unused")
	@Test
	  public void verifylogin() {
		 WebElement element= driver.findElement(By.id("welcome"));
		 assertTrue(element.isDisplayed());
		 assertTrue(element.getText().startsWith("welcome"));
	
  }
}
