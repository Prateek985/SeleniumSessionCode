package Seleniumsessions;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		
		//headless VS headed
		//headless: no browser visibility
		//faster
		//run test case script on CI/CD/Jenkins/Linux:  Headless
		//recommended: not recommended
		//local:
		//problems: its not an actual users simulations
		//complex Html DOM or app will be problem 
		//alerts/popsUPS: could be a problem
		
//		// Headless in the chrome Browser
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");// if we want to run the test cases in the simple chrome window then we should use this method
//		co.addArguments("--incognito"); // if we want to run the test cases in the incognito window of chrome then we use ths method
//		WebDriver driver = new ChromeDriver(co);
		
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);
		
		
//		
//		EdgeOptions ed = new EdgeOptions();
//		ed.addArguments("--headless=new");
//		WebDriver driver = new EdgeDriver(ed);
//		
//		
//		driver.get("https://www.google.com");
//		System.out.println(driver.getTitle());
//		//driver.close();
//		
		
		//headless options
		//ghostdriver
		//phantomJS
		//htmlunitdriver
		
		
		

	}

}
