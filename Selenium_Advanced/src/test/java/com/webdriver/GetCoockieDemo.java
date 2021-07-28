package com.webdriver;
import java.io.BufferedReader;		
import java.io.File;		
import java.io.FileReader;		
import java.util.Date;		
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetCoockieDemo {
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
//driver.findElement(By.linkText("CONTINUE")).click();
				
try{			
 
   // File file = new File("Cookies.data");
    File file = new File("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\coockie\\coockie.data");
    FileReader fileReader = new FileReader(file);							
    BufferedReader Buffreader = new BufferedReader(fileReader);							
    String strline;			
    while((strline=Buffreader.readLine())!=null){									
    StringTokenizer token = new StringTokenizer(strline,";");									
    while(token.hasMoreTokens()){					
    String name = token.nextToken();					
    String value = token.nextToken();					
    String domain = token.nextToken();					
    String path = token.nextToken();					
    Date expiry = null;					
    		
    String val;			
    if(!(val=token.nextToken()).equals("null"))
	{		
    	expiry = new Date(val);				
    }		
    Boolean isSecure = new Boolean(token.nextToken()).								
    booleanValue();		
    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);			
    System.out.println(ck);
    driver.manage().addCookie(ck); // This will add the stored cookie to your current session					
    }		
    }		
    }catch(Exception ex){					
    ex.printStackTrace();			
    }		
   // driver.get("https://www.swiggy.com/");					
}	
}	

