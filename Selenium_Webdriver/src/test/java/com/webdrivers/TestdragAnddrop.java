package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestdragAnddrop {
	@Test
	public void draganddrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/");
	    driver.findElement(By.linkText("Droppable")).click();
	    WebElement src=driver.findElement(By.id("draggable"));
	    //WebElement des=driver.findElement(By.id("droppable"));
	    
	    Actions act=new Actions(driver);
	   // act.dragAndDrop(src, des).build().perform();
	    act.dragAndDropBy(src, 250, 150).build().perform();
	    
}
}