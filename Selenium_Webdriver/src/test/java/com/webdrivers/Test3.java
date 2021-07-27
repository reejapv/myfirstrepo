package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void framescript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Frame")).click();
	    //Thread.sleep(1000);
	    //driver.switchTo().frame(0);
	    
}
}
