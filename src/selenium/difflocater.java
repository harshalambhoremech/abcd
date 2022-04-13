package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class difflocater {

	public static void main(String[] args) throws InterruptedException {
		// create method
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		// create object
		
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       
                    WebElement username = driver.findElement(By.id("email"));
                    username.sendKeys("7387907235");
                    
                    WebElement pass = driver.findElement(By.id("pass"));
                    pass.sendKeys("Gaurav@1");
                    
                    
                    WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
                    button.click();
                    
                    WebElement link = driver.findElement(By.linkText("forgot your password"));
                    link.click();
                    
                    Thread.sleep(8000);
                    
                    	
                    
                  
                    
                    
                    

	}

}
