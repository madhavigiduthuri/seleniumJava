package pagescrolldownup;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;
	
  @Test
  public void scrolldown() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	  
	  //below 2 nd stack overflow lo scroll down n up ki code techukunam and testsigma lo scrolling in selenium ante vasthundhi 2 lines...
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("scroll(0,3500)");  //without is 2 lines perfect scroll down not happen;
	 // jse.executeScript("window.scroll(0,3500)"); //we can write like dis also.
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("	//a[normalize-space()='Ecosystem page']")).click();  
	  //ee line raste proper ga ee ecosystem dagiraku velladhu ala perfect ga ecosystem click avali ante page scroll down ante (0, 3000) x axis,y axis --page down ki ela page up scroll avali ante (3000,0);
	  
  }
  
  @Test
  public void scrollup() throws InterruptedException {
//	  driver.get("https://www.selenium.dev");
//	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
  
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("scroll(3500,0)"); //without is 2 lines perfect scroll up  happen;
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("	//a[normalize-space()='Ecosystem page']")).click();  
	  //ee line raste proper ga ee ecosystem dagiraku velladhu ala perfect ga ecosystem click avali ante page scroll down ante (0, 3000) x axis,y axis --page down ki ela page up scroll avali ante (3000,0);
	  
  }
  
  //above 2 test cases lo first em execute and 2nd textcase lo code ni comment cheyadam valla direct ga scroll up abuthundhi
  
  //below code anna own approch here no need to write perfect lines by using coordinates with element we can simply write code...
  
  @Test
  public void IdentifyLocatorElementmethod() throws InterruptedException {
	  driver.get("https://www.selenium.dev");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	  {
		  WebElement  element = (WebElement) driver.findElement(By.xpath("//a[normalize-space()='Ecosystem page']"));  
		  Coordinates coordinate = ((Locatable)element).getCoordinates();
		  coordinate.onPage();
		  coordinate.inViewPort();
	  }
	  
	  driver.findElement(By.xpath("	//a[normalize-space()='Ecosystem page']")).click();  
	  //ee line raste proper ga ee ecosystem dagiraku velladhu ala perfect ga ecosystem click avali ante page scroll down ante (0, 3000) x axis,y axis --page down ki ela page up scroll avali ante (3000,0);
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
