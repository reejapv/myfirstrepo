package com.webdrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert_popup {
	@Test
	public void popupscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Alert")).click();
	    driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
        String msg =driver.switchTo().alert().getText();
    	System.out.println(msg);
        driver.switchTo().alert().dismiss();
        driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
       // WebDriverWait wait=new WebDriverWait(driver,5);
		//wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
         alert.sendKeys("Hi");
         alert.accept();
	
	}
}
