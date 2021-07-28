package com.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCoockie {
	@Test
	public void script() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
	Set<Cookie> allcookies=driver.manage().getCookies();
		
		System.out.println(allcookies.size());
		for(Cookie ck:allcookies)
		{
			System.out.println(ck.getName());
			System.out.println(ck.getValue());
			
		}
		driver.manage().deleteAllCookies();
		Set<Cookie> delcookies=driver.manage().getCookies();
		System.out.println("After deletion");
		System.out.println(delcookies.size());
		
		
	}
}
