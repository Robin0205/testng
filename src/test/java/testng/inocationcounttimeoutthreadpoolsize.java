package testng;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Invocation timeout,invocation count,threadpool size...
//inovation count is a parameter it tells the test method how many times test method should be  invoked or executed.
//when we use any loop statement if it fails in the 2 or 3 iteration it is  nt going to execute the remaining iterations,
//in order to escape dat issues 
//we use the invokecount parameter or attribute.
//invocationtimeout is the attribute that should be given to complete all the invoationcount should complete within the 
//given invocationtimeoutcount.
//thread pool size is similar to dat of thread count, threadpoolsize=3; it means 3 iterations will happen at a time. 
//@Test(threadpoolsize=3)


public class inocationcounttimeoutthreadpoolsize 

{
  @Test(invocationCount=4, invocationTimeOut=10000,threadPoolSize=2)   //Threadpool size useful to create thread gor invocation count.
  public void tetslogin() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("");
	  driver.findElement(By.xpath(""));
	  driver.findElement(By.xpath(""));
	  Thread.sleep(3000);
	  driver.quit();
  }
}
