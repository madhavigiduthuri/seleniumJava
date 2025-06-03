package log4jframework;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlearnLogin {
	WebDriver driver;
	
  @Test
  public void login() {
	  Logger log= Logger.getLogger("TechlearnLogin");
	  PropertyConfigurator.configure("Log4j.properties");
	  // above 2 lines code techlearn --tutorials --log4j code techukunam
	  
	  driver = new ChromeDriver();
	 // System.out.println("Chrome Browser Lauched");
	  log.info("Chrome Browser Lauched");  // ee line manam 18th line lo rayakudadhu browser lauch avakunda msg post avakudadhu 
	  
	  driver.manage().window().maximize();
	 // System.out.println("Chrome Browser Window Maximized");
	  log.info("Browser Window Maximized");

	  driver.get("https://www.techlearn.in/admin");
	  log.info("Navigate to Techlearn Login page");
	  
	  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Madhuu");
	  log.info("Enter the user name ");

	  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Kumar@10");
	  log.info("Enter the password");
	  
	  driver.findElement(By.xpath("//input[@id='rememberme']")).click();
	  log.info("Remember me Check box is selected");
	  
	  driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	  log.info("Login Fails");
	  
	  }
}
