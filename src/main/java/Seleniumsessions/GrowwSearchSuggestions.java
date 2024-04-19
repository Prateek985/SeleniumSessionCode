package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowwSearchSuggestions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://groww.in/");
		
	    //driver.findElement(By.id("globalSearch23")).click();
	    driver.findElement(By.id("globalSearch23")).sendKeys("hdfc");
		Thread.sleep(3000);
		List<WebElement> Grow_List = driver.findElements(By.xpath("//div[@class='gsc23SuggestionText']//span"));
		System.out.println(Grow_List.size());
		
		for(WebElement e: Grow_List) {
			String grow_Text = e.getText();
    		if(grow_Text.equals(" Small Cap Fund")) {
				e.click();
			}
			//System.out.println(grow_Text);
		}
		
	}

}
