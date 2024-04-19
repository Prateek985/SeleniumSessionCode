package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(3000);
		
		// element to element on the page --- valid 
		// file on the page --- NA
		
		WebElement srcEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		
		
		// Actions is a class
		// Action is an interfact 
		// build method will return action but all the remaining method will return actions.
		// if we write the code without perform only build method then the code will not perform any action.
		// we can use this action ref when we want to perform the action after some work 
		Actions act = new Actions(driver);
//		Action action = act
//		      .clickAndHold(srcEle)
//		                .moveToElement(targetEle)
//		                         .release()
//		                               .build();
		
		//action.perform();
		  
		// in selenium 4 the selenium guys has provided the inbuld single method for performing this actions
		// in this we have not called build method because perform method internally calls the build method and then perform the action 
		act.dragAndDrop(srcEle, targetEle).perform();
		

	}

}
