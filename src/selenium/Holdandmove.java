package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Holdandmove {

	public static void main(String[] args) throws InterruptedException {
		//step-1
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		//step-2-webdriver is an interface and chrome is an
		//browsw upcasting is happen hear chrome drowswe upcast the property in to webDriver
		WebDriver driver = new ChromeDriver() ;
		//for openong the url we use get method
		
		driver.get("https://jqueryui.com/slider");
		
		driver.manage().window().maximize();
		
		//we can not deal with the element present on the iframe
		
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		//our element is present on iframe so we haveto switch our focus 
		driver.switchTo().frame(frame);
		//firstly find the webelement for frame
		
	WebElement slider =	driver.findElement(By.xpath("//*[@id='slider']//span"));
	
	//we have to perfrom action on the element hold and move
	//creat the action 
	
	Actions act = new Actions(driver) ;
	act.clickAndHold(slider).moveByOffset(400, 0).release().build().perform();
	Thread.sleep(5000);
	act.clickAndHold(slider).moveByOffset(-200,0).release().build().perform();
	
	driver.close();
	
	
	
	
	
	
		
		
		

	}

}
