package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class H_TestCase_Execution_From_XML {
	WebDriver driver;
	
  @Test
  public void zomato() {
	  driver.get("https://www.zomato.com");
  }
  
  @Test
  public void selenium() {
	  driver.get("https://www.selenium.dev");
  }
  
  @Test
  public void techlearn() {
	  driver.get("https://www.techlearn.in");
  }
  
  @Test
  public void google() {
	  driver.get("https://www.google.com");
  }
  
  @Test
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  
  @Test
  public void twitter() {
	  driver.get("https://www.x.com");
  }
  
  @Test
  public void redmine() {
	  driver.get("https://www.redmine.org");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
