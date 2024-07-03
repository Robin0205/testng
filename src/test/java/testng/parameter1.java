package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class parameter1 {
 

	  WebDriver driver;
	  @Test
	      @Parameters("Browsername")
		  @BeforeTest
		  public void initializwbrowser(String Browsername) {
	    	  switch(Browsername.toLowerCase()) {
	    	  case"chrome":
	    		  WebDriverManager.chromedriver().setup();
				  driver=new ChromeDriver();
				  break;
	    	  
	    	  
					 
			  case "edge":
				  WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
				 break;
			  case "firefox":
				  WebDriverManager.firefoxdriver().setup();
				 driver=new EdgeDriver();
				 break;
				 default:
					 System.err.println("Browsername is invalid");
				 
				 
	    	  }
			  
	    	  
	      }
			
	@AfterTest
	
	public void teardown() {
		
		driver.close();
		
	}
	    	 
	
	@Test
	
	public void testgoogle(String Browsername) {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("meesho",Keys.ENTER);
		
		
		
		
	}
	
			  
	@Test
	public void testamazon(String Browsername) {
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
		
	}
}