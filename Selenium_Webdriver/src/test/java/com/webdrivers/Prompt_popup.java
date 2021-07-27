package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prompt_popup {
	@Test
	public void popupscript1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	   
	   WebElement ele =driver.findElement(By.linkText("Alert with OK"));
	   ele.click();
	    //WebDriverWait  wait= new WebDriverWait(driver,10);
		//wait.until(ExpectedCondition.);
	   // driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    //driver.findElement(By.id("btn2")).click();
	    //driver.findElement(By.linkText("Skip Sign In")).click();
	   // driver.findElement(By.linkText("SwitchTo")).click();
	   // Thread.sleep(2000);
	    
	   // driver.findElement(By.linkText("Alert with Textbox")).click();
	  //  driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();

	}
}