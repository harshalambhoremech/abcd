package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Tital {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "F:\\Gaurav\\setup\\operadriver_win64\\operadriver.exe");
		
		WebDriver driver = new OperaDriver();
		driver.get("https://www.youtube.com/");
	
		String expected = driver.getTitle();
		String actual = new String ("Youtube");
		if (expected.equals(actual)) {
			
			System.out.println("page is display"+ expected);
		}
		else {
			System.out.println("page not dispaly");
		}

	}

}
