package SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("macbook");
		driver.findElement(By.xpath("//button/*[local-name()='svg']")).click();
		
		

	}

}
