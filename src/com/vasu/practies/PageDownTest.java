package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Actions page=new Actions(driver);
		page.sendKeys(Keys.PAGE_DOWN);
		
		driver.findElement(By.linkText("Create a Page")).click();
		driver.navigate().back();
		//Thread.sleep(2000);
	//page.sendKeys(Keys.PAGE_UP);
		

	}

}
