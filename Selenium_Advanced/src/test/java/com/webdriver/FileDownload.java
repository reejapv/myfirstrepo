package com.webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownload {
	@Test
	public void script() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();
		File f1=new File("C:/Users/reeja/Desktop/SSS/Selenium_Advanced/testdata");
		File[] var_files=f1.listFiles();
		for(File file:var_files)
		{
			if((file.getName()).equalsIgnoreCase("testleaf.xlsx"));
			System.out.println("File exist is downloaded");
			break;
		}

	}
}