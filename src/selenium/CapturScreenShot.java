package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturScreenShot {
	public  void Shot(WebDriver driver,String name) throws IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File Source=tss.getScreenshotAs(OutputType.FILE);
		File Destination=new File("C:\\Users\\Rc\\eclipse-workspace\\gaurav\\src\\selenium"+name+".png");
	 FileHandler.copy(Source, Destination);
	 System.out.println("capture Screenshot");
		

		
	}
	
}
