package com.webdrivers;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FrameTest {
	@Test
	public void windowscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    WebElement ele=driver.findElement(By.linkText("Open New Tabbed Windows"));
		WebDriverWait wait=new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.elementToBeClickable(ele));
	    ele.click();
	    driver.findElement(By.linkText("Open New Tabbed Windows")).click();
	    //driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	    driver.findElement(By.linkText("Open New Seperate Windows")).click();
	    // driver.findElement(By.xpath("//button[@onclick='newwindow()']")).click();
	//WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/a/button"));
	//WebDriverWait wait=new WebDriverWait(driver,20);
   // wait.until(ExpectedConditions.elementToBeClickable(ele));
   // ele.click();
//	System.out.println(driver.getTitle());
//	Set<String> window_value=driver.getWindowHandles();
//	 Iterator<String> iter=window_value.iterator();
//	 String w1=iter.next();
//	 String w2=iter.next();
//	 driver.switchTo().window(w2);
//	 String title_child=driver.getTitle();
//	 System.out.println(title_child);
	}
}