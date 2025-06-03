package testngframework;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class E_TestCase_TimeOut_Feature {
	WebDriver driver;
	
  
	   @Test
	    public void techlearnlogin() throws InterruptedException {  //id,name,className locators 
		  driver.get("https://www.techlearn.in/wp-login.php");
		  driver.findElement(By.id("user_login")).sendKeys("Madhavi");
		  driver.findElement(By.name("pwd")).sendKeys("xxxxxx");
		  driver.findElement(By.id("rememberme")).click();
		  driver.findElement(By.id("wp-submit")).click();
		  driver.findElement(By.className("wp-login-lost-password")).click(); 
	  } 
	   
	   @Test(timeOut=3000)
		public void totalimages() throws InterruptedException {
		    driver.get("https://www.ndtv.com");
		    
		    List<WebElement> totalimages = driver.findElements(By.tagName("img"));    
		    System.out.println("Total images on ndtv website: " + totalimages.size());
		} 
	   
	   @Test(timeOut=3000)
		public void xpathtutorial() throws InterruptedException {
			driver.get("https://www.techlearn.in/admin");
			driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("SK");   
			driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("abcd");  
			driver.findElement(By.xpath("/html/body/div[1]/form/p[2]/input")).click(); 
			driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click(); 
			
		}
	   
		@Test
		public void totalnumberoflinksonndtv() throws InterruptedException {
		    driver.get("https://www.ndtv.com");
		    Thread.sleep(1000);

		    List<WebElement> totallinks = driver.findElements(By.tagName("a"));    
		    System.out.println( totallinks.size());
		    System.out.println("Total links on NDTV website: " + totallinks.size());
		} 
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
