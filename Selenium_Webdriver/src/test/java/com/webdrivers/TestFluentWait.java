package com.webdrivers;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class TestFluentWait {
	@Test
	public void testfluentwaitscript() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//*[@id=\"xjs\"]/table/tbody/tr/td[3]/text()")).click();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(20,TimeUnit.SECONDS)
				  .pollingEvery(5,TimeUnit.SECONDS)
				  .ignoring(NoSuchElementException.class);
	
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Books")));
		
		driver.findElement(By.linkText("Books")).click();
		
}
}