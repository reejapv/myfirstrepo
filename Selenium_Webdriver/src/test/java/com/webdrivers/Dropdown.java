package com.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void dropdownscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/");
	     driver.findElement(By.linkText("Drop down")).click();
	    Thread.sleep(1000);
	    //WebElement lstbox1=driver.findElement(By.xpath("//select[@id='dropdown1']"));
	    WebElement lstbox1=driver.findElement(By.id("dropdown1"));
	    Select sel1=new Select(lstbox1);
		System.out.println(sel1.isMultiple());
		sel1.selectByVisibleText("Appium");
		sel1.selectByIndex(3);
		 WebElement lstbox2=driver.findElement(By.xpath("//select[@name='dropdown2']"));
		 Select sel2=new Select(lstbox2);
		 System.out.println(sel2.isMultiple());
		 sel2.selectByIndex(3);
	}
	
}