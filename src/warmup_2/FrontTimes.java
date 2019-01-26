package warmup_2;

/* 
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. 
 * Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
	
	public String frontTimes(String str, int n) {
		  
		  String result = "";
		  
		  if (str.length() < 4) {
		    for (int i = 0; i < n; i++) {
		      result += str;
		    }
		    
		    return result;
		  }
		  
		  for (int i = 0; i < n; i++) {
		    result += str.substring(0,3);
		  }
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		frontTimes("Chocolate", 2) → "ChoCho"	"ChoCho"	OK	
//		frontTimes("Chocolate", 3) → "ChoChoCho"	"ChoChoCho"	OK	
//		frontTimes("Abc", 3) → "AbcAbcAbc"	"AbcAbcAbc"	OK	
//		frontTimes("Ab", 4) → "AbAbAbAb"	"AbAbAbAb"	OK	
//		frontTimes("A", 4) → "AAAA"	"AAAA"	OK	
//		frontTimes("", 4) → ""	""	OK	
//		frontTimes("Abc", 0) → ""	""	OK
	}

}
