package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandmove {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		WebElement frame =driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
	  driver.switchTo().frame(frame);
	 WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
	 
	 Actions act = new Actions(driver);
	 
	 act.dragAndDropBy(drag, 200, 150).dragAndDropBy(drag, 400, 400).build().perform();


	 driver.close();
	  
		

	}

}
