package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://vctcpune.com/selenium/practice.html");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)");
	
	
	
	WebElement rr=driver.findElement(By.xpath("//*[@id='opentab']"));
	rr.click();
	

	}

}
