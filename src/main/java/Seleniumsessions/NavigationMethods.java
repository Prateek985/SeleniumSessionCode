package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		//back and forward
		//get Vs to
		//refresh
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(new URL("https://www.google.com"));
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com");
		
		
		//refresh the page
		driver.navigate().refresh();
		
		

	}

}
