package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CascadedClassConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		//InvalidselectorException:= Compound class name not permitted
		//Invalid
		//driver.findElement(By.className("form-control private-form_control login-email")).sendKeys("naveen@gmail.com");
		
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form_control login-email']")).sendKeys("naveen@gmail.com");
		
		//NSE
		//driver.findElement(By.xpath("//input[@class='login-email']")).sendKeys("naveen@gmail.com");
		
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("naveen@gmail.com");
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("naveen@gmail.com");
        
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form_control.login-email")).sendKeys("naveen@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input.login-email")).sendKeys("naveen@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.login-email")).sendKeys("naveen@gmail.com");
		
		//valid
		//driver.findElement(By.cssSelector("input[class='form-control.login-email']")).sendKeys("naveen@gmail.com");
		
		//InvalidSelectorException
		//driver.findElement(By.xpath("//input[@###$$$class='login-email']")).sendKeys("naveen@gmail.com");
	}
		
}
