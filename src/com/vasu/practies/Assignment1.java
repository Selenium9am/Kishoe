package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://Facebook.com");
		driver.manage().window().maximize();
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByIndex(5);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(5);

	}

}
