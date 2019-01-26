package warmup_1;

/*
 * 
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
 If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class Front22 {
	
	public String front22(String str) {
		  
		  String temp = "";
		  
		  if (str.length() <= 2) {
		    temp = str;  
		  } else {
		    temp = str.substring(0,2);
		  }
		  
		  return temp+str+temp;
		  
		  
		}
	
//	Expected	Run		
//	front22("kitten") → "kikittenki"	"kikittenki"	OK	
//	front22("Ha") → "HaHaHa"	"HaHaHa"	OK	
//	front22("abc") → "ababcab"	"ababcab"	OK	
//	front22("ab") → "ababab"	"ababab"	OK	
//	front22("a") → "aaa"	"aaa"	OK	
//	front22("") → ""	""	OK	
//	front22("Logic") → "LoLogicLo"	"LoLogicLo"	OK

}
