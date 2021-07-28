package com.webdriver;

import java.io.BufferedReader;		
import java.io.File;		
import java.io.FileReader;		
import java.util.Date;		
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;

public class test2		
{		
  
	public static void main(String[] args){ 
    	WebDriver driver;     
       	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");					
        driver=new ChromeDriver();		
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    try{			
     
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
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");					
}	
	}	