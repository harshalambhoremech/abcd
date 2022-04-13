package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class parallel2 {
	WebDriver driver;
  
  @BeforeClass
  public void loginpage() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/login");
  }
  @Test
  public void gettitle1() {
	  
	  String v=driver.getTitle();
	  System.out.println(v);
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
