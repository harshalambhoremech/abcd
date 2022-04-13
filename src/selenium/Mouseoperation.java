package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoperation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//*[@id='dropdown-class-example']")).click();
		
		//Action class-mouse andf keyboard
		
		Actions act = new Actions (driver);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
		
		driver.close();
		
		
		
		

	}

}
