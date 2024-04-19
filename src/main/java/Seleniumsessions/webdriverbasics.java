package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class webdriverbasics {

	public static void main(String[] args) throws MalformedURLException {
		
		
		//open browser chrome
		//enter URL
		//get the title
		//verify the title --- actual vs expected
		
		
		//automation steps
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("page Title: " + title);
		
		//checkpoint/verification point/actual vs expected
		if(title.equals("Google")) {
			System.out.println("correct title ----- Pass");
		}
		else {
			System.out.println("Incorrect title ----- Fail");
		}
		//automation steps + verification point -------> Automation Testing 
		//test steps  + verification point ----- test case
		
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		if(Url.contains("google")) {
			System.out.println("Url passed");
		}
		else
		{
			System.out.println("Url Failed");
		}
		
		//close the browser: quit() and close()
		//driver.close();
		//driver.navigate().to(new URL("https://www.google.com"));
		

	}

}
