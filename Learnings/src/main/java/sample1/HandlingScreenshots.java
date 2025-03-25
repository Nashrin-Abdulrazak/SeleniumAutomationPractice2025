package sample1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class HandlingScreenshots {

	public static void main(String[] args) throws IOException, InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.greetingsisland.com/preview/cards/circus/92-18459");
driver.manage().window().maximize();
Thread.sleep(1000);
/*File src = driver.getScreenshotAs(OutputType.FILE);
File destination=new File("./screenshot/snap.png");
FileUtils.copyFile(src, destination);*/
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f, new File("./screenshot/snap_27.png"));





	}


}
