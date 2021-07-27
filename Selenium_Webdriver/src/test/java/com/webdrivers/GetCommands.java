package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCommands {
	@Test
	public void commands1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/Window.html");
	      WebElement ele=driver.findElement(By.id("color"));
	   System.out.println(ele.getText());
	   String title=driver.getTitle();
	   System.out.println(title);
	    
	   String url=driver.getCurrentUrl();
	   System.out.println(url);
	   
	   String pagesource=driver.getPageSource();
	   System.out.println(pagesource);
	    
	}
}
