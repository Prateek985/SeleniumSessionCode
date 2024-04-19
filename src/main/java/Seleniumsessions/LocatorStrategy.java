package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategy {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//chrome dev tool:
		//DOM: HTML: Document Object Model
		
		//create a web element + perform an action on it ( click, sendkeys, gettext, isDisplayed)
		
		//1. id: unique attribute: cannot be duplicate
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

		//2. name: can be duplicate
//		By fn = By.name("firstname");
//		By ln = By.name("lastname");
//		
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doSendkeys(fn, "Ramesh");
//		uti.doSendkeys(ln, "sharma");
		
		//2. By util + String Locators
//		String fn = "firstname";
//		String ln = "lastname";
//		
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doSendKeys("name", fn, "Ramesh");
//		uti.doSendKeys("name", ln, "sharma");
		
		//3. class name: its not a unique attribute, can be duplicate
	//	driver.findElement(By.className("form-control")).sendKeys("testing");
		
		//4. XPath = its not an attribute: address of WebElement in HTML DOM
		//x = XML PATH
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Rohan");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Sharma");

//        By fn = By.xpath("//*[@id=\"input-firstname\"]");
//        By ln = By.xpath("//*[@id=\"input-lastname\"]");
//        
//        ElementUtil uti = new ElementUtil(driver);
//        uti.doSendkeys(fn, "Vinay");
//        uti.doSendkeys(ln, "Mohan");
        
      //4. By util + String Locators
//        String fn = "//*[@id=\"input-firstname\"]";
//        String ln = "//*[@id=\"input-lastname\"]";
//        
//        ElementUtil uti = new ElementUtil(driver);
//        uti.doSendKeys("xpath", fn, "Ravi");
//        uti.doSendKeys("xpath", ln, "John");

		
		//5. css: cascaded style sheet: = its not an attribute
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Pawan");
//		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("anand");

//		By fn = By.cssSelector("#input-firstname");
//		By ln = By.cssSelector("#input-lastname");
//		
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doSendkeys(fn, "Pawan");
//		uti.doSendkeys(ln, "anand");
		
		//5. By util + String Locators
//		String fn = "#input-firstname";
//		String ln = "#input-lastname";
//		
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doSendKeys("cssselector", fn, "Pawan");
//		uti.doSendKeys("cssselector", ln, "anand");
		
		//6. linkText: only for links : for the text of the link
		//html dom: <a> --- link
		//driver.findElement(By.linkText("Login")).click();
		
//		By loginText = By.linkText("Login");
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doclick(loginText);
		
		//6. By util + String Locators
//          String Address = "Forgotten Password";
//          ElementUtil uti = new ElementUtil(driver);
//		  uti.doSendKeys1("linktext", Address);
		
		//7. partialLinkText: only for link : for the partial text of the link 
		//driver.findElement(By.partialLinkText("Address")).click();
		
//		By Addressbook = By.partialLinkText("Address");
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doclick(Addressbook);
		
		//7. By util + String Locators
//		String Addressbook = "Address";
//		ElementUtil uti = new ElementUtil(driver);
//		uti.doSendKeys1("partiallinktext", Addressbook);
		
		//8. tagName: html tag:
//		String headerText = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(headerText);
		
//        By header = By.tagName("h1");
//        ElementUtil uti = new ElementUtil(driver);
//        String headerText = uti.dogetText(header);
//        System.out.println(headerText);
//		
//		   String header = "h5";
//		   ElementUtil uti = new ElementUtil(driver);
//		   String getheader = uti.dogettext1("tagname", header);
//		   System.out.println(getheader);
		
	}

}
