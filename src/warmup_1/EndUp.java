package warmup_1;

/* 
 * 
Given a string, return a new string where the last 3 chars are now in upper case. 
If the string has less than 3 chars, uppercase whatever is there. 
Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 * 
 */

public class EndUp {

	public String endUp(String str) {

		if (str.length() < 4) {
			return str.toUpperCase();
		}

		return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
	}

	public static void main(String[] args) {
		
//		Expected	Run		
//		endUp("Hello") → "HeLLO"	"HeLLO"	OK	
//		endUp("hi there") → "hi thERE"	"hi thERE"	OK	
//		endUp("hi") → "HI"	"HI"	OK	
//		endUp("woo hoo") → "woo HOO"	"woo HOO"	OK	
//		endUp("xyz12") → "xyZ12"	"xyZ12"	OK	
//		endUp("x") → "X"	"X"	OK	
//		endUp("") → ""	""	OK	
	}
}
