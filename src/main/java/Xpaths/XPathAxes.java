package Xpaths;

public class XPathAxes {

	public static void main(String[] args) {
		
		
		//parent to direct child  for that we can use single forward slash
		//form/div/input
		
		//parent to direct + indirect child: //
		//select[@id='Form_getForm_Country']//option
		//div[@id='content']//img
		
		//child to parent:
		//input[@id='input-email']/../../../../..
		
		// if we want to go to the parent then we use (parent::) keyword 
		//input[@id='input-email']/parent::div/parent::form
		
		// if we want to go to the grand-parent then we use (ancestor::) keyword
		// input[@id='input-email']/ancestor::form
		
		
		// if we want to go above the child sibling then we use preceding-sibling keyword preceding-sibling::tagname 
		//a[text()='Recurring payments']/preceding-sibling::a[text()='Downloads']
		
		// if we want to go below the child sibling then we use following-sibling keyword following-sibling::tagname
		//a[text()='Recurring payments']/following-sibling::a[text()='Returns']
		
		//input[@id='input-email']/preceding-sibling::label
		//label[text()='E-Mail Address']//following-sibling::input
		
		
		
		
		
		
		

	}

}
