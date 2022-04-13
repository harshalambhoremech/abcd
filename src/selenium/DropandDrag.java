package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropandDrag {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		
		driver.switchTo().frame(frame);
		
	
	WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement drop =driver.findElement(By.xpath("//*[@id='droppable']"));
	
	Actions act = new Actions(driver);
	Thread.sleep(5000);
	
act.dragAndDrop(drag, drop).perform();
		
		
		
		
		

	}

}
