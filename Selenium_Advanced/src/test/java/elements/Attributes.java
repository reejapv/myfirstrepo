package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attributes {

	@FindBy(name="q")
	public static WebElement searcxhbox;
	@FindBy(name="btnK")
	public static WebElement searchbutton;
	
	
	
	/*public static WebElement  searcxhbox(WebDriver driver)
	{
		return driver.findElement(By.name("q"));
	}
	public static WebElement searchbutton(WebDriver driver)
	{
		return driver.findElement(By.name("btnK"));
	}*/
}
