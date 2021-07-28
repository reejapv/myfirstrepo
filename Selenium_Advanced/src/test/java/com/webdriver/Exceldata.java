package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exceldata {
	@Test
	public void script() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.get("https://www.swiggy.com/");
		//driver.findElement(By.linkText("Sign up")).click();
		FileInputStream file=new FileInputStream("C:\\Users\\reeja\\Desktop\\SSS\\Selenium_Advanced\\testdata\\readexcel.xlsx");
		//Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/input.xlsx"));
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("sheet0"); 
		int row=sh.getLastRowNum();
		int col=sh.getRow(0).getLastCellNum();
		for(int i=1;i<row;i++)
		{
			XSSFRow row1=sh.getRow(i);
			for(int j=1;j<col;j++)
			{
			XSSFCell value=row1.getCell(j);
							
		System.out.println(value);
		}
			
			
			
			
			
//		Workbook wb = WorkbookFactory.create(new FileInputStream("./testdata/input.xlsx"));
//		Sheet s = wb.getSheet("sheet1");
//		Row r = s.getRow(0);
//	    Cell c = r.getCell(0);
//	    String c1 = c.getStringCellValue();
//	    Cell c2 = r.getCell(1);
//	    String c3 = c2.getStringCellValue();
	}
	}
}
