package WindowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
		String parentWindowhandle = driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		
		// fetch window ids: 
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowid = it.next();
			driver.switchTo().window(windowid);
			System.out.println("Window url " + driver.getCurrentUrl());
			
			if(!windowid.equals(parentWindowhandle)) {
				driver.close();
			}
			
			Thread.sleep(3000);
		}
		
		driver.switchTo().window(parentWindowhandle);
		System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
		

	}

}
