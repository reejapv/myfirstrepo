package com.webdriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getcoockie {

	@Test
	public void script() throws InterruptedException
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
		File f1=new File("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\coockie\\coockie.data");
		try 
		{
			f1.createNewFile();
			FileWriter fw1=new FileWriter(f1);
			BufferedWriter bw=new BufferedWriter(fw1);
			for(Cookie ck:driver.manage().getCookies())
			{
			bw.write(ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getValue()+";"+ck.isSecure()+";"+ck.getExpiry());
			bw.newLine();
		
			}
			bw.close();
			fw1.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
}
}
