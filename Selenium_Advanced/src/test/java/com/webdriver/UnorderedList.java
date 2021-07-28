package com.webdriver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UnorderedList {
	@Test
	public void unorderedlist() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/");
	    driver.findElement(By.linkText("Auto Complete")).click();
	    driver.findElement(By.id("tags")).sendKeys("A");
	  Thread.sleep(5000);
	    List<WebElement> elements =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	   System.out.println(elements.size());
	   for(WebElement ele1:elements)
	   {
		   if(ele1.getText().equalsIgnoreCase("SOAP"));
		   ele1.click();
		   break;
	   }
	   TakesScreenshot sc=(TakesScreenshot)driver;
	  File src=sc.getScreenshotAs(OutputType.FILE);
	  File des=new File("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\Screenshot\\screen1.jpg");
	   FileHandler.copy(src,des);
	}
	
	
}