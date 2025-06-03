package newtabfunctionality;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTabs {
	WebDriver driver;
	
  @Test
  public void frames() throws InterruptedException  {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  
	  
	  driver.switchTo().frame("iframeResult");  
	  
	  driver.findElement(By.xpath("/html/body/button")).click();  
	  Thread.sleep(2000);

	  driver.switchTo().alert().accept();

	  
	  driver.switchTo().defaultContent();  
	  
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  Thread.sleep(2000);

	  //below two lines are imp for interview point of view
	  
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); //getWindowHandles method lo anni tabs store avuthundhi
	  driver.switchTo().window(tabs.get(1)); //to switch one tab to another tab based on index 
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[normalize-space()='PYTHON']")).click();
	  
	  driver.switchTo().window(tabs.get(0));  //tab close kakunda back ki vellali ante ela rayali
	  driver.close();  //closed the current opened tab
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
