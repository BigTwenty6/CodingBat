package string_1;

public class MiddleTwo {

	public String middleTwo(String str) {
		  
		  return str.substring( (str.length()/2)-1, (str.length()/2) + 1);
		  
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		middleTwo("string") → "ri"	"ri"	OK	
//		middleTwo("code") → "od"	"od"	OK	
//		middleTwo("Practice") → "ct"	"ct"	OK	
//		middleTwo("ab") → "ab"	"ab"	OK	
//		middleTwo("0123456789") → "45"	"45"	OK	
	}
}
