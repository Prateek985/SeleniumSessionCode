package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		String title = waitForTitleContains("Free CRM software for customer relationship management", 5);
		System.out.println(title);
		
		driver.findElement(By.linkText("Sign up")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.urlContains("/register"));
		System.out.println(driver.getCurrentUrl());
		

	}
	
	public static String waitForUrlContains(String urlFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
			if(wait.until(ExpectedConditions.urlContains(urlFraction))) {
				return driver.getCurrentUrl();
			}
		}catch(Exception e) {
			System.out.println("Url fraction is not found within: " +timeout);
		}
		
		return null;
	}
	
	public static String waitForUrlIs(String url, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
			if(wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getCurrentUrl();
			}
		}catch(Exception e) {
			System.out.println("Url is not found within: " +timeout);
		}
		
		return null;
	}
	
	public static String waitForTitleContains(String titleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
			if(wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		}catch(Exception e) {
			System.out.println("title is not found within: " +timeout);
		}
		
		return null;
	}
	
	public static String waitForTitleIs(String title, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		
		try {
			if(wait.until(ExpectedConditions.titleContains(title))) {
				return driver.getTitle();
			}
		}catch(Exception e) {
			System.out.println("title is not found within: " +timeout);
		}
		
		return null;
	}
	

}
