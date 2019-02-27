package com.vasu.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmp {
	@FindBy(linkText="PIM")
	WebElement pim;//page objects
	@FindBy(linkText="Add Employee")
	WebElement addEmp;//page objects
	@FindBy(id="firstName")
	WebElement fName;
	@FindBy(id="lastName")
	WebElement lName;
	@FindBy(id="photofile")
	WebElement file;
	@FindBy(id="btnSave")
	WebElement save;
	public void empAdd()
	{
		pim.click();
		addEmp.click();
		fName.sendKeys("asafdhs");
		lName.sendKeys("adsfgjhklj");
		file.sendKeys("E:\\Koala.jpg");
		save.click();
	}
	
}
