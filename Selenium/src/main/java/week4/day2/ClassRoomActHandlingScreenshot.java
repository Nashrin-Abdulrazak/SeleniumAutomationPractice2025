package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomActHandlingScreenshot {

	public static void main(String[] args) throws IOException {
ChromeDriver Driver=new ChromeDriver();
Driver.manage().window().maximize();
Driver.get("https://www.leafground.com/grid.xhtml");
Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
File src = Driver.getScreenshotAs(OutputType.FILE);
File dest=new File("./snapshot/snap.png");
FileUtils.copyFile(src, dest);


	}

}
