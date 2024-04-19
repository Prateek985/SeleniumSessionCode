package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

        //1. total links 
		//2. print the text of each link 
		//3. avoid blank text
		//4. broken ------- Links
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//find out all the elements ---> FEs
		
		//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		
//		for(int i=0;i<allLinks.size();i++) {
//			String allLinkText = allLinks.get(i).getText();
//			
//			if(allLinkText.length()!= 0) {
//			       System.out.println(allLinkText);
//			   }
//		}
		
//		for(WebElement e: allLinks) {
//			String text = e.getText();
//			if(text.length()!= 0) {
//			   System.out.println(text);
//			}	
//		}
         
		
		//total text field on the webpage
		List<WebElement> TestField = driver.findElements(By.className("form-control"));
		System.out.println(TestField.size());
		
		
		

	}

}
