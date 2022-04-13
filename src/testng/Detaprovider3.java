package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
@Listeners(testng.TestNglisteners.class)
public class Detaprovider3 {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {	
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	    
  }
  @Test(dataProvider="testdata")
  public void login(String u,String p) throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(u);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(p);
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id='email']")).clear();
	  Thread.sleep(2000);

  }
  @DataProvider(name="testdata")
	  public String[][]getdata(){
		  String[][]data={{"abc@gmail.com","123456"},{"def@gmail.com","54878979"}
		  };
		  return data;
		  }
  
  
		  
	  
	  }
  
  


