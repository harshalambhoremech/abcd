package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class As {
	WebDriver driver;
  @BeforeClass
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  
  }

  @Test
  public void gettitle() {
	 String u= driver.getCurrentUrl();
	 System.out.println(u);
	 Assert.assertTrue(false);
 System.out.println("hi hello");
	
  }
  @Test
  public void get() {
  String v=driver.getTitle();
  System.out.println(v);
  SoftAssert sa = new SoftAssert();
  sa.assertTrue(false);
  System.out.println("hello");
  System.out.println("jai ho");
  sa.assertAll();
  
  }
}
