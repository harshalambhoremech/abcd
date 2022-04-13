package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alarthandling {

	public static void main(String[] args) throws InterruptedException {
		
		// system.setproperty
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		//instance of object
		
		WebDriver driver =new ChromeDriver();
		//get method();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		
		
		
		WebElement jd=driver.findElement(By.xpath("//*[@id='name']"));
		
		jd.sendKeys("Maharastra");
		
		WebElement rd=driver.findElement(By.xpath("//*[@id='confirmbtn']"));
		rd.click();

		Alert alertwindow =driver.switchTo().alert();
		String massage =alertwindow.getText();
		
		if (massage.contains("Maharastra")) {
			
			System.out.println("text match");
			alertwindow.accept();
			
		}
		else {
			
			System.out.println("text not match");
			alertwindow.dismiss();
		}
		
		
		
		
//		driver.findElement(By.xpath("//*[name='enter-name']")).sendKeys("Vignhartaa");
//		driver.findElement(By.xpath("//*[@id='confirmbtn']")).click();
//		
//		
//		
//		//findelement method
//	//	driver.findElement(By.xpath("//*[@id='alertbtn']")).click();
//		
//		//switch to alart button
//		Alert  alertwindow =driver.switchTo().alert();
//		
//		Thread.sleep(3000);
//		
//		//alertwindow.accept();
//		String massage =alertwindow.getText();
//		
//		if(massage.contains("Vignhartaa")) {
//		
//			
//		System.out.println("text match");
//		alertwindow.accept();
//		
//			
//		}
//		else {
//			
//			System.out.println("text not match");
//			alertwindow.dismiss();
//		}
//		
//		
//		
//		
//		

	}

}
