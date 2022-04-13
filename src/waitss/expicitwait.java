package waitss;

import org.testng.annotations.Test;

import graphql.Assert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class expicitwait {
	WebDriver driver;
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		  driver.manage().window().maximize();
		  // now we use implicitywaits
		//  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		  
	  }
	  @Test
	  public void login() {
	
		  driver.findElement(By.xpath("//*[@id='alert']")).click();
	
	  //expicitwait  (wait + condition)
	WebDriverWait wait = new WebDriverWait (driver,4);
	
	wait.until(ExpectedConditions.alertIsPresent());
	Alert ar =driver.switchTo().alert();

	ar.accept();
	
		  
		   
	  }
}
