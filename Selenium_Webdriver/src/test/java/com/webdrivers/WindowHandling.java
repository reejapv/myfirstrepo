package com.webdrivers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
	@Test
	public void windowscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	      
	    driver.get("http://www.leafground.com/pages/Window.html");
	    driver.findElement(By.id("home")).click();
	 Set<String> window_value=driver.getWindowHandles();
	 Iterator<String> iter=window_value.iterator();
	 String w1=iter.next();
	 String w2=iter.next();
	 driver.switchTo().window(w2);
	 String title_child=driver.getTitle();
	 System.out.println(title_child);
	}

}