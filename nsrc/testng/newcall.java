package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class newcall {
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty(null, null)
  }

  @AfterMethod
  public void afterMethod() {
  }

}
