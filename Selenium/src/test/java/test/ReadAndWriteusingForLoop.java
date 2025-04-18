package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAndWriteusingForLoop {

	public static void main(String[] args) throws IOException, InterruptedException {
		File file =    new File("C:\\Users\\umarm\\git\\Git2\\SeleniumAutomationPractice2025\\Selenium\\TestData\\data.xlsx");
	       
	       //Create an object of FileInputStream class to read excel file
	       FileInputStream inputStream = new FileInputStream(file);
	       
	       //creating workbook instance that refers to .xls file
	      Workbook a =new XSSFWorkbook(inputStream);
	       
	       //creating a Sheet object
	        Sheet s=a.getSheet("test2");
	        
	         Row r=s.getRow(3);
	         Cell c=r.getCell(3);
	         String stringCellValue = c.getStringCellValue();
	         if(stringCellValue.contains("java"))
	         {
	        	 System.out.println("script passed");
	        	 c.setCellValue("maven");
	        	 System.out.println("The Value is :"+c.getStringCellValue());
	         }
	         else
	         {
	        	 System.out.println("script failed");

	         }
	         System.out.println(s.getPhysicalNumberOfRows());
	         System.out.println(r.getPhysicalNumberOfCells());
	         System.out.println();
	         
	         for(int i=0;i<s.getPhysicalNumberOfRows();i++)
	         {
	        	 Row row = s.getRow(i);
	        	 for (int j=0;j<row.getPhysicalNumberOfCells();j++)
	        	 {
	        		 Cell cell = row.getCell(j);
	        		 //cell.setCellValue("Test case passed");
	        		 
	        		// System.out.println("Total no of values in excel:"+cell );
	        		 System.out.println(cell);
	        		 	        	 }
	        	

	         }
	         
	        /* for(int i=0;i<10;i++)
	         {
	        	 Row row = s.getRow(i);
	        	 for (int j=0;j<=10;j++)
	        	 {
	        		 Cell cell = row.getCell(j);
	        		 cell.setCellValue("cellvalue");
	        		 	        	 }
	        	

	         }*/
	         
	         
	         
	         
	         
	         
	         
	         
	         FileOutputStream outputStream = new FileOutputStream(file);

		        a.write(outputStream);
	}
}
