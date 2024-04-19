package Xpaths;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3school.com/html/html_tables.asp");
		
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		System.out.println("Total row = " +(rowcount-1)); // we have done rowcount -1 because the top row of table is column heading
		
		int colcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		
		
		//   //*[@id="customers"]/tbody/tr[2]/td[1]
		//   //*[@id="customers"]/tbody/tr[3]/td[1]
		//   //*[@id="customers"]/tbody/tr[4]/td[1]
		//   //*[@id="customers"]/tbody/tr[7]/td[1]
		
		// 1. option to write the code in this matter
		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath =  "]/td[1]";
		
		for(int row=2;row<=rowcount;row++) {
			String compXpath = beforexpath + row + afterxpath;
			String text = driver.findElement(By.xpath(compXpath)).getText();
			System.out.println(text);
		}
		
		// 2. option to write the code in this matter
	     List<WebElement> tableDataList = driver.findElements(By.xpath("//th[text()='Company']/parent::tr/following-sibling::tr/td"));
	     
	     for(WebElement e: tableDataList) {
	    	 System.out.println(e.getText());
	     }
	     
	     
	  // 3. option to write the code in this matter
	     for(int col=1;col<=colcount;col++) {
	    	 
	    	 List<WebElement> tablDataList = driver.findElements(By.xpath("//table[@id='customers]//tr/td["+col+"]"));
	    	 for(WebElement e: tablDataList) {
		    	 System.out.println(e.getText());
		     }
			}
		

	}

}
