package Duplicate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Duplicate.TestListener .class)
public class Group10 {
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
