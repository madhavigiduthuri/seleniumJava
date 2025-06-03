package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(3000);
								
		WebElement lyp = driver.findElement(By.xpath("//*[@id=\"nav\"]/a"));

		File f = lyp.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\LIB\\Screenshots\\l.png")); 
		
		
		
	/*	WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("TestNG"); */
		
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}