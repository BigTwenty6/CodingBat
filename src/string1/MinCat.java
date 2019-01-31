package string1;

public class MinCat {

	
	public String minCat(String a, String b) {
		  
		  int length = 0;
		  
		  if (a.length() < b.length()){ 
		    length = a.length();
		  } else {
		    length = b.length();
		  }
		  
		  String result = "";
		  
		  result = a.substring(a.length()-length) + b.substring(b.length()-length);
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		minCat("Hello", "Hi") → "loHi"	"loHi"	OK	
//		minCat("Hello", "java") → "ellojava"	"ellojava"	OK	
//		minCat("java", "Hello") → "javaello"	"javaello"	OK	
//		minCat("abc", "x") → "cx"	"cx"	OK	
//		minCat("x", "abc") → "xc"	"xc"	OK	
//		minCat("abc", "") → ""	""	OK
		
	}
}
