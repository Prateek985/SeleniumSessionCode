package SelectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ExceptionClasses.MyElementException;

public class SelectDropDownConcept {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select ctry = new Select(country);
		
//		ctry.selectByIndex(15);
//		ctry.selectByValue("Bhutan");
//		ctry.selectByVisibleText("Equatorial Guinea");	

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String value) {
		NullBlankCheck(value);
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectByVisibleText(By locator, String VisibleText) {
		NullBlankCheck(VisibleText);
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}
	
	public static void NullBlankCheck(String value) {
		if(value == null || value.length() == 0) {
			throw new MyElementException("Value should not be Null or Blank");
		}
	}

}
