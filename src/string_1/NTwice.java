package string_1;

public class NTwice {
	public String nTwice(String str, int n) {
		  
		  return str.substring(0,n) + str.substring(str.length()-n);
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		nTwice("Hello", 2) → "Helo"	"Helo"	OK	
//		nTwice("Chocolate", 3) → "Choate"	"Choate"	OK	
//		nTwice("Chocolate", 1) → "Ce"	"Ce"	OK	
//		nTwice("Chocolate", 0) → ""	""	OK	
//		nTwice("Hello", 4) → "Hellello"	"Hellello"	OK	
//		nTwice("Code", 4) → "CodeCode"	"CodeCode"	OK	
//		nTwice("Code", 2) → "Code"	"Code"	OK	
		
	}
}
