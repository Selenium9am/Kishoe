package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://tinypic.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='the_file']")).sendKeys("E:\\Models.docx");
		//driver.findElement(By.xpath(".//*[@id='the_file']")).click();
		//Thread.sleep(2000);
		//AutoIt
		//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fup.exe");

	}

}
