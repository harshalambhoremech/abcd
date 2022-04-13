package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Parallel {
	WebDriver driver;
  
  
  @BeforeClass
  public void openpage() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
  }

  @Test
  public void gettitle() {
	 String s= driver.getTitle();
	 System.out.println(s);
  }
  
 
  

}
