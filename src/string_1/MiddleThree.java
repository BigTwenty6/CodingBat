package string_1;

public class MiddleThree {
	
	public String middleThree(String str) {

		  int mid = str.length() / 2; 
		  
		  return str.substring(mid-1, mid+2);
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		middleThree("Candy") → "and"	"and"	OK	
//		middleThree("and") → "and"	"and"	OK	
//		middleThree("solving") → "lvi"	"lvi"	OK	
//		middleThree("Hi yet Hi") → "yet"	"yet"	OK	
//		middleThree("java yet java") → "yet"	"yet"	OK	
//		middleThree("Chocolate") → "col"	"col"	OK	
//		middleThree("XabcxyzabcX") → "xyz"	"xyz"	OK
		
	}

}
