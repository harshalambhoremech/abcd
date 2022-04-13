package pomclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class LostTest extends BaseTest {
	Loginclass lc;
 
  @BeforeClass
  public void beforeClass() {
	  lc= new Loginclass(driver);
	  
  }
  @Test
  public void m1() {
	  lc.usernametab().sendKeys("Admin");
	  lc.passwordtab().sendKeys("admin123");
	  lc.buttontab().click();

 

}
  }
