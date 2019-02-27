package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderLinksTest 
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Bing.com");
		driver.manage().window().maximize();
		
	WebElement header=driver.findElement(By.className("sw_tb"));
	List<WebElement> headerList=header.findElements(By.tagName("a"));
	System.out.println(headerList.size());
	
	}

}
