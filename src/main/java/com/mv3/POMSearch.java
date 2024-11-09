package com.mv3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMSearch {

	public WebDriver driver=null;
	public String F="fname";
	public String L="lname";
	public String Q="//a[@name='QA']";
	
	public POMSearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private WebElement getFName()
	{
		WebElement ee=driver.findElement(By.id(F));
return ee;
	}
	private WebElement getLName()
	{
		WebElement ee=driver.findElement(By.id(L));
return ee;
	}
	private WebElement getQAName()
	{
		WebElement ee=driver.findElement(By.xpath(Q));
return ee;
	}

	public void sendFName(String aa)
	{
		try
		{
			getFName().sendKeys(aa);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	public void sendLName(String aa)
	{
		try
		{
			getLName().sendKeys(aa);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}
	
	public void ClickQA()
	{
		try
		{
			getQAName().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println( e.getMessage());
		}
	}


}
