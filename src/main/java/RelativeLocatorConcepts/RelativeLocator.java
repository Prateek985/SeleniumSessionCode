package RelativeLocatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class RelativeLocator {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("input-email"));
        String text = driver.findElement(with(By.cssSelector("label[for='input-email']")).above(ele)).getText();
        System.out.println(text);
		
        WebElement header =  driver.findElement(By.xpath("//h2[text()='New Customer']"));
        WebElement ContinueBtn =  driver.findElement(By.linkText("Continue"));
        
        List<WebElement> paraList = driver.findElements(with(By.tagName("p")).below(header).above(ContinueBtn));
        
        for(WebElement e:paraList) {
        	System.out.println(e.getText());
        }
	}

}
