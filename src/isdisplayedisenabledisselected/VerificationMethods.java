package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerificationMethods {
	WebDriver driver;
	
  @Test
  public void verifyisDisplayedMethod() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  
	  boolean lyp = driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).isDisplayed();  //boolean is return type for isDisplayed method
	  
	  if(lyp==true) {
		  
		  System.out.println("Lost your password link is displayed in loginpage");
		  driver.findElement(By.xpath("//a[@class='wp-login-lost-password']")).click();
		  System.out.println("Lost your password link is clicked and navigate to the lost your password page");

	  }
	  
	  else {
		  
		  System.out.println("Lost your password link is not displayed in loginpage");

	  }
  }
  
  @Test
  public void verifyisEnabledMethod() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  
	  boolean username = driver.findElement(By.xpath("//input[@id='user_login']")).isEnabled();  //boolean is return type for isEnabled method
	  
	  if(username) {
		  
		  System.out.println("Username field is enabled in loginpage");
		  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Sk");

	  }
	  
	  else {
		  
		  System.out.println("Username field is not enabled in loginpage");

	  }
  }
  
  @Test
  public void verifyisSelectedMethod() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  
	  boolean checkBox = driver.findElement(By.xpath("//input[@id='rememberme']")).isSelected();  //boolean is return type for isSelected method
	  
	  if(checkBox==true) {
		  
		  System.out.println("Remember me checkbox is selected in loginpage");
		  driver.findElement(By.xpath("//input[@id='rememberme']")).click();

	  }
	  
	  else {
		  
		  System.out.println("Remember me checkbox is not  selected in loginpage");

	  }
  }
  

  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
