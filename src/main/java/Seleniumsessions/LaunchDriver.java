package Seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {

	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); // open browser session id for example = 123
		driver.get("https://www.google.com");// enter url session id for example = 123
		String title = driver.getTitle(); // get title session id for example = 123
		System.out.println("Page title: = " +title);
		String url = driver.getCurrentUrl(); // get current url session id for example = 123
		System.out.println(url);
		
		
		driver = new ChromeDriver(); // open browser session id for example = 123
		driver.get("https://www.google.com");// enter url session id for example = 123
		String title1 = driver.getTitle(); // get title session id for example = 123
		System.out.println("Page title: = " +title1);
		String url1 = driver.getCurrentUrl(); // get current url session id for example = 123
		System.out.println(url1);
		
		
		driver.quit();
		
		//conclusion := when we write 2 times driver = new ChromeDriver(); then 2 times chrome will be launched in 2 different windows
// and 2 new session id will be generated for driver and if we write driver.quit(); in the last then then last chrome window will be closed not first. 
		
	}

}
