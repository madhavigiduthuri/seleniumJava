package testngframework;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class F_TestCase_Invocation_Count {
	WebDriver driver;
	
  
	   @Test(invocationCount=5)
	    public void techlearnlogin() throws InterruptedException { 
		  driver.get("https://www.techlearn.in/wp-login.php");
		  driver.findElement(By.id("user_login")).sendKeys("Madhavi");
		  driver.findElement(By.name("pwd")).sendKeys("xxxxxx");
		  driver.findElement(By.id("rememberme")).click();
		  driver.findElement(By.id("wp-submit")).click();
		  driver.findElement(By.className("wp-login-lost-password")).click(); 
	  } 
	
	   @Test
		public void totalimages() throws InterruptedException {
		    driver.get("https://www.ndtv.com");
		    Thread.sleep(1000);

		    List<WebElement> totalimages = driver.findElements(By.tagName("img"));    
		    System.out.println("Total images on ndtv website: " + totalimages.size());
		} 
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
