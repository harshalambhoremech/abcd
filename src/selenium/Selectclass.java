package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) throws InterruptedException {
		
		//step-1
	
		System.setProperty("webdriver.chrome.driver", "F:\\\\Gaurav\\\\setup\\\\chromedriver.exe");
		
		//step-2
		
		WebDriver driver = new ChromeDriver();
		
		//step-3
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		//step-4-javascriptexecutor
		//it is an method use to scroll the webpage
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//step-5-findElement
	
	       WebElement cs=  driver.findElement(By.xpath("//*[@class='custom-control-label']"));
		       cs.click();
		       
		     WebElement  cd =  driver.findElement(By.xpath("//*[@class='header-text']"));
		     cd.click();
		     WebElement gv =driver.findElement(By.xpath("//*[@class='text']"));
		     gv.click();
		     
		     WebElement jd=driver.findElement(By.xpath("//*[@id='userName']"));
		     jd.sendKeys("Gaurav Dange");
		     
		     Thread.sleep(2000);
		     
		     WebElement rd =driver.findElement(By.xpath("//*[@id='userEmail']"));
		     rd.sendKeys("dangeg9@gmail.com");
		     
		     Thread.sleep(2000);
		     
		    WebElement sd = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		    sd.sendKeys("Chintamani apartment,right bhusari colony,kothrud,pune");
		    
		    Thread.sleep(2000);
		    
		   WebElement vd= driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		   vd.sendKeys("At.post Dhamangao (Gadhi),Tq-achalpur ,Dist.-Amaravti");
		   Thread.sleep(2000);
		   
		
		   
		  JavascriptExecutor js1 = (JavascriptExecutor)driver;
		  js1.executeScript("window.scrollBy(0,800)");
		   
		   WebElement td =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		   td.click();
		       
		
	

	
		
		
		
		
		
		
	       
	         
		
		
		
		

	}

}
