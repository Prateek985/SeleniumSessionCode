package Seleniumsessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSessions {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver(); // open browser session id for example = 123
		driver.get("https://www.google.com");// enter url session id for example = 123
		String title = driver.getTitle(); // get title session id for example = 123
		System.out.println("Page title: = " +title); 
		String url = driver.getCurrentUrl(); // get current url session id for example = 123
		System.out.println(url);
		
		driver.close();// browser is closed
		// session is invalid with the same id : // NoSuchSessionException: Invalid session Id
		// sid = 123 which is invalid 
		
		driver.quit();//browser is closed: 123
		//NoSuchSessionException: Session Id is Null : using webdriver after calling null?
		
		//sid = null
		
		driver = new ChromeDriver();// open browser:  new session id =  456
		driver.get("https://www.google.com");// enter url: 456
		
		System.out.println(driver.getTitle());//456
		
		
		//conclusion: = when we use driver.close() the sid will be same but we will get invalid with the same id : // NoSuchSessionException: Invalid session Id
		// but when we use driver.quit(); =  the sid will be new after that NoSuchSessionException: Session Id is Null : using webdriver after calling null?
		
		

	}

}
