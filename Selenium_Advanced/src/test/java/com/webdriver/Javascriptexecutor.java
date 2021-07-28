package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptexecutor {
	
		@Test
		public void script() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://demo.automationtesting.in/Datepicker.html");
			
			JavascriptExecutor jse=(JavascriptExecutor) driver;
			jse.executeScript("document.getElementById('datepicker1').value='29/08/2017'");
			jse.executeScript("document.getElementById('datepicker2').value='29/08/2017'");
			
		
		}
}
