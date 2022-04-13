package testng;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.DbSystemValues;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Parameter {
	WebDriver driver;
	@Parameters("Browser")
   @BeforeClass
  public void beforeClass(String name) {
		if(name.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
  }
		else if(name.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Gaurav\\setup\\GeckoDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			
			
		}
	}
	@Test
	public void login() {
		String u=driver.getTitle();
		System.out.println(u);
	}
	@Test
	public void geturl() {
		String p=driver.getCurrentUrl();
		System.out.println(p);
	}

}
