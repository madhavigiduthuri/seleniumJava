package dropdownselect;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class SelectDropdownOptions {
	WebDriver driver;
	
  @Test
  public void selectdropdownvalues() throws InterruptedException {
	  driver.get("https://www.redmine.org/account/register");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"user_mail\"]")).sendKeys("techlearn.india@gmail.com");
	  Thread.sleep(2000);
	  Select lan = new Select(driver.findElement(By.xpath("//*[@id=\"user_language\"]")));
	  lan.selectByContainsVisibleText("Indonesian");  //half word echina teskuntundhi ee case lo
	  //lan.selectByIndex(7);
	  //lan.selectByValue("ja");
	  //lan.selectByVisibleText("Spanish (Español)");
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
