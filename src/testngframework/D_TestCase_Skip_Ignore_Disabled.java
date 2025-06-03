package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class D_TestCase_Skip_Ignore_Disabled {
	
	WebDriver driver;
  
	 @Test(priority=4, enabled=false)  //it will not executes condition is false
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  
	  @Test(priority=1)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  
	  @Test(priority=0,enabled=true)  //it will executes condition is true
	  public void techlearn() {
		  driver.get("https://www.techlearn.in");
	  }
	  
	  @Test(priority=3)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  
	  @Test(priority=5)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  
	  @Test(priority=2)
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  
	  @Ignore
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
