package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class attributepractice {
  @Test (groups="wxyz")
  public void homepage() {
	  
	  System.out.println("homepage");
	  Assert.assertTrue(true);
  }
  @Test(groups="abcd")
  public void signin() throws InterruptedException {
	  System.out.println("signin");
	  Thread.sleep(6000);
  }
  @Test(groups="wxyz")
  public void attribut () {
	  System.out.println("attribute");
  }
  @Test(groups="abcd")
  public void logout() {
	  System.out.println("Logout");
  }
}
