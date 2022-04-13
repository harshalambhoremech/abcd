package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File Destination = new File(System.getProperty(("user.dir")+"ScreenShot2.png"));
		FileHandler.copy(Source, Destination);
		System.out.println("capture screenshot");
		
		

	}

}
