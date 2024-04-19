package WaitConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ExceptionClasses.BrowserException;

public class CustomWaitConcept {

	static WebDriver driver;
	
	public static WebElement retryingElement(By locator, int timeOut) {
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			
			
			try {
				element = driver.findElement(locator);
				System.out.println("element is found....." + locator + " in attempt "  +attempts);
				break;
			}catch(Exception e) {
				System.out.println("element is found....." + locator + " in attempt "  +attempts);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}	
			attempts++;
		}
		
		if(element == null) {
			System.out.println("element is found..... tried for " + timeOut + " with the interval of "  + 500 + " milliseconds...");
			throw new BrowserException("No such Element Exception");
		}
		return element;
	}

	public static WebElement retryingElement(By locator, int timeOut, int IntervalTime) {
		WebElement element = null;
		int attempts = 0;
		
		while(attempts < timeOut) {
			
			
			try {
				element = driver.findElement(locator);
				System.out.println("element is found....." + locator + " in attempt "  +attempts);
				break;
			}catch(Exception e) {
				System.out.println("element is found....." + locator + " in attempt "  +attempts);
				try {
					Thread.sleep(IntervalTime * 1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}	
			attempts++;
		}
		
		if(element == null) {
			System.out.println("element is found..... tried for " + timeOut + " with the interval of "  + 500 + " milliseconds...");
			throw new BrowserException("No such Element Exception");
		}
		return element;
	}
	
	public static void main(String[] args) {
		
		
		//Thread.sleep() ----- static wait  ----- dynamic wait
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		///retryingElement
		

	}

}
