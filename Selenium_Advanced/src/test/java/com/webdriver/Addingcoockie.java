package com.webdriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addingcoockie {
	@Test
	public void script1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.linkText("CONTINUE")).click();
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
//		File f1=new File("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\coockie\\coockie.data");
		Set<Cookie> coockies1 = driver.manage().getCookies();
	System.out.println(coockies1.size());
	Cookie coockienew=new Cookie("c1","abcd");
	for(Cookie ck:coockies1)
	{
		System.out.println(ck.getName()+";"+ck.getValue());
	}
	driver.manage().addCookie(coockienew);
	Set<Cookie> coockies2 = driver.manage().getCookies();
	System.out.println(coockies2.size());
	driver.manage().deleteCookie(coockienew);
	
	Set<Cookie> coockies3 = driver.manage().getCookies();
	System.out.println(coockies3.size());
	driver.manage().deleteAllCookies();
	Set<Cookie> coockies4 = driver.manage().getCookies();
	System.out.println(coockies4.size());
	}
}
