package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptexecutor3 {
	@Test
	public void script() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://fontawesome.com/");
		WebElement ele1=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/section[6]/div/article/div[2]/ul/li[10]/a/span[2]"));
		int yaxis=ele1.getLocation().getY();
		System.out.println(yaxis);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,"+yaxis+" )");
	
	   	
		
	    }
}