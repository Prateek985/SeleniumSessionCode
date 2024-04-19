package WaitConcept;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		// webdriverwait is a child of fluentwait 
		
		// wait(interface) : ---- until(method); ---> implements ---> Fluent wait (C) --> it has until method + others method ---> webDriverwait(C)
		
		By imagelocator =  By.cssSelector("div#imageTemplateContainer img");
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				                    .withTimeout(Duration.ofSeconds(10))
//				                    .pollingEvery(Duration.ofSeconds(2))
//				                    .ignoring(NoSuchElementException.class)
//				                    .withMessage("time out...Element is not present");
//		
//		WebElement image_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(imagelocator));
//		image_ele.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
               .ignoring(NoAlertPresentException.class)
                .withMessage("time out...Element is not present");
		
		
		//WebDriverwait with FluentWait Features;
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
		                       wait1.pollingEvery(Duration.ofSeconds(10))
		                       .withMessage("time out...Element is not present");
		                        
		
	} 

}
