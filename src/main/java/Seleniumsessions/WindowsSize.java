package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSize {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=45&search=macbook");
		driver.findElement(By.id("button-cart")).click();
		String text = driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("div.alert.alert-success.alert-dismissible")).click();
		
		
		
		
		
//		driver.manage().window().maximize();
//		driver.manage().window().fullscreen();
//		
//		//responsive -- view port
//		Dimension dm = new Dimension(414, 896);
//		driver.manage().window().setSize(dm);
//		
//		WebElement fn = driver.findElement(By.id("input-firstname"));
//		System.out.println(fn.getCssValue("font-size"));
//		
//		int ht = fn.getSize().getHeight();
//		int wd = fn.getSize().getWidth();
//		System.out.println(ht);
//		System.out.println(wd);
//		
//		int x = fn.getLocation().getX();
//		int y = fn.getLocation().getY();
//		
//		System.out.println(x + " " + y);
//		
//		WebElement continue_btn = driver.findElement(By.xpath("//input[@value='continue'"));
//		String bk_color = continue_btn.getCssValue("background-color");
//		System.out.println(bk_color);
		
		
		
		
	}

}
