package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file = new File(
				"C:\\Users\\umarm\\git\\Git2\\SeleniumAutomationPractice2025\\Selenium\\TestData\\data.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook a = new XSSFWorkbook(inputStream);
		// creating a Sheet object
		Sheet s = a.getSheet("test2");
				
		Row r = s.getRow(3);
		Cell c = r.getCell(3);
		System.out.println(s.getPhysicalNumberOfRows());
		System.out.println(r.getPhysicalNumberOfCells());
		System.out.println();

		/*
		 * c.setCellValue("Begam123"); FileOutputStream outputStream1 = new
		 * FileOutputStream(file); a.write(outputStream1);
		 */
		System.out.println(c);
		String address = c.getStringCellValue();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e = driver.findElement(By.xpath("//textarea[@name='q']"));
		Thread.sleep(3000);
		e.sendKeys(address);
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Headphones')]"));
		String data = element.getText();
		
		r = s.getRow(2);
		c = r.getCell(2);
		c.setCellValue(data);
		r = s.getRow(3);
		c = r.getCell(3);
		c.setCellValue("Welcome to Eclipse1");
		r = s.getRow(3);
		c = r.getCell(4);
		c.setCellValue("Welcome to Eclipse2");
		r = s.getRow(3);
		c = r.getCell(5);
		c.setCellValue("Welcome to Eclipse3");

		FileOutputStream outputStream = new FileOutputStream(file);
		a.write(outputStream);

	}
}
