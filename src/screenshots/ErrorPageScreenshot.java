package screenshots;


import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorPageScreenshot {
WebDriver driver;

public void ErrorPageLineScreenshot() throws Exception {	
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File("D:\\LIB\\Screenshots\\Errorlinescreen1.png"));
}
		
	@Test
	public void techlearnlogin() throws Exception {
		driver.get("https://www.techlearn.in/wp-login.php");	
		
		try
		{
			driver.findElement(By.id("user_login")).sendKeys("chanukya");
			Thread.sleep(1000);
		
			driver.findElement(By.name("pwdxyz")).sendKeys("Test123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("rememberme")).click();
			Thread.sleep(1000);

			driver.findElement(By.name("wp-submit")).click();
			Thread.sleep(1000);
		
			driver.findElement(By.className("wp-login-lost-password")).click();
			Thread.sleep(1000);
		}
		
		catch(Exception e)
		{
			System.out.println("Error Page: "+e);
			ErrorPageLineScreenshot();
		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}