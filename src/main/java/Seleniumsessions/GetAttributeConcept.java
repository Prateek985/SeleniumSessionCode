package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//text -----> getText()
		//attribute ------> getAttribute()
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
//		String fn_placeholder = driver.findElement(By.id("input-firstname")).getAttribute("placeholder");
//		String fn_type = driver.findElement(By.id("input-firstname")).getAttribute("type");
//		String fn_name = driver.findElement(By.id("input-firstname")).getAttribute("name");
//		
//		System.out.println(fn_placeholder);
//		System.out.println(fn_type);
//		System.out.println(fn_name);
		
		
//		By fn_placeholder = By.id("input-firstname");
//		By fn_type = By.id("input-firstname");
//		By fn_name = By.id("input-firstname");
 		
//		By RegistrLinkText = By.linkText("Register");
		
		
//		String fn_attribute = doGetAttribute(fn_placeholder,"placeholder");
//		String fn_typeattr = doGetAttribute(fn_type,"type");
//		String fn_nameattr = doGetAttribute(fn_name,"name");
		
//		String RegsLink =  doGetAttribute(RegistrLinkText,"href");
		
		
//		System.out.println(fn_attribute);
//		System.out.println(fn_typeattr);
//		System.out.println(fn_nameattr);
//		System.out.println(RegsLink);
		
		
	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//
//	public static String doGetAttribute(By locator,String attrName) {
//		return getElement(locator).getAttribute(attrName);
//	}
}
