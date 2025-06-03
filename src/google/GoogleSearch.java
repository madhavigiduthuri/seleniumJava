package google;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class GoogleSearch {
  WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Hello TestNG");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
