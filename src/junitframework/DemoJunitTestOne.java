package junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoJunitTestOne {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	void fb() {
		driver.get("https://www.facebook.com");
	}
	
	@Test
	void google() {
		driver.get("https://www.google.com");

	}
	
	@Test
	void selenium() {
		driver.get("https://www.flipkart.com");

	}
	
	@Test
	void tl() {
		driver.get("https://www.techlearn.in");

	}
	
	@Test
	void x() {
		driver.get("https://www.x.com");

	}


}
