package WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConceptSelenium4 {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentWindowhandle = driver.getWindowHandle();
		
		//selenium 4.x
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		driver.close();// close the google tab
		
		driver.switchTo().window(parentWindowhandle);
		System.out.println(driver.getTitle()); // orange hrm
		
		
		
	}

}
