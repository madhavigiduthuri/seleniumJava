package alertwindowhandles;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Alerts {
	WebDriver driver;
	
  @Test
  public void okbuttoninalert() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  // driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();  --using selectorsHub tool another way ...
	  Thread.sleep(2000);
	  
	  
	  //popup msgs ki right click option work avadhu so xpath rayalem so alati time how to do anedhi topic below;
	  //how to handle pop up msgs in seleniu?
	  driver.switchTo().alert().accept();
	  
   }
  
  @Test
  public void cancelbuttoninalert() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/confirmation-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-725\"]/div/div/div/div/div/div/div/button")).click();
	  // driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();  --using selectorsHub tool another way ...
	  Thread.sleep(2000);
	
	  driver.switchTo().alert().dismiss();
	  
   }
  
  @Test
  public void sendtextinalert() throws InterruptedException {
	  driver.get("https://www.techlearn.in/code/prompt-dialog-box/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();  //relative xpath from selectorshub
	  Thread.sleep(2000);
//	  driver.switchTo().alert().sendKeys("Madhu");  //pop up msg input ki sendkeys next ok button ki below line like previous
//	  driver.switchTo().alert().accept();

	  //another way to write the above lines advanced learning..
	  //when we will use dis alert classes means no.of forms execution like same alerts multiple places need to exec we use dis..
	  
	  Alert alt = driver.switchTo().alert();
	  alt.sendKeys("Madhu");
	  alt.accept();
   }
  
  @Test
  public void noalert() throws InterruptedException {
	  driver.get("https://www.techlearn.in/");
	  Thread.sleep(2000);
	
	  driver.switchTo().alert().accept();  //ee page lo alerts lekunda mana alerts vaste accept ani raste console lo tastcase fail avii noAlertPresentException ani vasthundhi...
	  
   }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
