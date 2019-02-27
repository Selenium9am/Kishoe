package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void adminLogin()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("Http://PrimusBank.qedgetech.com");
	driver.manage().window().maximize();

	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
}
}
