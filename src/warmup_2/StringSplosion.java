package warmup_2;

/* 
 * Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

 */

public class StringSplosion {
	
	public String stringSplosion(String str) {
		  
		  String result = "";
		  
		  for (int i = 0; i < str.length(); i++) {
		    
		    result += str.substring(0, i+1);
		    
		  }
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		stringSplosion("Code") → "CCoCodCode"	"CCoCodCode"	OK	
//		stringSplosion("abc") → "aababc"	"aababc"	OK	
//		stringSplosion("ab") → "aab"	"aab"	OK	
//		stringSplosion("x") → "x"	"x"	OK	
//		stringSplosion("fade") → "ffafadfade"	"ffafadfade"	OK	
//		stringSplosion("There") → "TThTheTherThere"	"TThTheTherThere"	OK	
//		stringSplosion("Kitten") → "KKiKitKittKitteKitten"	"KKiKitKittKitteKitten"	OK	
//		stringSplosion("Bye") → "BByBye"	"BByBye"	OK	
//		stringSplosion("Good") → "GGoGooGood"	"GGoGooGood"	OK	
//		stringSplosion("Bad") → "BBaBad"	"BBaBad"	OK
	}

}
