package iframeshandle;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Iframes {
	WebDriver driver;
	
  @Test
  public void frames() throws InterruptedException  {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  Thread.sleep(2000);
	  
//	  WebElement obj = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]")); 	  //-copy the ifames tag attribute+attributeVale at inspect at try it
//	  driver.switchTo().frame(obj);  //--one way of writing --1st approch
	  
	//  driver.switchTo().frame(2);  //--2nd approch but not suggestable to use 
	  
	  driver.switchTo().frame("iframeResult");  //approch 3rd  ---imp approch anni test cases useful 
	  
	  driver.findElement(By.xpath("/html/body/button")).click();  //--in iframes lo xpath or any locator will work directly without iframes xpath won't work  here .. .
	  //Iframes to use we have 3 approches aare there..
	  driver.switchTo().alert().accept();
	  
	  driver.switchTo().defaultContent();  // iframe nunchi bayatiki ravadam kosam use chestham defaultContent method not only frame deni lopali nunchi bayati ravali ante main page  ela ravali
	  //default content ante entha inside vellina direct ga anni boxes nunchi bayatiki ochestham ...main page vellipothundhi 
	  
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  // ex: iframe1,iframe2.iframe3 vunte 3 to 2,2 to 1 ala ravali ante above 3 approches use chesi bayatiki ravochu
	  //one more method is thre parentframe method --one step back only like parent child
	  driver.switchTo().parentFrame();
	  
	  //seperate boxes vunte parentframe use cheyalem but box inside boxes one by one move avali ante parentframe 
	  //seperate boxes ki matram 3 approches use cheyali.
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
