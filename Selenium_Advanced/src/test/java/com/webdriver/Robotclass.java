package com.webdriver;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robotclass {
	@Test
	public void popupscript1() throws InterruptedException, AWTException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Alert")).click();
	   WebElement ele =driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
	   ele.click();
	   Alert alert=driver.switchTo().alert();
       alert.sendKeys("Hi");
      // alert.accept();
	   Robot rbt=new Robot();
	   Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();//dimension from awt pkg
	   Rectangle rect=new Rectangle(screensize);//awt pkg
	  BufferedImage src=rbt.createScreenCapture(rect);
	  File des=new File("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\Screenshot\\screen2.jpg");
	  ImageIO.write(src, "jpg",des);
}
}
