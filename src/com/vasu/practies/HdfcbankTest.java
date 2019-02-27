package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HdfcbankTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getPageSource());
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.quit();

	}

}
