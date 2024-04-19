package RelativeLocatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;


public class WebTablewithRelativeLocators {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		WebElement playerEle =  driver.findElement(By.linkText("Joe.Root"));
		
		driver.findElement(with(By.id("ohrmList_chkSelectRecord_21")).toLeftOf(playerEle)).click();
		
		List<WebElement> playerData = driver.findElements(with(By.xpath("//table[@id='resultTable']//td")).toRightOf(playerEle));
		
		for(WebElement e: playerData) {
			System.out.println(e.getText());
		}
		
		
	}

}
