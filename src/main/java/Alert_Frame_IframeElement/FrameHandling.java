package Alert_Frame_IframeElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		// frame: webElement : DOM
		 
		//Browser
		     // page : WebElement
		 //     -- Frame: 	webElement
		

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@1234");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
	}

}
