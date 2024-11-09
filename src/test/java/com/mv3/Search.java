package com.mv3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {
  
	public WebDriver driver=null;
	
	@BeforeClass
	public void tearUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		
	}
	
	@Test
  public void search() {
 
	try {
		driver.manage().window().maximize();
		Thread.sleep(2000);
		POMSearch ss=new POMSearch(driver);
		ss.sendFName("SS");
		ss.sendLName("PP");
		ss.ClickQA();
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
