package pomclass;

import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	public static WebDriver driver;
    @BeforeSuite
  public void beforeSuite() {
    	System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
    	
  }

  @AfterSuite
  public void afterSuite() {
	  //driver.close();
  }

}
