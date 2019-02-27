package com.vasu.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM
{
	FirefoxDriver driver;
	String res;
//appLaunch
	public  String  appLaunch(String url)
	{
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		//validate
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String userName,String password)
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.id("welcome")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogout
	public String appLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) 
		{
			//System.out.println("Pass");
			res="Pass";
		}else
		{
			//System.out.println("fail");
			res="fail";
		}
		return res;
	}
	//appClose
	public void appClose()
	{
		driver.close();
	}
	//empAdd
	public String empAdd(String fName,String lName)
	{
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		//driver.findElement(By.id("photofile")).click();
		driver.findElement(By.id("photofile")).sendKeys("E:\\Koala.jpg");
		/*Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fileupload.exe");
		
		Thread.sleep(2000);*/
		
		driver.findElement(By.id("btnSave")).click();
		if (driver.findElement(By.xpath(".//*[@id='profile-pic']/h1")).isDisplayed())
		{
			
			res="Pass";
		}else
		{
			
			res="Fail";	
		}
		return res;

	}
	//
	public static void main(String[] args)
	{
		OrangeHRM app=new OrangeHRM();
		String results=app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		System.out.println(results);
		app.appLogin("Admin","Qedge123!@#");
	}
}
