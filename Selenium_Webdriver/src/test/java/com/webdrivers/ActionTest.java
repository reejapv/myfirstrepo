package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionTest {
	@Test
	public void doubleclickcript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/");
	   // driver.findElement(By.linkText("Draggable")).click();
	  driver.findElement(By.linkText("Edit")).click();
	  WebElement ele1=driver.findElement(By.id("email"));
	  // ele1.click();
	    Actions act1=new Actions(driver);
	   // act1.sendKeys(ele1,"reeja").build().perform();
	   // act1.contextClick().build().perform();
	    act1.sendKeys(ele1,"reeja").doubleClick(ele1).build().perform();
	    
}
}
