package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		By emailid = By.id("input-email");
//		By passwd = By.id("input-password");
//		By login = By.xpath("//input[@value='Login']");
//		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(emailid), "test@gmail.com");
//		act.sendKeys(driver.findElement(passwd), "test@123");
//		act.click(driver.findElement(login)).perform();
		
		// when to use this actions class sendkeys and click 
		// when our ordinary sned keys and normal click method is not working then we can use this its a power full tool
		
	}
	
//	public static WebElement GetElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doActionClick(By locator) {
//		Actions act = new Actions(driver);
//		act.click(GetElement(locator)).perform();
//	}
//
//	public static void doActionSendKeys(By locator, String Value) {
//		Actions act = new Actions(driver);
//		act.sendKeys(GetElement(locator), Value).perform();
//	}
}
