package actionsclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RCDCDDMOKF {
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in");
	  Thread.sleep(2000);
	  
	  //imp lines for interview
	  Actions act = new Actions(driver);
	  act.contextClick(driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"))).build().perform();
  }
  
  @Test
  public void doubleclick() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/double-tap/");
	  Thread.sleep(2000);
	  
	  //imp lines for interview
	  Actions act = new Actions(driver);
//	  act.doubleClick(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//button[@ondblclick='handleDoubleTap()']"))).doubleClick().build().perform();

  }
  
  @Test
  public void draganddrop() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/drag-and-drop/");
	  Thread.sleep(2000);
	  
	  //imp lines for interview
	  Actions act = new Actions(driver);
	  WebElement source = driver.findElement(By.xpath("//img[@id='drag1']"));
	  
	  WebElement target = driver.findElement(By.xpath("//div[@id='div1']"));
	  
	  act.dragAndDrop(source, target).build().perform();
  }
  
  @Test
  public void mouseover() throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(2000);
	  
	  //imp lines for interview
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Tutorials']"))).build().perform(); 
	  //here we do mouse over on it not clicking thatswhy no need towrite click method here
	  Thread.sleep(2000);
//	  driver.findElement(By.xpath("//a[normalize-space()='Sikuli']")).click();  //normly we use for click regular way method dis..
	  act.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Sikuli']"))).click().build().perform();
  
  }
  
  @Test
  public void keyboardfunctions() throws InterruptedException {
	  driver.get("https://www.techlearn.in/admin");
	  Thread.sleep(2000);
	  
	  //imp lines for interview
	  Actions act = new Actions(driver);
//	  act.sendKeys(Keys.TAB).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
