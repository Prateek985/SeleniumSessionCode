package Seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import ExceptionClasses.BrowserException;

/**
 * This method is used to initilize the driver on the basis of given browser name 
 * @param browserName 
 * @return this returns driver
 */
public class BrowserUtil {
	
	WebDriver driver;
	
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("browser name : " +browserName);
		
		switch (browserName.toLowerCase().trim())
		{
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Plz pass the right browser....." + browserName);
			throw new BrowserException("BROWSER NOT FOUND");
				
		}
		return driver;
	}
	
	
	public void launchURL(String url)
	{
		if(url == null) {
			throw new BrowserException("URL is Null");
		}
		
		if(url.indexOf("http")==0) {
			driver.get(url);
		}
		else {
			throw new BrowserException("HTTP is MISSING IN URL");
		}
			
	}
	
	//overloaded method
	public void launchURL(URL url)
	{
		if(url == null) {
			throw new BrowserException("URL is Null");
		}
		//this string.valueof method will convert any value of int float url into string.
		String appUrl = String.valueOf(url);//this method will convert the URL into string 
		if(appUrl.indexOf("http")==0) {
			driver.navigate().to("https://www.amazon.com");
		}
		else {
			throw new BrowserException("HTTP is MISSING IN URL");
		}
			
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}

	public String getPageURl()
	{
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}
