package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TooltipTest {
	@Test
	public void script() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement ele1=driver.findElement(By.id("age"));
		//-using get attribute-------------------
//		String msg=ele1.getAttribute("title");
//		System.out.println(msg);
		//--------------------
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("age"))).perform();
		WebElement toolTipElement = driver.findElement(By.id("age"));
		String msg1=toolTipElement.getAttribute("title");
		System.out.println(msg1);
		
}
}