package browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowsers {
	
	
 // ------------------------------------------------------------------------------------------------------------------
	
//	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver(); interview point of view answer --how to lauching web browser in selenium 		
	
//			WebDriver driver =  new ChromeDriver();
		
//		WebDriver m =  new ChromeDriver();  //reference obj we can use any name to it
//		
//		WebDriver hyd =  new ChromeDriver();

		//  another way to write :
/*	ChromeDriver driver = new ChromeDriver();   we can write like dis also it is also correct way to write
		
//		WebDriver d =  new FirefoxDriver();   / to lauch firefox driver do like dis
		
	//	FirefoxDriver d = new FirefoxDriver(); */
		
//		WebDriver driver =  new EdgeDriver();
		
		// or 
//		EdgeDriver d = new EdgeDriver();
		
//		WebDriver driver = new SafariDriver(); // error beacuse no safari browser in my laptop 
		
//	}

	//--------------------------------------------------------------------------------------------------
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
	}
}
