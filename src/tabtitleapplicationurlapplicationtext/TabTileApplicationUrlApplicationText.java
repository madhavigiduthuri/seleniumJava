package tabtitleapplicationurlapplicationtext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class TabTileApplicationUrlApplicationText {
	WebDriver driver;
	
  @Test
  public void verifytabtitle() {
	  driver.get("https://www.google.com");
	  
	  String exptabtext = "Google";
	  System.out.println("Expected Google Tab Title is:" + exptabtext);  //for our understanding purpose we use it
	  
	  //tabtitle methd getTitle deniki return type String andhuky manam string use chesthunam
	  
	  String acttabtext = driver.getTitle();
	  System.out.println("Actual Tab Title is:" + acttabtext);
	  
	  Assert.assertEquals(acttabtext, exptabtext);  //compare cheyali lekhapotey pass or fail ani chepalem 

  }
  
  @Test
  public void verifyapplicationurl() {
	  driver.get("https://www.google.com");
	  
	  String expappurltext = "https://www.google.com/";  //nromal ga website lo copy cheste stash radhu manam pettali otherwise fail avuhundhi ee testcase
	  
	  String actappurl = driver.getCurrentUrl();
	  
	  Assert.assertEquals(actappurl, expappurltext);  //first expappurltext,actappurl ela estey ee line lo reverse lo print avuthundhi compile matram proper ga ne chesthundhi

  }
  
  @Test
  public void verifyapplicationtext() {
	  driver.get("https://www.google.com");
	  
	  String expgtext = "Gmail";  //normal ga website lo copy cheste stash radhu manam pettali otherwise fail avuhundhi ee testcase
	  
	  String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/a")).getText();
	  
	  Assert.assertEquals(actgtext, expgtext);

	  String expimgtext = "Images";  //real time lo getText tho image ni verigy cheyalem only text verify cheyagalam but ekada images is text not img...
	  
	  String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[1]/div[2]/a")).getText();
	  
	  Assert.assertEquals(actimgtext, expimgtext);

  }
  
  
  @BeforeTest
  public void beforeTest() {
	
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}
