package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementTextValue {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		driver.findElement(By.id("input-email")).sendKeys("prateek@gmail.com");
		
//		String text  = driver.findElement(By.id("input-email")).getText();
//		System.out.println(text);// it will not fetch the value prateek@gmail.com from the text box
		
		//gettext method is used in the Links, headers labels, with spans also
		
		
		//if we need to fetch the value of textfield then we use the value attribute present in the HTML code
//		String emailid = driver.findElement(By.id("input-email")).getAttribute("value");
//		System.out.println(emailid);

	}

}
