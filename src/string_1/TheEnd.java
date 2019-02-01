package string_1;

public class TheEnd {
	
	public String theEnd(String str, boolean front) {
		  
		  if (front) {
		    return str.substring(0,1);
		  }
		  
		  return str.substring(str.length()-1);
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		theEnd("Hello", true) → "H"	"H"	OK	
//		theEnd("Hello", false) → "o"	"o"	OK	
//		theEnd("oh", true) → "o"	"o"	OK	
//		theEnd("oh", false) → "h"	"h"	OK	
//		theEnd("x", true) → "x"	"x"	OK	
//		theEnd("x", false) → "x"	"x"	OK	
//		theEnd("java", true) → "j"	"j"	OK	
//		theEnd("chocolate", false) → "e"	"e"	OK	
//		theEnd("1234", true) → "1"	"1"	OK	
//		theEnd("code", false) → "e"	"e"	OK	
		
	}

}
