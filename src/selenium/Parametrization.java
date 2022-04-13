package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parametrization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("F:\\Gaurav\\Parameterization\\New Microsoft Excel Worksheet.xlsx");

		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		String username = sh.getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(username);
		
        String username1 = sh.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(username1);
		
		System.setProperty("webdriver.chrome.driver", "F:\\Gaurav\\setup\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(username1);
		
		
		

	}


}
