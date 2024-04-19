package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PollingTimeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[contains(@href, 'twitter')]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));// interval time = 500 milli seconds
		
		// if we need to implement own interval time then  we need to use different constructor in webdriverWait and sleep method as well
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5), Duration.ofMillis(2000));// interval time = 2000 milli seconds
		
		
		// the default polling time or interval time in selenium is 500 milli seconds it is standard by default 
		
		
		
		
		

	}

}
