package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Property {
	@Test
	public void script() throws InterruptedException, IOException
	{
		WebDriver driver;
		FileInputStream f1=new FileInputStream("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\src\\test\\java\\com\\webdriver\\config.properties");
		Properties prop=new Properties();
		prop.load(f1);
		String browser_name=prop.getProperty("browser");
		String driver_path=prop.getProperty("path");
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",driver_path);
			driver=new ChromeDriver();
		}
//		else if(browser_name.equalsIgnoreCase("firefox"))
//		{
//			System.setProperty("webdriver.gecko.driver",driver_path);
//			driver=new FirefoxDriver();
//		}
		{
			System.setProperty("webdriver.ie.driver",driver_path);
			driver=new InternetExplorerDriver();
		}
//	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		//driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://jqueryui.com/tooltip/");
}
}