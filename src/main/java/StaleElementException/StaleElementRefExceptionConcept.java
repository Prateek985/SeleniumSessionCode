package StaleElementException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StaleElementRefExceptionConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("naveen@gmail.com");
		
		driver.navigate().refresh(); // we will get the stale elemnt exception when we refresh, go forward, go backward the page 
		
		emailid = driver.findElement(By.id("input-email"));
		emailid.sendKeys("john@gmail.com"); // selenium.StaleElementReferenceException: stale element reference: stale element not found
		
		// we can resolve the stale element exception by 2 ways 
		// 1) By initilizing the webelement one again after refreshing the page as we did in line no 20.
		// 2) by the help of webdriver wait or fulent wait we can resolve this issue.
		
		// element is reinitilize with the help of fluent wait or element new id will be generated
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				               wait.pollingEvery(Duration.ofMillis(10))
				                 .ignoring(StaleElementReferenceException.class)
				                 .withMessage("element not found");
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("input-email")))).sendKeys("john@gmail.com");		                 
				                 
		
		
	}

}
