package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
			
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://gaana.com/playlist/priyankathomas5-onlinegaana");

	}

}
