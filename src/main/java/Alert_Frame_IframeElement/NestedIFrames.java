package Alert_Frame_IframeElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedIFrames {

	
	public static void main(String[] args) throws InterruptedException {
		

		
		WebDriver driver = new ChromeDriver();// Browser
		driver.get("https://selectorhub.com/iframe-scenario/");// page
		Thread.sleep(5000);
		driver.switchTo().frame("pact1");// frame1
		driver.findElement(By.id("inp_val")).sendKeys("testing");
		

		driver.switchTo().frame("pact2"); // frame 2
		driver.findElement(By.id("jex")).sendKeys("Automation");
		
		driver.switchTo().frame("pact3"); // frame 2
		driver.findElement(By.id("glaf")).sendKeys("1M subscriber");
		
		
		// frame 3 ----> frame 2 using switch.frame()? ------ NOOOOOOOOO
		// frame 3 -----> parentFrame() : f2 : YESSSSS
		// frame 2 -----> parentFrame() : frame 1 : YESSS
		
		driver.switchTo().frame("pact2"); // i am transferring driver from frame 3 to frame 2
		driver.switchTo().frame("pact1");  // i am transferring driver from frame 2 to frame 1 
		driver.findElement(By.id("inp_val")).sendKeys("is fun"); // but this action is not working it is giving error 
		
		driver.switchTo().defaultContent(); // go to main page 
		driver.findElement(By.id("inp_val")).sendKeys("with fun");
		
		// in selenium 4.x selenium guys has introduced 1 new method 
		driver.switchTo().parentFrame();// f3 frame to f2 frame 
		driver.findElement(By.id("jex")).sendKeys("with fun");
		
		driver.switchTo().parentFrame();// f2 frame to f1 frame 
		driver.findElement(By.id("jex")).sendKeys(" is boring");
		
		driver.switchTo().parentFrame(); // go to page
		driver.switchTo().defaultContent(); // go to page
		String header = driver.findElement(By.tagName("h3")).getText();
		System.out.println(header);
	}

}
