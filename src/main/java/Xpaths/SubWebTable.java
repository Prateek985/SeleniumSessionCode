package Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubWebTable {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
		
		//a[text()='John.Smith']/ancestor::tr//input[@type='checkbox']
		
		selectUser("John.Smith");
		selectUser("Joe.Root");

	}
	// if we want to take the '' then we use + operator
	public static void selectUser(String userName) {
		String xpath= "//a[text()='"+userName+"']/ancestor::tr//input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
	}

}
