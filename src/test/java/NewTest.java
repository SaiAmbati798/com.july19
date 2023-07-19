import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println();
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println();
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println();
  }

}
