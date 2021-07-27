package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Checkboxes {
	@Test
	public void checkboxscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Checkbox")).click();
	  driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
	 // Thread.sleep(1000);
	  //driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
}
}