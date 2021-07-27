package com.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobuttons {
	@Test
	public void radiobuttonscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Radio Button")).click();
	   //WebElement radio =driver.findElement(By.xpath("//div[@id='first']"));
	    WebElement radio1=driver.findElement(By.xpath("//input[@type='radio'and @id='yes']"));
	    radio1.click();
//	    if(((radio1).isSelected())==true)
//	    {
//	    System.out.println("Yes Selected")	;
//	    }
	    
	    WebElement radio2=driver.findElement(By.xpath("//input[@type='radio'and @id='no']"));
	    radio2.click();
//	    if(((radio2).isSelected())==true)
//	    {
//	    System.out.println("No Selected");
//	    }
	    
	    WebElement radio3=driver.findElement(By.xpath("//label[@for='Unchecked']"));
	    radio3.click();
	    WebElement radio4=driver.findElement(By.xpath("//label[@for='Checked']"));
	    radio4.click();
	    
	    WebElement radio5=driver.findElement(By.xpath("//input[@type='radio'and @name='age'][1]"));
	    radio5.click();
	    WebElement radio6=driver.findElement(By.xpath("//input[@type='radio'and @name='age'][2]"));
	    radio6.click();
	    WebElement radio7=driver.findElement(By.xpath("//input[@type='radio'and @name='age'][3]"));
	    radio7.click();
	    driver.close();
	}
}