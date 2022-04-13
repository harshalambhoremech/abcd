package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestNglisteners implements ITestListener {
  @Override
	public void onTestStart(ITestResult result) {

		ITestListener.super.onTestStart(result);
		System.out.println("To test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		System.out.println("To test success");
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		System.out.println("To test Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		ITestListener.super.onTestSkipped(result);
		System.out.println("To test Skipped");
	}


}
