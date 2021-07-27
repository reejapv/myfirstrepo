package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit {
	@Test
	public void editscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[value='Append ']")).clear();
	    driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("abc");
	    driver.findElement(By.name("username")).clear();
	    driver.findElement(By.name("username")).sendKeys("X");
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("clear");;
	    driver.close();
	}
}
