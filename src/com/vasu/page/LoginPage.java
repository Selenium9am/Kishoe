package com.vasu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(id="txtUsername")
	WebElement userName;//page objects
	@FindBy(id="txtPassword")
	WebElement password;//page objects
	@FindBy(id="btnLogin")
	WebElement login;//page object
	
	public void adminLogin()
	{
		userName.sendKeys("Admin");
		password.sendKeys("Qedge123!@#");
		login.click();
		
	}
}	
