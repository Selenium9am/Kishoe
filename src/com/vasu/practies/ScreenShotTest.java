package com.vasu.practies;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		
		TakesScreenshot sc=(TakesScreenshot)driver;
		File srcFile=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\vasu\\Desktop\\Screen\\vasu.png"));
	}

}
