package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsForAlerts {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for Js Alert']")).click();
		
	}
	
	public static Alert waitForJsAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAlertText(int timeout) {
		return waitForJsAlert(timeout).getText();
	}
	
	public static void acceptAlert(int timeout) {
	     waitForJsAlert(timeout).accept();;
	}
	
	public static void dismissAlert(int timeout) {
	     waitForJsAlert(timeout).dismiss();
	}
	
	public static void alertSendKeys(int timeout, String value) {
	    waitForJsAlert(timeout).sendKeys(value);
	}


}
