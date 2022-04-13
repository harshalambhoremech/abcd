package Duplicate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelsheet {

	public static void main(String[] args) throws IOException, InterruptedException {
		//step-1
		FileInputStream file = new FileInputStream("F:\\Gaurav\\Parameterization\\Fb.xlsx");
		Sheet s = WorkbookFactory.create(file).getSheet("Sheet1");
		String name = s.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
	    String last = s.getRow(0).getCell(1).getStringCellValue();
	   System.out.println(last); 
	   
	   //selenium
	   System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/signup");
	   
	   driver.manage().window().maximize();
	   
	   Thread.sleep(4000);
	   
	 WebElement na= driver.findElement(By.xpath("//*[@name='firstname']"));
	 na.sendKeys(name );
	 
	  Thread.sleep(4000);
	 
	 WebElement la= driver.findElement(By.xpath("//*[@name='lastname']"));
	 la.sendKeys(last );
	 
	 Thread.sleep(4000);
	 driver.close();
	 
	 
	 
	 

		

	}

}
