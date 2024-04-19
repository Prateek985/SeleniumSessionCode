package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// in selenium 4.0 
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(5000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		Thread.sleep(5000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
//		Thread.sleep(5000);
//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
//		
		act.scrollToElement(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
		                          .click(driver.findElement(By.xpath("//a[text()='Delivery Information']")))
		                        		  .build().perform();
		

	}

}
