package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with--disable-textbox-or.html");
		
		
		driver.findElement(By.id("pass")).click();//no Exception
		
		driver.findElement(By.id("pass")).sendKeys("testing");
		//ElementNotInteractableException: element not intractable 
		
		
		driver.findElement(By.id("fname")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be not a null Charsequence
		
		
		StringBuilder sb = new StringBuilder("testing");
		String s = "automation";
		driver.findElement(By.id("fname")).sendKeys(sb,s,"prateek");
		
		//charsequence is an interface which may accept 3 values string, stringBuilder and StringBuffer as well
		//charsequence can accept array of string as well.
		

	}

}
