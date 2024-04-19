package ActionsClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMoveToElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
        
		
//		WebElement content = driver.findElement(By.className("menulink"));
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(content).perform();
//		act.moveToElement(content).build().perform();// in this we are performing only one action with the help of build and perform method 
//		// 1 --- perform(); // when we have only one action to perform then we use perform method with that 
//		// 1 ---- build().perform(); // when we have only one action to perform then we use perform and build method with that
//		// n ---- build().perform();  // when we have n no of actions to perform then we use perform and build method with that 
//		//build is collecting all the informations
//		// perform method is performing action on the page.
//		
//		
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("COURSES")).click();
	//	---------------------------------------------------------------------------------------------
		
//		By parent = By.className("menulink");
//		By Submenu = By.linkText("COURSES");
//		handleMenuSubMenu(parent,Submenu);
		
		By parent = By.xpath("//div[text()='Add-ons']");
		By Submenu = By.xpath("//div[text()='Visa Services']");
		handleMenuSubMenuLevel2(parent,Submenu);
		
		
	}
	
	public static WebElement GetElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void handleMenuSubMenuLevel2(By parentMenulocator, By SubMenulocator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(GetElement(parentMenulocator)).perform();
		Thread.sleep(5000);
		GetElement(SubMenulocator).click();
	}

}
