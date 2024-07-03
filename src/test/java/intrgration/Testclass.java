package intrgration;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testclass extends BaseTest{
	
	
	@Test(testName="google",groups= {"Smoke"})
	public void TestGoogle()
	{
		driver.get("//https:www.google.com/");
		etest.info("navigated to url");
     	driver.findElement(By.name("q")).sendKeys("hyr turotials");
     	etest.info("entered text in the text box");
		String actualtitle="HYR Tutorials-Google Search";
        String expectedtitle=driver.getTitle();
        assertEquals( actualtitle, expectedtitle, "Title is sucessfully verfied");
        etest.pass("Assertion is passed for the webpage title");
		
	}
	
	
	@Test(testName="facebook",groups= {"Smoke","Regression"})
	public void TestFacebook()
	{
		driver.get("//https:www.facebook.com/");
		etest.info("navigated to url");
		driver.findElement(By.name("facebook"));
		etest.info("entered text in the text box");
      	String actualtitle="";
        String expectedtitle=driver.getTitle();
        assertEquals( actualtitle, expectedtitle, "Title is sucessfully verfied");
        etest.fail("Assertion is not passed for the webpage");


		
	}
	@Test(testName="hyrturorial",groups= {"Smoke","Sanity"})
	public void TestHYR()
	{
		driver.get("//https:www.hyrtutorials.com/");
		etest.info("navigated to url");
		driver.findElement(By.name("hyr tutorial"));
		etest.info("text is entered in the text box");
		String actualtitle="";
        String expectedtitle=driver.getTitle();
        assertEquals( actualtitle, expectedtitle, "Title is sucessfully verfied");
        etest.fail("Assertion is not passed for the webpage");



		
	}
	
	
	
	
	

}
