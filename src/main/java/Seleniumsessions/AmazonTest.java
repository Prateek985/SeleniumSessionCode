package Seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtil browutil = new BrowserUtil();
		browutil.launchBrowser(browserName);
		browutil.launchURL("https://www.amazon.com");//getting some other msg
		String actualtitle = browutil.getPageTitle();
		
		if(actualtitle.contains("Amazon.com"))
		{
			System.out.println("title is passed----");
		}
		else {
			System.out.println("title is failed----");
		}
		
		String actualURL = browutil.getPageURl();
		
		if(actualURL.contains("http://www.amazon.com")) {
			System.out.println("URL  is passed----");
		}
		else {
			System.out.println("URL is failed----");
		}
		
		//browutil.closeBrowser();
		

	}

}
