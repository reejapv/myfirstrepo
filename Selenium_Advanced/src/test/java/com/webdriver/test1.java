package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void unorderedlist() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demo.automationtesting.in");
	   Thread.sleep(5000);
	    //driver.findElement(By.id("btn2")).click();
	  WebElement ele1  =driver.findElement(By.xpath("//button[@id='btn2']"));
	  ele1.click();
	  Thread.sleep(2000);
	 List<WebElement> ele2 =driver.findElements(By.xpath("//ul[@class='nav navbar-nav']"));
	 System.out.println(ele2.size());
	 
	 for(WebElement e2:ele2)
	 {
		   if(e2.getText().equalsIgnoreCase("Interactions"));
		   e2.click();
		   break; 
	 }
	 Thread.sleep(2000);
	 List<WebElement> ele3 =driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
	 System.out.println(ele3.size());
	 for(WebElement e3:ele3)
	 {
		   if(e3.getText().equalsIgnoreCase("Selectable"));
		   Thread.sleep(2000);
		   e3.click();
		   break; 
	 }
	 
}
}
