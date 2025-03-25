package sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.java.swing.plaf.windows.resources.windows;

public class SampleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
String parentwind = driver.getWindowHandle();
System.out.println(parentwind);
System.out.println("Parent window:"+driver.getTitle());

//child window navigation
driver.findElement(By.linkText("Follow On Twitter")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> childwindow=new ArrayList<String>(windowHandles);
driver.switchTo().window(childwindow.get(1));
Thread.sleep(10000);
System.out.println("childwindow title:"+driver.getTitle());

//switching to parent window
driver.switchTo().window(childwindow.get(0));
Thread.sleep(10000);
System.out.println("Parent window:"+driver.getTitle());
driver.close();

	}

	
}
