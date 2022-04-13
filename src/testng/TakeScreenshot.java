package testng;

import org.testng.annotations.Test;

import selenium.CapturScreenShot;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;

public class TakeScreenshot extends listener1  implements ITestListener {
	CapturScreenShot sc;
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("to test fail");
		sc = new CapturScreenShot();
	String name = result.getName();
	
	try {
		sc.Shot(driver,name);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
 

}
