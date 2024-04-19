package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//chrome dev tool:
		//DOM: HTML: Document Object Model
		
		//create a web element + perform an action on it ( click, sendkeys, gettext, isDisplayed)
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		
		//2
	  //  WebElement emailId = driver.findElement(By.id("input-email"));
	   // WebElement password = driver.findElement(By.id("input-password"));
	    //10 elements
	    //4 elements
	    
	    //emailId.sendKeys("test@gmail.com");
	  //  password.sendKeys("test@123");
	    
	    
	    //3. By locator
	//    By username = By.id("input-email");
	  //  By pwd = By.id("input-password");
	    
	//    WebElement emailid = driver.findElement(By.id("input-email"));
	 //   WebElement password = driver.findElement(By.id("input-password"));
	    
	 //   emailid.sendKeys("test@gmail.com");
	 //   password.sendKeys("test@123");

		//4. By locator with some Utility:
		//By username = By.id("input-email");
		//By pwd = By.id("input-password");
		    
	//	WebElement emailId = getElement(username);
	//	WebElement password = getElement(pwd);
		
	//	emailId.sendKeys("test@gmail.com");
	//	password.sendKeys("test@123");
		
		//5. By locator with some Utility and some actions Utility:
		//By username = By.id("input-email");
		//By pwd = By.id("input-password");
		    
		
	//	doSendkeys(username, "test@gmail.com");
	//	doSendkeys(pwd, "test@123");
		
		
		//6. By locator and create a common util class for elements:
		//we can use this 6th approch in 99.9% projects this approch is used
		//Page By Locators: OR - Object
	
//		  By username = By.id("input-email"); 
//		  By pwd = By.id("input-password");
//		  
//		  ElementUtil eleUtil = new ElementUtil(driver); eleUtil.doSendkeys(username,
//		  "test@gmail.com"); eleUtil.doSendkeys(pwd, "test@123");
		 
		
		
		
		//7. Browser Util + element Util
		
		//8. By util + String Locators
		
//		String username_Id = "input-email";
//		String pwd_Id = "input-password";
//		
//		ElementUtil util = new ElementUtil(driver);
//		util.doSendKeys("id", username_Id, "kunal@gmail.com");
//		util.doSendKeys("id", pwd_Id, "kunal@123");
		
		
		//string ---> by ---> webElement ----> action ---> 2st preference 
		//by ----> webElement ---> action ---> 1st preference
		//webElement ---> action ---> 3rd preference
		
		
	}
	
	
}
