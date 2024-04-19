package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	
	// if i want that title test should not participate in the testing process then i will use test annotation as enable = false
    //after writing this the title test will not participate in the test execution process
	// we can write @Ignore annotation to ignore the particular test in the testing process

	@Test(priority = 1, enabled = false)
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "title is not matched");
	}
	
	
	@Test(priority = 2)
	public void imageTest()
	{
		boolean flag = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		//Assert.assertEquals(flag, true);
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority = 3)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("google"));
	}
	
	
}
