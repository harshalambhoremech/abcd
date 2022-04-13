package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample2 {
  @Test(groups="wxyz")
 public void aa() {
	  
	  System.out.println("aa");
	  Assert.assertTrue(true);
}
  @Test(groups="abcd")
 public void page() {
	  
	  System.out.println("page");
	  Assert.assertTrue(true);
}
}