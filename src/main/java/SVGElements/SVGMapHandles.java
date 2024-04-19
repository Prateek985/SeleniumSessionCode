package SVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGMapHandles {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(3000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance")));
		
		String map_xpath= "//*[local-name()='svg' and @id='map-svg']/*[name()='g' and @id='regions']/*[name()='g']";
		
		List<WebElement> statelist = driver.findElements(By.xpath(map_xpath));
		
		Actions act = new Actions(driver);
		
		for(WebElement e: statelist) {
			act.moveToElement(e).perform();
			String stateid = e.getAttribute("id");
			System.out.println(stateid);
			Thread.sleep(5000);
		}
	}

}
