package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromed {

	public static void main(String[] args) {
		//use system.setprorperty method 
		//inthat put the "which type of webdrier we use and pah of the driver 
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		//creat the interface for thr parent class and child class
		WebDriver driver = new ChromeDriver	();
		
		//creat the driver.get method
		
		driver.get("https://github.com/operasoftware/operachromiumdriver/releases");
		
		
	}

}
