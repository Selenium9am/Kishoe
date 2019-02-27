package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TabsTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='blobId']")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String child:windows)
		{
			//System.out.println(child);
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			if (!driver.getTitle().equals("Recommended Jobs | Mynaukri")) 
			{
				driver.close();
			}
			
		}

	}

}
