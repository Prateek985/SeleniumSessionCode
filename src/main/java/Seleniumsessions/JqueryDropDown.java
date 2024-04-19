package Seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		//select the dropdown elements where select class or tag is not present
		
//		driver.findElement(By.id("justAnInputBox")).click();
//		
//		Thread.sleep(3000);
//		
//		List<WebElement> Choice = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		
//		Thread.sleep(3000);
//		
//		for(WebElement e: Choice) {
//			String ChoiceText = e.getText();
//			System.out.println(ChoiceText);
//			if(ChoiceText.equals("choice 1")) {
//				e.click();
//			}
//		}
		
		By dropdown = By.id("justAnInputBox");
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		// 1. Test Case = this below method will work for only single selection only
		// This below method will work as single and multi value only difference is that we need to pass the ... for multi value select 
		// then it will behave like an array if we remove then it will work as single value 
		//selectChoice(dropdown,choices, "choice 1");
		
		// 2. Test case = 
		// we need to use the DOT(.) parameter or spread parameter 
		//selectChoice(dropdown,choices, "choice 1", "choice 3", "choice 6", "choice 7", "choice 6 2 2");
		
		//3. Test Case  = if user want to select all drop down 
		selectChoice(dropdown,choices, "all");
		
		
		//... varargs -----> spread parameters in java script ---- array
		
	}
	

	
	/**
	 * This method is used to handle single multiple and all selection. please pass "all" in case of all selection.
	 * @param dropDownLocator
	 * @param choice
	 * @param value
	 * @throws InterruptedException
	 */
	public static void selectChoice(By dropDownLocator,By choice, String... value) throws InterruptedException {
		
		driver.findElement(dropDownLocator).click();
		
		Thread.sleep(3000);
		
		List<WebElement> Choice = driver.findElements(choice);
		
		if(!value[0].equals("all")) {
		
			Thread.sleep(3000);
			
			for(WebElement e: Choice) {
				String ChoiceText = e.getText();
				//System.out.println(ChoiceText);
				
				for(String val: value) {
					if(ChoiceText.equals("all")) {
						e.click();
					}
				}
			}
			
		}else {
			// all selection logic
			for(WebElement e:Choice) {
				try {
					e.click();
				}catch(ElementNotInteractableException ex) {
					break;
				}
			}
		}
		
		
	}

}
