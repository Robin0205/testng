package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Data provider is a parameter that is used to send the data to the methods 
//normlally we will test the test cases wid the single set of data ,so in order to test the testcasees wid 
//the multiple sets os the data we will use data provider concept
//Data provider is a container which contain different sets of the data in the array format it may be (2 dimensional ..so on )
//to create this container we have to create the one java method wid the annotation @Dataprovider...
//to execute the dataprovider values in parallel mode we need to mention parallel=ture in dataprovider attribute
//bt giing this attribute without threa-count is waste bt we cannot give the thread-count in testng class instead
//we cn give that thread-count in the xml file.
//we cannot add the dataprovider thread count to suuite tag and not to the test tag
//<suite name="suite"  data-provider-thread-count="5">

public class dataprovider {
	
public static WebDriver driver;
	
	
  @Test(dataProvider="logintestdata")
  public void logintest(String username,String password) throws Exception {
	   
	  WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	 Thread.sleep(3000);
	 driver.close();
  }	  
  
  /*login("Admin" ,"admin123")
   * login("admin" ,"Admin123")
   */
  
    public void login(String username, String password)
    {
    
    driver.get("");
    driver.quit();
    
    
    }	 
  @DataProvider(name="logintestdata")
  
 public Object [][] loginData() {
	  
	  Object[][]data=new Object[2][2];
	  data[0][0]="Admin";
	  data[0][1]="admin123";
	  
	  data[1][0]="Admi";
	  data[1][1]="test123";
	  return data;
  }
} 
  
  
  
  
  
  
  
  
  
  
  
  