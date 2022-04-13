package waits;

import org.testng.annotations.Test;

import graphql.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Hardassert {
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @Test
  public void login() {
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys("7387907235");
	  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Gaurav@2");
	  driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	  Assert.assertTrue(false);
	  System.out.println("jai ho ");
	  System.out.println("jai jai ho");
  }

}
