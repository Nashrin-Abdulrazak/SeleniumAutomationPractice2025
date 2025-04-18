package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file =    new File("C:\\Users\\umarm\\git\\Git2\\SeleniumAutomationPractice2025\\Selenium\\TestData\\data.xlsx");
	       
	       //Create an object of FileInputStream class to read excel file
	       FileInputStream inputStream = new FileInputStream(file);
	       
	       //creating workbook instance that refers to .xls file
	       XSSFWorkbook a =new XSSFWorkbook(inputStream);
	       
	       //creating a Sheet object
	        Sheet s=a.getSheet("test");
	         Row r=s.getRow(2);
	         Cell c=r.getCell(2);
	         System.out.println(c);
	         String address= c.getStringCellValue();
	         ChromeDriver driver=new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("https://www.google.com/");
	         WebElement e=driver.findElement(By.xpath("//textarea[@name='q']"));
	         Thread.sleep(3000);
	         e.sendKeys(address);
	        // driver.close();
	         
	         
	}
}
