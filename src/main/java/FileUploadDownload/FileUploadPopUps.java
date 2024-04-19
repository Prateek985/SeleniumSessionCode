package FileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUps {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// while inspecting Dom element of upload to file we need to check in dom that type attribute should be file
		// type = file is mandatory
		
		driver.findElement(By.name("upfile")).sendKeys("c:\\document\\test.txt");
		
		// if the type file attribute is not present then we need to talk with the developer to write the type = file in the dom code 
		//because it is blocking my automation
		
		//sikuli --- image based/resoluction 
		// autoit --- only for windows machine --- it will not work in docker, headless, jenkins, linux or mac operating system
		// so wont use this 3rd party tool 
		
		

	}

}
