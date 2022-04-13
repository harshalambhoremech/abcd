package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagaram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement id =driver.findElement(By.id("email"));
		id.sendKeys("7387907235");
		
		WebElement pass =driver.findElement(By.id("pass"));
		pass.sendKeys("");
		
	  WebElement button= driver.findElement(By.id("u_0_h_82"));
	  button.click();
	  Thread.sleep(8000);
	  driver.close();

	}

}
