package Seleniumsessions;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementisDisplayed {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//boolean flag = driver.findElement(By.className("img-responsive111")).isDisplayed();//org.openqa.selenium.NoSuchElementException
		
		//this line no 20 will throw an exception it will not return false tricky question
//		System.out.println(flag);
//		if(flag) {
//			System.out.println("logo is Displayed");
//		}
//		else {
//			System.out.println("logo is not Displayed");
//		}
		
//		By logo = By.className("img-responsive");
//		if(ElementIsDisplayed(logo)) {
//			System.out.println("logo is Displayed");
//		}
//		else {
//			System.out.println("logo is not Displayed");
//		}
		
		//this logic we will use when we have only 1 element in the webpage
//		List<WebElement> elelist  = driver.findElements(By.className("img-responsive"));
//		if(elelist.size()==1) {
//			System.out.println("logo is Displayed");
//		}
//		else {
//			System.out.println("logo is not Displayed");
//		}

		By logo = By.className("img-responsive");
		System.out.println(ElementsIsDisplayed(logo));
		
		if(ElementsIsDisplayed(logo)) {
		     System.out.println("Pass");
		}
		else
			System.out.println("Fail");
	}
	
	public static List<WebElement> GetElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static boolean ElementsIsDisplayed(By locator) {
		if(GetElements(locator).size() == 1) {
			return true;
		}
		return false;
	}
	
	public static WebElement GetElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean ElementIsDisplayed(By locator) {
		return GetElement(locator).isDisplayed();
	}

}
