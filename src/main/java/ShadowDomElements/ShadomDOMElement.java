package ShadowDomElements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadomDOMElement {

	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");
		Thread.sleep(5000);
		
		String search_script = "return document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")";
		// above javascript query will return HTML element
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// below line we are converting html element to webelement
		WebElement search = (WebElement)js.executeScript(search_script);
		
		search.sendKeys("notification");
		

	}

}
