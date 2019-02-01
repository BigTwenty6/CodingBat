package string_1;

public class Without2 {

	public static String without2(String str) {
			  
			  if (str.length() < 2) {
			    return str;
			  }
			  
			  String start = str.substring(0, 2);
			  String end = str.substring(str.length()-2);
			  
			  if (start.equals(end)) {
			    return str.substring(2);
			  }
			  
			  return str;
			}


	public static void main(String[] args) {
		
		System.out.println(without2("HelloHe"));
		
//		Expected	Run		
//		without2("HelloHe") → "lloHe"	"lloHe"	OK	
//		without2("HelloHi") → "HelloHi"	"HelloHi"	OK	
//		without2("Hi") → ""	""	OK	
//		without2("Chocolate") → "Chocolate"	"Chocolate"	OK	
//		without2("xxx") → "x"	"x"	OK	
//		without2("xx") → ""	""	OK	
//		without2("x") → "x"	"x"	OK	
//		without2("") → ""	""	OK	
//		without2("Fruits") → "Fruits"	"Fruits"	OK	
	}
}
