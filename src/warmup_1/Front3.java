package warmup_1;

/*
 * 
Given a string, we'll say that the front is the first 3 chars of the string.
 If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.


front3("Java") → "JavJavJav"
front3("Chocolate") → "ChoChoCho"
front3("abc") → "abcabcabc"
 */

public class Front3 {

	public String front3(String str) {

		  
		  String temp = "";
		  
		  if (str.length() <3){
		    temp = str;
		  } else {
		    temp = str.substring(0,3);
		  }
		  
		  return temp+temp+temp;
		  
		}

//	Expected	Run		
//	front3("Java") → "JavJavJav"	"JavJavJav"	OK	
//	front3("Chocolate") → "ChoChoCho"	"ChoChoCho"	OK	
//	front3("abc") → "abcabcabc"	"abcabcabc"	OK	
//	front3("abcXYZ") → "abcabcabc"	"abcabcabc"	OK	
//	front3("ab") → "ababab"	"ababab"	OK	
//	front3("a") → "aaa"	"aaa"	OK	
//	front3("") → ""	""	OK
	
}
