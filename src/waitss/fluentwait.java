package waitss;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;

public class fluentwait {
WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  
		  System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		  driver.manage().window().maximize();	
		  
  }
  @Test
  public void alert() {
	  driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	  FluentWait<WebDriver> fwait =new  FluentWait<WebDriver>(driver);
	  
	 WebElement text= driver.findElement(By.xpath("//*[@id='h2']"));
	  fwait.withTimeout(Duration.ofSeconds(20));
	fwait.  pollingEvery(Duration.ofSeconds(1));
	
	  
	  fwait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
	  if(text.getText().equals("Selenium Webdriver")) {
		  System.out.println("test case pass");
	  }
	  
	  
	  
  }

}
