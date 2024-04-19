package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagePage {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//this is known as webscraping == when we are fetching all the webimg or price details from the website and give it to the product team 
		// then they will manipulate the price accordingly this method is known as webscraping.
//		List<WebElement> allImg = driver.findElements(By.tagName("img"));
//		System.out.println(allImg.size());
//		
//		for(WebElement e: allImg) {
//			String alt_value = e.getAttribute("alt");
//			String src_value = e.getAttribute("src");
//			
//			System.out.println(alt_value + "-----------" +src_value);
//		}

		
		By allLink = By.tagName("a");
		By allImg = By.tagName("img");
		
//		System.out.println("Total no of links  = " +getElementcount(allLink));
//		System.out.println("Total no of Images = " +getElementcount(allImg));
		
		
//		ArrayList<String> eleTextLink = GetElementTextList(allLink);
//		System.out.println(eleTextLink);
//		
//		System.out.println(" -------------------------------");
//		
//		ArrayList<String> eleTextImg = GetElementTextList(allImg);
//		System.out.println(eleTextImg);
		
//		ArrayList<String> attrImg = GetElementattribute(allImg,"alt");
//		System.out.println(attrImg);
		
	}
	
//	public static List<WebElement> getElements(By locator) {
//		return driver.findElements(locator);
//	}
//	
//	public static int getElementcount(By locator) {
//		return getElements(locator).size();
//	}
//	
//	public static ArrayList<String> GetElementTextList(By locator) {
//		List<WebElement> eleList = getElements(locator);
//		ArrayList<String> eleText = new ArrayList<String>();
//		for(WebElement e: eleList) {
//			String text = e.getText();
//			if(text.length() != 0 ) {
//				eleText.add(text);
//			}
//		}
//		
//		return eleText;
//	}
//	
//	public static ArrayList<String> GetElementattribute(By locator,String attrname) {
//		List<WebElement> eleAttr = getElements(locator);
//		ArrayList<String> eletAttr = new ArrayList<String>();
//		for(WebElement e : eleAttr) {
//			String attrValue = e.getAttribute(attrname);
//			if(attrValue.length() != 0) {
//				eletAttr.add(attrValue);
//			}
//		}
//		return eletAttr;
//	}

}
