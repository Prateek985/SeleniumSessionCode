package Alert_Frame_IframeElement;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		// 1. method to use Authentication pop up in this if pwd is having @ then below Basic authentication will not work. 
		String username = "admin";
		String password = "admin";
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		// 2. method to use Authentication pop up with selenium 4.x
		//sel 4.x
		//HasAuthentication
		// -> is called lamda expression 
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username,password));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");

	}

}
