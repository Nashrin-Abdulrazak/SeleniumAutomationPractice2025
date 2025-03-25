import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingxPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://amazon.in");
//to count the no of links in amazon website , we use tagName and a specifies no of links
//to count no of buttons, we use By.tagName("button")
//to count no of input box, we use By.tagName("input");
List<WebElement> linkscount = driver.findElements(By.tagName("a"));
//to get the text of each link, then we need to iterate in for loop
//1.first get the size of the link
//2.iterate into for loop
//3.print the text of each link

System.out.println(linkscount.size());
for(int i=0;i<linkscount.size();i++)
{
	String linktext = linkscount.get(i).getText();
	System.out.println(linktext);
}

	}

}
