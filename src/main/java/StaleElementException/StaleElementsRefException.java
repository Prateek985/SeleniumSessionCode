package StaleElementException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementsRefException {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> footerlist = driver.findElements(By.cssSelector("footer a"));
		
		// when we use for loop which is index based then we will not getting stale element exception 
		// but when we use for each loop it is throwing stale element exception. so we need to use for loop because it is index based in this situation 
		
		
		for(int i=0;i<footerlist.size();i++) {
			footerlist.get(i).click();
			driver.navigate().back();
			footerlist = driver.findElements(By.cssSelector("footer a"));
		}
		
		
		for(WebElement e : footerlist) {
			e.click();
			driver.navigate().back();
			footerlist = driver.findElements(By.cssSelector("footer a"));
		}
		

	}

}
