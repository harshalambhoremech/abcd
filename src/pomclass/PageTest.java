package pomclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class PageTest extends BaseTest {
	 Pageclass pc;

  @BeforeClass
  public void beforeClass() {
	  pc=new  Pageclass(driver);
	 
  }
  @Test
  public void m2() {
	  System.out.println("pass");
	  pc.meanutab().click();
	  pc.Logouttab().click();
  }

  @AfterClass
  public void afterClass() {
  }

}
