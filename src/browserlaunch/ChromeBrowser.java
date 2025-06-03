package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		driver = new ChromeDriver();
		
//		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
//		driver.manage().window().minimize();  //only selenium 4 lo lauched
//		Thread.sleep(3000);
//		driver.manage().window().fullscreen();  //only selenium 4
//		driver.close();
		driver.quit();
	}
}

