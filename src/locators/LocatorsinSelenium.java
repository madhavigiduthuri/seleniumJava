package locators;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LocatorsinSelenium {
	
	WebDriver driver;
	
   @Test
    public void techlearnlogin() throws InterruptedException {  //id,name,className locators 
	  driver.get("https://www.techlearn.in/wp-login.php");
	  Thread.sleep(1000);
	  driver.findElement(By.id("user_login")).sendKeys("Madhavi");
	  Thread.sleep(1000);
	  driver.findElement(By.name("pwd")).sendKeys("xxxxxx");
	  Thread.sleep(1000);
	  driver.findElement(By.id("rememberme")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("wp-submit")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("wp-login-lost-password")).click(); 
  } 
  
   @Test
  public void cssSelector() throws InterruptedException {  //cssSelector id,class
	  driver.get("https://www.techlearn.in/wp-login.php");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#user_login")).sendKeys("madhuri");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("input#user_pass")).sendKeys("******");
	  Thread.sleep(1000);
	  driver.findElement(By.id("rememberme")).click();
	  Thread.sleep(1000);
//	 driver.findElement(By.cssSelector("a.wp-login-lost-password")).click();  //tagname.attribute and value.
	  
	  driver.findElement(By.cssSelector(".wp-login-lost-password")).click();  //.attribute and value
 
  }
  

	 @Test
	  public void linktextandpartiallinktext() throws InterruptedException {   //linkText,partialLikText --locators
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(1000);
		//linktext and partial link text use cheyali ante <a> ..</a> vundali --link tag for linkText
	//	driver.findElement(By.linkText("Lost your password?")).click();
		driver.findElement(By.partialLinkText("Lost")).click();
		
	}
	
	
	 @Test
	  public void totalnumberoflinks() throws InterruptedException {   //linkText,partialLikText --locators
		driver.get("https://www.techlearn.in/wp-login.php");
		Thread.sleep(1000);
		
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys("Suresh Kumar");
		
		WebElement pwd = driver.findElement(By.name("pwd"));
		pwd.sendKeys("madhuuu");
		
		WebElement check = driver.findElement(By.id("rememberme"));
		check.click();
	} 
	

	
	@Test
	public void totalnumberoflinksonndtv() throws InterruptedException {
	    driver.get("https://www.ndtv.com");
	    Thread.sleep(1000);

	    List<WebElement> totallinks = driver.findElements(By.tagName("a"));    
	    System.out.println( totallinks.size());
	    System.out.println("Total links on NDTV website: " + totallinks.size());
	} 
	
	
	
	@Test
	public void totalimages() throws InterruptedException {
	    driver.get("https://www.ndtv.com");
	    Thread.sleep(1000);

	    List<WebElement> totalimages = driver.findElements(By.tagName("img"));    
	    System.out.println("Total images on ndtv website: " + totalimages.size());
	} 
	
	 @Test
	public void totalimages1() throws InterruptedException {
	    driver.get("https://www.redmine.org");
	    Thread.sleep(1000);

	    List<WebElement> totalimages = driver.findElements(By.tagName("img"));    
	    System.out.println("Total images on ndtv website: " + totalimages.size());
	} 
	
	//8 locators -- xpath locator
	@Test
	public void xpathtutorial() throws InterruptedException {
		driver.get("https://www.techlearn.in/admin");
		Thread.sleep(1000);
		//driver.findElement(By.id("user_login")).sendKeys("SK");  earlier we do like dis but now xpath is diff--
		driver.findElement(By.xpath("/html/body/div[1]/form/p[1]/input")).sendKeys("SK");  //this is full xpath or absolute xpath
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("abcd");  // this is relative xpath
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/form/p[2]/input")).click();  //fullxpath 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();   //relative xpath 
		
	}
	
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();  
  
  }

}
