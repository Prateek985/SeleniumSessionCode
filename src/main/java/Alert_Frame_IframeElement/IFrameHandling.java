package Alert_Frame_IframeElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		

		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one")));
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("prateek");
		driver.switchTo().defaultContent();
		String Text = driver.findElement(By.cssSelector("h3.details_form-preview-title")).getText();
		System.out.println(Text);
	}

}
