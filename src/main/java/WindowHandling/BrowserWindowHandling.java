package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		
		
		// 1st: fetch the window ids
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentwindowId = it.next();
		System.out.println("Parent Window It = " + parentwindowId);
		
		String childwindowId = it.next();
		System.out.println("Child Window It = " + childwindowId);
		
		// 2nd: switching work 
		
		driver.switchTo().window(childwindowId);
		System.out.println("Child window URL = " + driver.getCurrentUrl());
		
		driver.close(); // close the child window 
		
		driver.switchTo().window(parentwindowId);
		System.out.println("parent window URL = " + driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}
