package com.webdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelWrite {
	@Test
	public void script() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
	{
	System.setProperty("webdriver.chrome.driver", "C://Users/reeja/Desktop/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String file1=("C:/Users/reeja/Desktop/writeExcel.xlsx");
		File f1=new File(file1);
		FileOutputStream fw1=new FileOutputStream(f1);
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet s1=wb.createSheet();
		XSSFRow row=s1.createRow(5);
		XSSFCell col=row.createCell(6);
		col.setCellType(CellType.STRING);
		col.setCellValue("Hi");
		wb.write(fw1);
	/*----------------------------	
		for(int i=0;i<=5;i++)
		{
			XSSFRow r1=s1.createRow(i);
			for(int j=0;j<=5;j++)
			{
				r1.createCell(j).setCellValue("admin");
			}
		}
		wb.write(file);
		--------------------*/
		
}
}
