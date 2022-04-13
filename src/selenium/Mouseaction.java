package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html#top");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,800)");
		
		driver.get("https://jqueryui.com/slider/");
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement rd =driver.findElement(By.xpath("//*[@id='slider']//span"));
		
		//Action class
		
		Actions act = new Actions (driver);
		
		act.clickAndHold(rd).moveByOffset(400, 0).build().perform();
		act.clickAndHold(rd).moveByOffset(-200, 0).build().perform();
		
		
		
		
	}

}
