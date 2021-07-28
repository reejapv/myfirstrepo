package com.webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Javascriptexecutor4 {
	@Test
	public void script() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		WebElement textarea=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[2]/input"));
		WebElement logo=driver.findElement(By.xpath("//img[@src='logo.png']"));
		drawborder(textarea,driver);//draw border
		generateAlert(driver,"Not working");
		driver.switchTo().alert().accept();
		clickelement(logo,driver);//click on element
		System.out.println(getTitle(driver));//getTitle
		scrollpage(driver);//scroll page
	}
	//draw border-------------------------
	public static void drawborder(WebElement ele,WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].style.border='2px solid red'", ele);
	}
	//------------------------------------
	//Generate Alert
	public void generateAlert(WebDriver driver,String msg)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("alert('"+msg+"')");
		
	}
	//click on element-----------------------------------------
	public static void clickelement(WebElement ele1,WebDriver driver)
	
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();",ele1);
		
	}
	//getTitle---------------
	public static String getTitle(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		String title = jse.executeScript("return document.title;").toString();
    	return title;

	}
	//ScrollPage----------
	public static void scrollpage(WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	}
