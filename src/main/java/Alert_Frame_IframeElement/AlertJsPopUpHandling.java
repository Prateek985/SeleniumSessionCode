package Alert_Frame_IframeElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJsPopUpHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		// in java we have 3 types of alerts
		// 1. alert pop up
		// 2. prompt pop up
		// 3. confirm pop up
		// java script are also called model dialogue pop up as well.
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// 1. alert:
		driver.findElement(By.xpath("//button[text()='click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		String Text = alert.getText();
		System.out.println(Text);
		alert.accept(); // click okk
		alert.dismiss(); // cancel the alert
		
		// 2. Confirmation alert:
		driver.findElement(By.xpath("//button[text()='click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		String Text1 = alert.getText();
		System.out.println(Text1);
		alert1.accept(); // click okk
		alert1.dismiss(); // cancel the alert
		
		// 3. prompt
		driver.findElement(By.xpath("//button[text()='click for JS Prompt']")).click();
		Alert alert2 = driver.switchTo().alert();
		String Text2 = alert.getText();
		System.out.println(Text2);
		Thread.sleep(5000);
		alert2.sendKeys("testing");
		alert2.accept(); // click okk
		alert2.dismiss(); // cancel the alert
		
	}

}
