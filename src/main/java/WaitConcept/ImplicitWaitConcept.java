package WaitConcept;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // selenium 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// implicit wait: Global wait: applied to all the elements by default
		// for all the findelement & findelements 
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		//case 1:
		//login page: 10sec
		//total timeout = 10 sec
		//driver.findElement(By.id("Form_getForm_Name")).sendKeys("test"); // e1: 10 : 2 = 8 sec
		//e2: 10sec : 3sec = 7sec
		//e3: 10sec : 8sec = 2sec
		//e4... en ; 10
		
		//home page: 15sec
		//total timeout = 15 sec
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // sel 4.x
		//he1: 15 
		//he2: 15
		//he3: 15
		
		//login page: 10 sec
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // sel 4.x
		//e1 e2 e3 : 10sec
		
		//reg page : 5 sec
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // sel 4.x
		
		
		//cart page : 0 ----> this is also called as nullify of implicit wait: 0 
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); // sel 4.x
		
		// case 2
		// login page: 10 sec
		// e1 : 15sec
		// e2 : 5 sec
		// e3 : 4 sec
		
		//case 3
		// its only for webElements
		// not applicable for no web Elements: JS alerts, title, urls, browser window
		
		// avoid implicit wait in real time in your frame work 
		

	}

}
