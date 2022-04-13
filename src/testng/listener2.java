package testng;

import org.testng.annotations.Test;

import bsh.NameSource;
import bsh.NameSource.Listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class listener2{
	WebDriver driver;

  @BeforeClass
  public void before() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize(); 
	  
  }
  @Test
  public void login() {
	  String title=driver.getTitle();
	  System.out.println(title);

  }
  @Test
  public void logi() {
	  String title=driver.getCurrentUrl();
	  System.out.println(title);

  }


  
}

