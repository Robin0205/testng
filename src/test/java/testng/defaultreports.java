package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//test reports gives the info about the test executioon, time taken for execution, number of tests passed or failed etc..
//somehow intentilay closed the testng console and eclipse ,we will get the data of the executed methods in (Testng)
//reports by saving exection details of in reports file.
//reports is a file that consist of a last execution details in dat file.
//we dont need to create any file for the testng--instead we can go to the location of the testng in OS
//there u can find (emailed and index files).
//in real time scenartio we will use extent and alure reports.

public class defaultreports {
  @SuppressWarnings("unused")
@Test()
  public void tetslogin() throws InterruptedException {
	  
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	  
	  driver.get("");
	  driver.findElement(By.xpath(""));
	  driver.findElement(By.xpath(""));
	  Thread.sleep(3000);
	  driver.quit();
  }  
	  
  }

