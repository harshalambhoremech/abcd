package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdd {

	public static void main(String[] args) throws InterruptedException {
		//mthod for driver and location in system
	
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		//object of the webdriver intrface
		
		WebDriver driver = new ChromeDriver();
		
		//for opening the webpage with url
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(4000);
		
		WebElement gv=driver.findElement(By.xpath("//*[@id='alertbtn']"));
		gv.click();
		Thread.sleep(4000);
		
		//for switching the focus on alert window 
	Alert aw	=driver.switchTo().alert();
	aw.accept();
	Thread.sleep(4000);
	
	driver.close();
	
		
		
		
		
		  
		
		
		
		

	}

}
