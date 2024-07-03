package testng;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class assertions {
	//Xml is a extensile markup language that is used  structure data for storage and transport
	//xml file has both text and tags, tags provide structure to the data.the text in file that you wish to store is surrounded
	//by these tags.

	//XML file is configuration file where details of the executions of testcases are present
	// in the xml file we can execute the multiple methods from different classes at a time.
	// Assertion is an expression which will verify the actal test outcome with the expected  test outcome.
	//to get te status of the tests we need to definately place the assertions in testcases

	// hard assertion throw exception as soon as the testcase fail and doesn't execute remaining code 
	//whereas soft assertion doesnt throw exception immediately  it is in our control though the test cases
	//fails it exceute remaining code also 
	//softassert.assertall it is the method dat execute all the methods(all the methods are static so we dont need to create object ,insted
	//we can call directly).


	/*Assertequals  ,Assertnotequal,Asserttrue,Assertflase,Assertnull,Assertnotnull
	 * border values should change from hex to rgb 
	 * 
	 * 
	 */


	@SuppressWarnings("unused")
	@Test
	public void testfacebook() throws InterruptedException   {

	 SoftAssert SoftAssert=new SoftAssert();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		


		//Title assertion

		/*String expectedtitle="facebook log in or sign up";
		String actualtitle=driver.getTitle();
		SoftAssert.assertEquals(actualtitle,expectedtitle ,"Title is mismatched");*/

		//URL Assertion
		String actualurl=driver.getCurrentUrl();
		String Expectedurl="Google";
        assertEquals(actualurl,Expectedurl,"URL is matched");

		
		
		SoftAssert.assertAll();
        //driver.close();

	}



}	




