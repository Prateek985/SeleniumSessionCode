package PsuedoElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content')";
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		String man_field = js.executeScript(script).toString();
		System.out.println(man_field);
		
		if(man_field.equals("*")) {
			System.out.println("First name is a Mandatory field");
		}
	}

}
