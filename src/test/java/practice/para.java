package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class para {

	public WebDriver driver;

	@BeforeTest()
	public void initializebrowser( ) {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	
	
	
	@Test()
	public void launchapp() {
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}	
	


	@Test()
	public void logindetails() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();

	}
	@Test()
	public void currenturl() {
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"ViewStatement\"]/span/a/div[1]/img")).isDisplayed());
	}





	@AfterTest
	public void teardown() {

		driver.close();
	}


}


























