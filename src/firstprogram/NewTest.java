package firstprogram;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {

	WebDriver driver;

	@Test
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test
	public void twitter() {
		driver.get("httpswww.twitter.com");
	}
	
	@Test
	public void facebook() {
		driver.get("www.facebook.com");
	}
	
	@Test
	public void redmine() {
		driver.get("https://www.redmine.com");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
