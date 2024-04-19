package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabSequence {

	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
	//	WebElement search = driver.findElement(By.name("firstname"));
	//	act.sendKeys(search, "test")
//		       .sendKeys(Keys.TAB)
//		       .pause(200)
//		       .sendKeys("automation")
//		       .sendKeys(Keys.TAB)
//		       .pause(200)
//		       .sendKeys("sanjay@gmail.com")
//		       .sendKeys(Keys.TAB)
//		       .pause(200)
//		       .sendKeys("99894215104")
//		       .sendKeys(Keys.TAB)
//		       .pause(200)
//		       .sendKeys("sanjay@123")
//		       .sendKeys(Keys.TAB)
//		       .pause(200)
//		       .sendKeys("sanjay@123")
//		       .build().perform();
		
		
		
	}

}
