package testng;

import org.testng.annotations.Test;

import graphql.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class listener1 {
	WebDriver driver;
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize(); 
  }
  @Test
  public void login() {
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertTrue(false);
  }
  @Test
  public void geturl() {
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
  }

}
