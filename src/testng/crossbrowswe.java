package testng;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class crossbrowswe {
	WebDriver driver;
	@Parameters("browser")
  @BeforeClass
  public void beforeClass(String arg) {
		if(arg.equals("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com");
		}
		else if(arg.equals("Firefox")) {
			 System.setProperty("webdriver.gecko.driver", "F:\\Gaurav\\setup\\GeckoDriver\\geckodriver.exe");
			  driver =new FirefoxDriver();
			  driver.get("https://opensource-demo.orangehrmlive.com");
			
		}
  }
  @Test
  public void login() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	  Thread.sleep(2000);
	  
  }
  @Test
  public void logout() throws InterruptedException {
	 WebElement drop= driver.findElement(By.xpath("//*[ @id='branding']//a[@id='welcome']"));
	 drop.click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id='welcome-menu']//ul//li[3]//a[text()='Logout']")).click();

	  Thread.sleep(2000);
   
	  
  }


  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
