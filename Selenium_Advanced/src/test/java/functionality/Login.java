package functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.Attributes;

public class Login {
	//Attributes attr=new Attributes();
 @Test
public void search()
{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	//Attributes attr=new Attributes();
	PageFactory.initElements(driver,Attributes.class );
	
	//Attributes.searchbox(driver).sendKeys("java");
	//Attributes.searchbutton(driver).click();
	Attributes.searcxhbox.sendKeys("java");
	Attributes.searchbutton.click();
}
}
