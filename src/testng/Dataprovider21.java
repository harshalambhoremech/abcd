package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class Dataprovider21 {
  WebDriver driver;
  @BeforeClass
  public void m1() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/login/");
	  driver.manage().window().maximize();
  }
	  @Test(dataProvider="testdata")
	  public void afterMethod(String a,String b) throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id='email']")).sendKeys(a);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(b);
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		  Thread.sleep(2000);
		  driver.navigate().back();
		  driver.findElement(By.xpath("//*[@id='email']")).clear();
		  Thread.sleep(2000);  

	  }
	  @DataProvider(name="testdata")
	  public String [][]getdata(){
		  String [][]data= {{"abc@gmail.com","123456"},{"def@gmail.com","12354654"}};
		return data;
		  
	  

  }

}

