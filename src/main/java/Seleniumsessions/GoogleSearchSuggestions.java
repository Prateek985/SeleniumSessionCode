package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		//ul = Unordered List
		//li = List
//		driver.findElement(By.name("q")).sendKeys("selenium");
//		Thread.sleep(3000);
//		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']//span"));
//		System.out.println(suggList.size());
//		for(WebElement e: suggList) {
//			String suggText = e.getText();
//	//		System.out.println(suggText);
//			if(suggText.contains("tutorial")) {
//				e.click();
//				break;
//			}
//		}
//		By SearchField = By.name("q");
//		By Suggstion = By.xpath("//ul[@class='G43f7e' and @role='listbox']//div[@class='wM6W7d']//span");
//		doSearch(SearchField,Suggstion, "selenium", "webdriver" );
		
	}
	
//	public static void doSearch(By Searchlocator, By suggestion, String searchKey, String Value) throws InterruptedException {
//		driver.findElement(Searchlocator).sendKeys(searchKey);
//		Thread.sleep(3000);
//		List<WebElement> suggList = driver.findElements(suggestion);
//		System.out.println(suggList.size());
//		for(WebElement e: suggList) {
//			String suggText = e.getText();
//			if(suggText.contains(Value)) {
//				e.click();
//				break;
//			}
//		}
//	}

}
