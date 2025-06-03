package testngframework;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class G_TestCase_DependsOnMethods {
	WebDriver driver;
	
  
	   @Test(dependsOnMethods="method2")
	    public void method1() throws InterruptedException { 
		  driver.findElement(By.id("user_login")).sendKeys("Madhavi");
		  driver.findElement(By.name("pwd")).sendKeys("xxxxxx");
		  driver.findElement(By.id("rememberme")).click();
		  driver.findElement(By.id("wp-submit")).click();
		  driver.findElement(By.className("wp-login-lost-password")).click(); 
	  } 
	
	   @Test
		public void method2() throws InterruptedException {
			driver.get("https://www.techlearn.in/wp-login.php");
		    Thread.sleep(1000);

		    
		} 
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	//	driver.get("https://www.techlearn.in/wp-login.php");  --method1 lo url rayakapoiena ela rasina 2 testcases pass avuthundhi

  }

}
