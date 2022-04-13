package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelextracton {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		//Step-1-
		FileInputStream file = new FileInputStream("F:\\Gaurav\\Parameterization\\login facebook.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	 String Firstname = sh.getRow(0).getCell(0).getStringCellValue();
	 System.out.println(Firstname);
	 String Lastname = sh.getRow(0).getCell(1).getStringCellValue();
	 System.out.println(Lastname );
	 
	 System.setProperty("webdriver.chrome.driver","F:\\Gaurav\\setup\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 WebElement name=driver.findElement(By.xpath("//*[@name='firstname']"));
	 name.click();
	 WebElement lastname =driver.findElement(By.xpath("//*[@name='lastname']"));
	 lastname.click();
	
	Thread.sleep(4000);
	driver.close();
 
		

	}

}
