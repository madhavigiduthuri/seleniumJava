package fileupload;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UploadFile {
	WebDriver driver;
	
  @Test
  public void fileAttachment() throws InterruptedException {
	  driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//input[@id='myFile']")).sendKeys("D:\\My Downloads\\Img.jpg"); //anything we can attach here like manual file or img..
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
