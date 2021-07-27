package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {
	@Test
	public void commands1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	//Maximize the Browser
	   driver.manage().window().maximize();
	//Enter the URL
	   driver.get("http://www.facebook.com");
	   System.out.println(driver.getTitle());
	//We can enter the url without using get ()
	   driver.navigate().to("http://www.google.com");
	   System.out.println(driver.getTitle());
	   
	   
	   driver.navigate().back();
	   System.out.println(driver.getTitle());
	   
	   driver.navigate().forward();
	   System.out.println(driver.getTitle());
	   //close the current browser
	   driver.close();
}
}
