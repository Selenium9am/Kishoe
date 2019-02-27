package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest 
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://hdfcbank.com");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();//1111111
		//System.out.println(parent);
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();///1111111&2222222
		
		for(String child:windows)
		{
			/*//System.out.println(child);
			//driver.switchTo().window(child);
			//driver.close();
			if (!parent.equals(child))//11111111=222222 
			{
				driver.switchTo().window(child);//222222
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
			}*/
			driver.switchTo().window(child);
			if (!driver.getTitle().equals("NetBanking"))
			{
				driver.close();
			}
		}
	}

}
