package Seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		
		//7. approch  = combining browser utility and element utility class both
		//browserUtil + ElementUtil 
		BrowserUtil broUtil = new BrowserUtil();
		WebDriver driver = broUtil.launchBrowser("chrome");
		broUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String checkTitle = broUtil.getPageTitle();
		System.out.println(checkTitle);
		
		
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil elUtil  = new ElementUtil(driver);
		elUtil.doSendkeys(username, "Neeraj@gmail.com");
		elUtil.doSendkeys(pwd, "Neeraj@123");
		
		//broUtil.closeBrowser();

	}

}
