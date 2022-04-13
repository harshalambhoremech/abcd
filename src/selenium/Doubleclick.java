package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubleclick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		//Switch focus to frame
		
		WebElement frame =driver.findElement(By.xpath("//*[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0__container__']"));
		driver.switchTo().frame(frame);
		
		
		

	}

}
