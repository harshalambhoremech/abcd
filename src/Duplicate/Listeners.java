package Duplicate;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class Listeners {
 WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();  
  }
  @Test
  public void gettitle() {
	  String s=driver.getTitle();
	  System.out.println("gettitle"+s);
  }
  @Test
  public void geturl() {
	  String g=driver.getCurrentUrl();
	  System.out.println("string url"+g);
  }

}
