
package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class group {
	
	WebDriver driver;
	@Parameters("browsername")
	@BeforeTest
	public void initializebrowser (@Optional ("chrome")String broswename) {
		
		switch(broswename) {
		case "chrome" :
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		break;
		
		case "Edge" :
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver ();
			break;
			
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			break;
			
		default:
			System.err.println("invalid broswername");
		
			
			
			
			}
			
			driver.manage().window().maximize();
		}
		@Test(priority=1)
		public void justtest() {
			
			driver.navigate().to("https://www.amazon.in/");
		    driver.get("https://www.snapdeal.com/");
		    
		    
		   

		    driver.navigate().forward();
		    
		    
		  
		    driver.navigate().forward();
		   
		    
		  
		    driver.navigate().refresh();
			
		}
			
			
			
		
		
		@Test(priority=2)
		public void key() throws InterruptedException {
			driver.get("https://the-internet.herokuapp.com/key_presses?");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"target\"]"));
			
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.BACK_SPACE).perform();
			Thread.sleep(3000);
			act.sendKeys(Keys.ESCAPE).perform();
			Thread.sleep(3000);

			act.sendKeys(Keys.SPACE).perform();
			Thread.sleep(3000);
			
		
			
			
		}
		
		@AfterTest
		public void teardown() {
		driver.close();
			
			
		}
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
