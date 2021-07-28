package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class OrderedListDemo {

	@Test
	public void orderedlist() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://demo.automationtesting.in/Selectable.html");
	    Thread.sleep(5000);
	    List<WebElement> elements =driver.findElements(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li"));  
	    System.out.println(elements.size());
	    for(WebElement ele1:elements)
		   {
			   if(ele1.getText().equalsIgnoreCase("Serialize"));
			   ele1.click();
			   break;
		   }
	    List<WebElement> ele =driver.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));  
	    System.out.println(ele.size());
//	    for(WebElement ele1:ele)
//			 
//	    	System.out.println(ele1.getText(ele1));
				   //ele1.click();
	
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.CONTROL).click(ele.get(0)).click(ele.get(2)).click(ele.get(4)).click(ele.get(6))
	    		.build().perform();
}
}