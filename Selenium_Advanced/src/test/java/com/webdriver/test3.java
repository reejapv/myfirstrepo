package com.webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test3 {
	@Test
	public void script() throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://www.leafground.com/pages/upload.html");
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		//driver.get("http://www.monsterindia.com/");
		//driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		//WebElement ele=driver.findElement(By.xpath("(//input[@id='file-upload'])[1]"));
		//ele.click();
		WebElement ele=driver.findElement(By.id("input-4"));
		//WebElement ele=driver.findElement(By.name("filename"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//Thread.sleep(5000);
		jse.executeScript("arguments[0].click();", ele);
//		
		//String file="C:\\Users\\reeja\\Desktop\\Hcl Training\\uploaddemo.txt";
		String file="C:\\Users\\reeja\\Desktop\\Hcl Training\\Doc1.docx";
		StringSelection select1=new StringSelection(file);
		//System.out.println(select1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
		Robot rbt=new Robot();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyRelease(KeyEvent.VK_ENTER);
}
}
