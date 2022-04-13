package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gv1 {

	public static void main(String[] args) throws InterruptedException {
		
		//step-1-system.set prorpty we write 
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		// step-2-create object for inteface
		
		WebDriver driver = new ChromeDriver();
		
		//step-3-we use get method for opining the web page
		
		driver.get("https://demoqa.com/automation-practice-form");
		// maximize the page
		driver.manage().window().maximize();
		
		//  step-4-JavascriptExecutor -it an interface we can use for scroll the web page
		
		JavascriptExecutor jd = (JavascriptExecutor) driver;
		jd.executeScript("window.scrollBy(0,500)");
		
		// step-5-we have to find an element so use findelement method;
		
	WebElement tik	=driver.findElement(By.xpath("//*[@class='custom-control-label']"));
	tik.click();
	
	//step-click on the elements;
	
//	       WebElement tok= driver.findElement(By.linkText("Elements"));
//	       tok.click();
	
	WebElement element =driver.findElement(By.xpath("//*[@class='header-text']"));
	element.click();
	
	// click on 
	
	WebElement textbox =driver.findElement(By.xpath("//*[@class='text']"));
	textbox.click();
	
	// enter name
	
	WebElement name =driver.findElement(By.id("userName"));
	name.sendKeys("Rohit Biradar");
	
	Thread.sleep(2000);
	
	//write E-mail
	
	WebElement email =driver.findElement(By.xpath("//*[@class='mr-sm-2 form-control']"));
	email.sendKeys("rohit123@gmail.com");
	
	Thread.sleep(2000);
	
	//current address
	
	WebElement add =driver.findElement(By.xpath("//*[@id='currentAddress']"));
	add.sendKeys("aurangabadh");
	
	Thread.sleep(2000);
	
	//permanant add
	
	WebElement per =driver.findElement(By.xpath("//*[@id='permanentAddress']"));
	per.sendKeys("at post udgir tq-udgir dist.latur");
	
	// scroll
	
	JavascriptExecutor nc = (JavascriptExecutor) driver;
	nc.executeScript("window.scrollBy(0,600)");
	
	
	//click on submit
	WebElement submit =driver.findElement(By.xpath("//*[@id='submit']"));
	submit.click();
	
	
	
	
	
	
	
	
	
	

	
		
		

	}

}
