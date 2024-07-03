package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//how to execute tests partially with dataprovider
//how to control the threadcount when using dataprovider 
//we can reduce the time by using the thread concept
//dataprovider threadcount means we can  control the number of sets of data to be sent to the test method by this thread count
//we cannot specify the thredad count in test class insetad we can give thread count in xml file.
//data-provider-thread-count="3"

public class parallel {

@Test(dataProvider="logindata")
  public void testlogin(String username, String password) throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("");
	  driver.findElement(By.id("txtusername")).sendKeys("username");
	  driver.findElement(By.id("txtpassword")).sendKeys("password");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(3000);
	  driver.quit();
  }

  @DataProvider(parallel=true )
  public Object[][] logindata(){
	  
	  Object[][] data =new Object[6][2];
		  
	
	  data [0][0]="Admin";
	  data [0][1]="admin123";

	  data [1][0]="admin";
	  data [1][1]="admin12";	

	  data [2][0]="stage";
	  data [2][1]="admin12";

	  data [3][0]="l6";
	  data [3][1]="admin12";	

	  data [4][0]="p5";
	  data [4][1]="admin12";

	  data [5][0]="main";
	  data [5][1]="admin12";

	  data [6][0]="test";
	  data [6][1]="admin12";	

    
    return data;
	  }
  }	  
                           //THREAD(process inside the java ) COUNT//
  /* if ur performing any actions in java,java first create the Thread  and then start executing code.
   * To know the thread id and name (Thread.currentThread().getId());
   * we have to give the <suite name="demosuite" parallel="true" and thread-count=2> to execute all the classes in package 
   * in parallele mode , if we want to execute the test methods inside the testng class we have to give this parallel
   * command at test level only and when we are giving parallel attribute we must use the thread count also.
   * 
   */
  
 //parallel execution
//we can't do the parellel execution in tetsng class we can do parallel execution in xml only.
//java provides thread (processing) for each every code .even for single line also based on dat only execution will occur.
//parameters (attributes in xml file)that are used for parallel execution are paralle and thread count .
//parallel =true we should pass this atribute in xml file <suite name="suite" parallel="false/none" thread-count="2"/> wehn u give  parallel =false
//tetsng will not consider it//threadcount=1 menas it will excute in sequential manner only.  
//when we give 2 threads in threadpool n and u have 3 classes to test one thread will execute one class after completeion of the 2 calsses only 3 class
//going to be executed. and we cant say which thread will execute the 3 clsses //to get the thread num we have to use (thread.getcuttrentthread.getid) command.
  
//that one thread is reponsible for all execution of all the methods inside the test class.
//parallel = "test" attribute given at suite level only <parallel="test" it will execute classes n methods bt when u give parallel="classes"
//it will execute the  test classes in  parallel mode bt the tests inside the class execute in sequential way only.  
 //we can also use parallel="classes, methods" at test level only(we can also do i suite level also) because we have the proper control . 
 //<test name=test1 parallel="calsses" thread-count=3.-------for classes to execute in parallel .
//<test name=test1 parallel="methods" thread-count=3.-------for methods inside the class to execute in parallel .
//when there are 2 classes bt u give thread for only 1  class at one test1 classes inside test only execute in the parallel mode
//the next test will execute in sequential manner only because we didnt given any parallel="classes" attribute at the xml foe test2.
//when u create parallel="test" thread-ocunt=2 only two threads are created .
//Bt when u create parallel="classes or methods" thread-count=2 the no of threads that are created are multipled by the no of test that are present inside the suite.
