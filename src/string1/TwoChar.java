package string1;

public class TwoChar {
	public String twoChar(String str, int index) {
		  
		  if (str.length() < index+2 || index <0 ) {
		    return str.substring(0,2);
		  }
		  
		  return str.substring(index, index+2);
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		twoChar("java", 0) → "ja"	"ja"	OK	
//		twoChar("java", 2) → "va"	"va"	OK	
//		twoChar("java", 3) → "ja"	"ja"	OK	
//		twoChar("java", 4) → "ja"	"ja"	OK	
//		twoChar("java", -1) → "ja"	"ja"	OK	
//		twoChar("Hello", 0) → "He"	"He"	OK	
//		twoChar("Hello", 1) → "el"	"el"	OK	
//		twoChar("Hello", 99) → "He"	"He"	OK	
//		twoChar("Hello", 3) → "lo"	"lo"	OK	
//		twoChar("Hello", 4) → "He"	"He"	OK	
//		twoChar("Hello", 5) → "He"	"He"	OK	
//		twoChar("Hello", -7) → "He"	"He"	OK	
//		twoChar("Hello", 6) → "He"	"He"	OK	
//		twoChar("Hello", -1) → "He"	"He"	OK	
//		twoChar("yay", 0) → "ya"	"ya"	OK
	}

}
