package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openappication {

	public static void main(String[] args) throws InterruptedException {
		// firstly use method set property for (which broser) (path we have to use)
		
		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe" );
		
		//create object of the interface
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		driver.manage().window().minimize();
		Thread.sleep(8000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(8000);
		
		
//		driver.get("https://www.facebook.com");
//		WebElement id = driver.findElement(By.id("email"));
//		id.sendKeys("7387907235");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("splender@1");
//		WebElement login = driver.findElement(By.xpath("//button[text()='Log In']"));
//		login.click();
//		
		
		

	}

}
