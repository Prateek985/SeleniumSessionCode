package WaitConcept;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExceptionClasses.BrowserException;

public class WaitForPageLoader {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		boolean flag =  isPageLoaded(10);
        if(!flag) {
        	throw new BrowserException("page Not Loaded");
        }
	}
	
	public static boolean isPageLoaded(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		String flag = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete'"))
		           .toString();
		return Boolean.parseBoolean(flag);
		
	}
// this is a java script debugger	
//	setTimeout(()=>{
//		debugger;
//	}
//	, 5000)

}
