package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Exception {
	
	
    //for example if element is not there then what we need to do 
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		driver.findElement(By.tagName("search111")).sendKeys("macbook");
		//NoSuchElementException
		
        List<WebElement> ele = driver.findElements(By.tagName("naveen"));
        //Empty Array list
        System.out.println(ele.size());//Size will be 0
        System.out.println(ele);// List will be Empty ==  []
        
        
	}

}
