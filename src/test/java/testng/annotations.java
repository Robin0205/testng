package testng;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

/*page factory
 * 
 * @FindBy(id="username") webelement usernametxt;
 *  webelement element=driver.findelement (By.xpath(""))  //generalmethod to locate the element 
 * 
 */
//when ever we want to execute test methods in tets class we dont need of annotations bt if we want to execute in xml file we have to use annotations

//Annotations are the form of metadata(package,class,methods,parameters) that can be added to java source code
//@override
//@Test
//@Findby
//@Dataprovider
//@Listners
//@parameters
//@After test
//@Before test
//@After suite
//@Before suite
//@After class
//@Before class
//@After method
//@Before method


public class annotations {    //orange hrm
	
	public static  WebDriver driver;
	
		  @BeforeTest
		  public void initializwbrowser() {
			  WebDriverManager.chromedriver().setup();
			  driver=new ChromeDriver();
			  System.out.println("before test");
			  
		  }
		 
		  @AfterTest
		  public void teardown() {
			  driver.close();
			  System.out.println("after test");
			  
			  
		  }
		  @BeforeMethod
		  public void beforemethod() {
			System.out.println("before method");  
			  
		  }
		  @AfterMethod
		  public void aftermethod() {
			  System.out.println("after method"); 
			
			  
		  }
		  
		  @Test()
		  public void launchbrowser() {
			  
			  driver.get("https://www.amazon.in/");
			  
			  
		  }
		  	
		  @Test()
		  public void navigatetomobiles() {
			  
			 driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
			
		  }
		  
		  @Test()
		  public void searchforproduct() {
			  
			 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone13",Keys.ENTER);
		  }
			  
			 public void confirmproduct() {
				 
				 System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Apple iPhone 12 (64GB) - (Product) RED')]")).getText());
				 
				 
				 
			 }

		}
	
  