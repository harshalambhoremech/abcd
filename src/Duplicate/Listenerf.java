package Duplicate;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

public class Listenerf {
WebDriver driver;
  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();  
  }
  @Test
  public void gettitle() {
	  String u=driver.getTitle();
	  System.out.println("Title of page"+u);
  }
  @Test
  public void geturl() {
	 String p= driver.getCurrentUrl();
	 System.out.println("url of current page"+p);
  }

}
