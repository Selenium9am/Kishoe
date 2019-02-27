package com.vasu.practies;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class AssignMentTest2 
{
public static void main(String[] args)
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.naukri.com/");
	driver.manage().window().maximize();
	Set<String> windows=driver.getWindowHandles();
	
	/*for (String child : windows)
	{
		//System.out.println(child);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.close();
	}*/
	List<String> tabs=new ArrayList<>(windows);
	driver.switchTo().window(tabs.get(0));
	driver.close();
	driver.switchTo().window(tabs.get(1));
	driver.close();
	driver.switchTo().window(tabs.get(2));
	driver.close();
}
}
