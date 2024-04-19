package Xpaths;

public class CustomXpath {

	public static void main(String[] args) {

         	
		//XPath = address of the element in the DOM
		//XML Path
		//1. absolute XPath
		//   /html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/h4/a
		//2. Relative XPath(custom XPath)
		
		
		//1. using Single attr..
		//tagname[@attrname='value']
		//input[@id='input-email']
		//input[@name='email']
		
		//input[@name]-------> we are getting 5 elements so we can use this with findelements method
		//input[@value='login'] -----> we are getting single element out of it so we can use this with findelement method
		
		
		//2. using Multiple attr..
		//tagname[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@type='submit' and @value='Login'] ------> it will give 1 element 
		
		//input[@type='submit'] -----> it will give you 3 elements
		//input[@type='text' or @value='Login']
		
		//input[@type or @value='Login'] ------> this is also the correct xpath we are getting 1 element from this xpath
		//input[@type or @value] -------->  this is also the correct xpath but we are getting 6 elements from this which is not the case to use this xpath
		//a[@href] ----> from this we are getting total links present in the DOM that is 81
		
		
		//3.text():
		//tagname[text()='value']
		//h2[text()='New Customer']
		//a[text()='Desktop']
		
		//4. text() and attributes:
		//tagname[@attr='value' and text()='value']
		//a[@class='dropdown-toggle' and text()='Desktop']
		//a[@class='dropdown-toggle' and text()='Desktop' and @data-toggle='dropdown']
		//a[text()='Desktop' and @class='dropdown-toggle' and @data-toggle='dropdown']
		
		//5. contains with attr..
		//tagname[contains(@attrName, 'value')
		//tagname[contains(@placeholder, 'E-Mail')
		//tagname[contains(@placeholder, 'Address')
		
		//tagname[contains(@attrName1, 'value') and @attr2='value']
		//input[contains(@placeholder, 'Address') and @name='email']
		//input[contains(@placeholder, 'Address') and @name='email' and contains(@id,'email')]
	    //a[contains(@href,'Wishlist')]
		
		
		//dynamic ids: this are called dynamic ids when we refresh the page or dom then the id will be automatically changed
		//<input id=firstname_123 />
		//<input id=firstname_456 />
		//<input id=firstname_900 />
		//<input id=firstname_987 />
		
		//input[contains(@id,'firstname_')]
		
		//6. contains with text()
		//tagname[contains(text(), 'value')]
		//p[contains(text(), 'Customer service IT')]
		//p[contains(text(), 'Customer')]
		
		
		//7. contains with text() and attr...
		//tagname[contains(text(), 'value') and contains(@attr, 'value')]
		//tagname[contains(text(), 'Notebooks') and contains(@href, 'category&path')]
        		
		//tagname[contains(text(), 'value') and contains(@attr1, 'value') and contains(@attr2, 'value')] we can use like this as well
		
		
		//8. starts-with:
		//tagname[starts-with(@attr, 'value')]
		//input[starts-with(@placeholder, 'E-Mail')]
		
		//9. starts-with() with text()
		//tagname [starts-with(text(), 'value')]
		//a[starts-with(text(), 'Forgotten')]
		
		//ends-with() is not supported in xpath
		
		
		//11. index based xpath:
		// (//a[text()='Forgetten Password'])[1]
		// (//a[@class='list-group-item'])[13]
		// (//a[@class='form-control'])[6]
		// (//a[@class='form-control'])[position()=4]
		// (//a[@class='form-control'])[4]
		// (//a[@class='form-control'])[last()]
		
		// odd and even in xpath
		// (//select[@id='Form_getForm_country']/option)[position() mod 2 = 1] --- odd
		// (//select[@id='Form_getForm_country']/option)[position() mod 2 = 0] --- even
		
		
		
		
		
		
		
		
		
		
		

	}

}
