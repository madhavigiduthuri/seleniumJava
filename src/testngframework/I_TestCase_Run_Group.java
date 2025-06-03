package testngframework;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class I_TestCase_Run_Group {
	WebDriver driver;
	
	 @Test(groups="bugtool")
	  public void mantisbt() {
		  driver.get("https://www.mantisbt.org/");
	  }
	
	 @Test(groups="food")
	  public void zomato() {
		  driver.get("https://www.zomato.com");
	  }
	  
	  @Test(groups="bugtool")
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  }
	  
	  @Test(groups="testingwebsite")
	  public void techlearn() {
		  driver.get("https://www.techlearn.in");
	  }
	  
	  @Test(groups="search")
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	  
	  @Test(groups="social")
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  
	  @Test(groups="social")
	  public void twitter() {
		  driver.get("https://www.x.com");
	  }
	  
	  @Test(groups="bugtool")
	  public void redmine() {
		  driver.get("https://www.redmine.org");
	  }
	  
	  @Test(groups="food")
	  public void swiggy() {
		  driver.get("https://www.swiggy.com");
	  }
	  
	  @Test(groups="bugtool")
	  public void jira() {
		  driver.get("https://www.jira.com");
	  }
	  
	  @Test(groups="bugtool")
	  public void bugzilla() {
		  driver.get("https://www.bugzilla.org/");
	  }
  
	  @Test(groups="automationtool")
	  public void playwrite() {
		  driver.get("https://www.playwrite.dev");
	  }
	  
  @BeforeTest(groups="social")
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
