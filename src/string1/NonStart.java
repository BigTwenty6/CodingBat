package string1;

public class NonStart {

	public String nonStart(String a, String b) {
		  
		  return a.substring(1)+b.substring(1);
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		nonStart("Hello", "There") → "ellohere"	"ellohere"	OK	
//		nonStart("java", "code") → "avaode"	"avaode"	OK	
//		nonStart("shotl", "java") → "hotlava"	"hotlava"	OK	
//		nonStart("ab", "xy") → "by"	"by"	OK	
//		nonStart("ab", "x") → "b"	"b"	OK	
//		nonStart("x", "ac") → "c"	"c"	OK	
//		nonStart("a", "x") → ""	""	OK	
//		nonStart("kit", "kat") → "itat"	"itat"	OK	
//		nonStart("mart", "dart") → "artart"	"artart"	OK	
	}
}
