package SelectClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectionFromSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@multiple]"));
		Select select = new Select(dropdown);
		if(select.isMultiple()) {
			System.out.println("Multi Select is possible");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		select.deselectByVisibleText("Greater flamingo");

	}

}
