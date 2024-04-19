package WaitConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitConcept {

	static WebDriver driver;
	
	public static void  main(String[] args) {
		
		
// wait(interface): - until(method);-> implements ->Fluentwait(C)->(@overriddenmethods)until method() + others method -> webDriverwait(C) no methods
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		By full_name = By.id("Form_getForm_Name");
		By buss_email = By.id("Form_getForm_Email");
//		waitForElementPresence(full_name,10).sendKeys("naveen");
//		getElement(buss_email).sendKeys("naveen@gmail.com");
		
		waitForElementVisible(full_name,10).sendKeys("testing");
		
		// e1 = 10 sec
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement fullName = wait.until(ExpectedConditions.presenceOfElementLocated(full_name));
//		fullName.sendKeys("testing");
		
		// e2 = 0 sec
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("testing@gmail.com");
		
	
		}
		/**
		 * An expectation for checking that an element is present on the DOM of a page. 
		 * This does notnecessarily mean that the element is visible.
		 * @param locator
		 * @param timeout
		 * @return
		 */
	
		public static WebElement waitForElementPresence(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		}
		/**
		 * An expectation for checking that an element is present on the DOM of a page and visible.
		 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.
		 * @param locator
		 * @param timeout
		 * @return
		 */
		public static WebElement waitForElementVisible(By locator, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}


}
