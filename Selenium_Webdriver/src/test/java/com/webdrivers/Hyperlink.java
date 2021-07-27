package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hyperlink {
	@Test
	public void hyperlinkscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("HyperLink")).click();
	    driver.findElement(By.linkText("Go to Home Page")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("HyperLink")).click();
	    driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("home")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("HyperLink")).click();
	  //  driver.findElement(By.xpath("//label[text()='(Interact with same link name)'])")).click();
	   driver.findElement(By.linkText("Verify am I broken?")).click();
	   driver.navigate().to("http://www.leafground.com/home.html");
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("HyperLink")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//a[text()='Go to Home Page']/following-sibling::label")).click();
	}
}