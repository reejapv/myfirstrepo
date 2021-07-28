package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UnorderedlistDemo {
	@Test
	public void testwaitscript() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		List<WebElement> ele=driver.findElements(By.xpath("//ul[@jsname='erkvQe']/li"));
		System.out.println(ele.size());
		
		for(WebElement ele1:ele)
		   {
			 
//			   if(ele1.getText().equals("javascript"));
//			   ele1.click();
//			     break;
			String s = ele1.getText();
			System.out.println(s);
			
		   }
		//System.out.println(ele1.getText());
		}
}
