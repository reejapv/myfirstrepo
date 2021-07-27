package com.webdrivers;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicCommands {
	@Test
	public void commands() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.leafground.com/pages/Window.html");
	      
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.navigate().refresh();
	    driver.navigate().to("http://demo.automationtesting.in/");
	    driver.manage().window().maximize();
	    Dimension dim=new Dimension(400,400);
	    driver.manage().window().setSize(dim);
	}

}
