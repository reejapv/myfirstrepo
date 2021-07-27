package com.webdrivers;

//import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowTest {
	@Test
	public void windowscript() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://www.naukri.com");
//	    Set<String> whs = driver.getWindowHandles();
//	    Iterator<String> iter=whs.iterator();
//		 String w1=iter.next();
//		 String w2=iter.next();
//		 driver.switchTo().window(w2);
//		 String title_child=driver.getTitle();
//		 System.out.println(title_child);
	    Set<String> whs = driver.getWindowHandles();
		int countWindows = whs.size();
		System.out.println(countWindows);
		
		for(String w:whs)
		{
			driver.switchTo().window(w);
			String s = driver.getTitle();
			System.out.println(s);
			driver.close();
		}
}
}
