package ShadowDomElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomWithFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// we go to the browser
		driver.get("https://selectorhub.com/iframe-in-shadow-dom/"); // then we go to the page
		Thread.sleep(5000);
		
//		// scenario 1 : browser ----> page -----> shadowDOM(open) ---- Element
//		String search_script  = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement pizzaName = (WebElement)js.executeScript(search_script);
//		
//		pizzaName.sendKeys("Veg Pizza");
		
		
		//scenario 2: browser ----> page -----> shadowDOM(open) ---- Iframe -------> Element
		String frame_script = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement FrameElement = (WebElement)js.executeScript(frame_script);
		driver.switchTo().frame(FrameElement);
		driver.findElement(By.id("glaf")).sendKeys("PASS");
		
		

	}

}
