package selenium;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {

	public static void main(String[] args) throws InterruptedException {
		
		//sys.set property
	System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	
	// object of interfce
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement id =driver.findElement(By.id("email"));
	id.sendKeys("7387907235");
	WebElement pass =driver.findElement(By.xpath("//input[@type='password']"));
	pass.sendKeys("Gaurav@1");
	      WebElement botton = driver.findElement(By.name("login"));
	      botton.click();
	      Thread.sleep(5000);
         WebElement watch =driver.findElement(By.xpath("//a[@aria-label='Watch']")); 
	      watch.click();
	      Thread.sleep(8000);
	      //interface 
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(0,1000)");
	      
	   
	
	
	

	}

}
