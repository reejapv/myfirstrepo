package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Ordered_list {

	@Test
	public void orderedlist()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/");
	    driver.findElement(By.linkText("Selectable")).click();
	    List<WebElement> ele=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
	    System.out.println(ele.size());
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.CONTROL).click(ele.get(0)).click(ele.get(2)).click(ele.get(4)).click(ele.get(6))
	    		.build().perform();
	    
	    
	}
}
