package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest12 {
  @Test(groups="sanity")
  public void Homepage() throws InterruptedException {
	  System.out.println("Homepage");
	  Thread.sleep(5000);
  }
  @Test(groups="regression")
  public void Signin() {
	  System.out.println("Signin");
	  Assert.assertTrue(true);
  }
  @Test(groups="sanity")
  public void logout() {
	  System.out.println("Logout");
  }
  @Test(groups="regression")
  public void  webpage() {
	  
	  System.out.println("webpage");
  }
}
