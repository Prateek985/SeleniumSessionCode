package RelativeLocatorConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;//while using the below methods we need to import the static library

import org.openqa.selenium.By;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// this concept is introduced in selenium 4 it was previously not present 
		
		
//		                            above the element
//		                                  |     
//		       Left of element <------   ele  ----->   right of element
//		                                  |
//		                            Below the element
		
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele =  driver.findElement(By.linkText("Barrie, Canada"));
		
		// if we want to find out the above below near and left element then we can use this above method 
		String leftRank  =  driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String rightRank  =  driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightRank);
		
		String aboveCity  =  driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		String belowCity  =  driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String nearElement  =  driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearElement);// it will get the nearest element around 50 pixel only 
		
		
		
	}        

}
