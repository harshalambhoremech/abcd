package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Screenshot2 {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/sign-up/s?k=sign+up&page=2");
		
		// interface for ScreenShot
		TakesScreenshot tss = (TakesScreenshot) driver;
		
		File Source =tss.getScreenshotAs(OutputType.FILE);
		File Destination = new File("F:\\Screenshote2.png");
		FileHandler.copy(Source, Destination);
		System.out.println("Capture screenhote");
		
		driver.close();

	}

}
