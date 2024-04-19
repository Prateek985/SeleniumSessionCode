package Seleniumsessions;

public class StringLength {

	public static void main(String[] args) {


		//when we want to remove the particular char from the string then we use this program
		String s = "I am a automation Tester";
		char[] ch = s.toCharArray();
		System.out.println(removeChar(s,'a'));

	}
	
	  public static String removeChar(String s, char c) {
		    String r = "";
		    for (int i = 0; i < s.length(); i++) {
		      if (s.charAt(i) != c)
		        r += s.charAt(i);
		    }
		    return r;

		  }

}
