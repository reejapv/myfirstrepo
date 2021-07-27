package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
	@Test
	public void buttonscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Button")).click();
	    Thread.sleep(1000);
	 	driver.findElement(By.id("home")).click();
	 	driver.findElement(By.linkText("Button")).click();
	 	driver.close();
	}
}