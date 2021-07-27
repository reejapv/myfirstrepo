package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	@Test
	public void framescript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Frame")).click();
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.id("Click")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    WebElement ele=driver.findElement(By.id("frame2"));
	    driver.switchTo().frame(ele);
	    driver.findElement(By.id("Click1")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2);
	   System.out.println(driver.findElements(By.tagName("iframe")).size());
}
}

