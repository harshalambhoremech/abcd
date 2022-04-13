package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTestfacebook {
	WebDriver driver;
	
  
  @BeforeClass
  public void init() {
	 System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	  
  }
  
  @Test 
  public void login() throws InterruptedException {
	  	WebElement no=driver.findElement(By.xpath("//*[@id='email']"));
	  	no.sendKeys("7387907235");
	  	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Gaurav@2");
	  	driver.findElement(By.xpath("//*[@name='login']")).click();
	  	
	  	Thread.sleep(4000);
  }
  
  @Test 
  public void logout() {
	  driver.findElement(By.className("'a8c37x1j ms05siws hwsy1cff b7h9ocf4 rs22bh7c fzdkajry jnigpg78 odw8uiq3'")).click();
	  
  }
  

  @AfterClass
  public void afterClass() {
	  
	  
	  
	  
  }

}
