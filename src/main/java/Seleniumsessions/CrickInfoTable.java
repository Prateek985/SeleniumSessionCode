package Seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickInfoTable {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/afghanistan-vs-ireland-2023-24-1416063/afghanistan-vs-ireland-only-test-1416080/live-cricket-score");
		
		
		System.out.println();
		System.out.println();

	}
	
	public static String getWicketTakerName(String BatsmanName) {
		return driver.findElement(By.xpath("//span[text()='"+BatsmanName+"']/ancestor::td/following-sibling::td//span/span")).getText();
	}
	
	public static List<String> getScoreCard(String batsManName) {
		List<WebElement> scoreelement = 
		driver.findElements(By.xpath("//span[text()='"+batsManName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')"));
		List<String> scoreCardList = new ArrayList<String>();
		for(WebElement e: scoreelement) {
			String text = e.getText();
			scoreCardList.add(text);
		}
		return scoreCardList;
	}

}
