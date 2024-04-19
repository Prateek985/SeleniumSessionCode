package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	static WebDriver driver;
	public static void main(String[] args) {
		

	       driver = new ChromeDriver();
	       
	      // driver.findElement(By.cssSelector(cssselector));
	       
	       //id
	       //#id
	       // tagname#id
	       // #username
	       // input#username 
	       
	       //class:
	       // .class
	       // tagname.class
	       //  .login-email
	       //  input.login-email
	       
	       //class + id  we can use both at the time class and id 
	       // .class#id
	       // #id.class
	       // input.login-email#username
	       // input#username.login-email
	       
	       // .classname1.classname2.classname3.....n
	       //tagname.c1.c2.c3.....n
	       //  .form-control.private-form_control.login-email
	       // input.form-control.private-form_control.login-email
	       // input.form-control.private-form_control.login-email#username
	       // input.form-control#username.private-form_control.login-email
	       
	       // css with attribute
	       // tagname[attr='value'] ---- css
	       //tagname[@attr='value'] --- xpath
	       
	       // input[name='email]
	       // input[id='input-email']
	       // input[id='input-email'][type='text'][name='email']
	       // input#input-email[type='text'][name='email']
	       
	       // input[placeholder*='Address'] --- contains
	       // input[placeholder^='E-Mail']  ----- starts with
	       // input[placeholder$='Address'] ----- ends with
	       
	       // text in css : not available 
	       
	      // parent to child 
	       // form#hs-login > div ----> direct child ----- 8
	       // form#hs-login div -----> direct + indirect child ----- 22
	       
	       // select#Form_getForm_Country > option
	       // select#Form_getForm_Country  option  
	       
	        // child to parent: not allowed - backward traversing is not allowed in css
	       // child to ancestor: not allowed - backward traversing is not allowed in css
	       // preceding sibling: not allowed - backward traversing is not allowed in css
	       
	       //sibling in css
	       //label[for='input-email']+input#input-email --- immediate following sibling 
	       
	       // option[value='Algeria']+option --- immediate following sibling ---- 1
	       // option[value='Algeria'] ~ option --- immediate following sibling ---- more
	       
	       // comma in css:
	       // input#username,input#password,button#loginBtn,input#remember
	       
	       // int man_dory_field = driver.findElements(By.Css.Selector("input#username,input#password,button#loginBtn,input#remember")).size();
	       
	       // if(man_dory_field == 4){
	       //           System.out.println("all imp mandatory fields are present on the page");
	       //     }
	       
	       // not in css:
	       // div.form-group > input.formcontrol:not(#input-email)
	       
	       // index in css
	       // select#Form_getform_Country > option:nth-of-type(6)
	       // select#Form_getform_Country > option:nth-of-type(n)  ----- all
	       
	       // select#Form_getform_Country > option:first-child
	       // select#Form_getform_Country > option:last-child
	       // select#Form_getform_Country > option:nth-child(4)
	       // select#Form_getform_Country > option:nth-last-child(2)
	       // select#Form_getform_Country > option:nth-child(even)
	       // select#Form_getform_Country > option:first-child(odd)
	       // select#Form_getform_Country > option:nth-of-type(n+4)
	       // select#Form_getform_Country > option:nth-of-type(5n)
	       
	}
}
