package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunitTestTwo {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Disabled  //This is only applicable for  junit 5
	@Test
	void fb() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	void google() {
		driver.get("https://www.google.com");

	}
	
	@Disabled

	@Test
	void selenium() {
		driver.get("https://www.flipkart.com");

	}
	
	@Test
	void tl() {
		driver.get("https://www.techlearn.in");

	}
	
	//@Disabled or Ignore
	@Ignore   //This is only applicable junit 3 And 4
	@Test
	void x() {
		driver.get("https://www.x.com");

	}


}
