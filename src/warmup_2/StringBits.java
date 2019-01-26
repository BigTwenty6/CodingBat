package warmup_2;

/*
 * 
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

 */

public class StringBits {

	public String stringBits(String str) {
		  
		  String result = "";
		  
		  for (int i = 0; i < str.length(); i +=2 ) {
		    
		        result += str.charAt(i);
		        
		  }
		  
		  return result;
	}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		stringBits("Hello") → "Hlo"	"Hlo"	OK	
//		stringBits("Hi") → "H"	"H"	OK	
//		stringBits("Heeololeo") → "Hello"	"Hello"	OK	
//		stringBits("HiHiHi") → "HHH"	"HHH"	OK	
//		stringBits("") → ""	""	OK	
//		stringBits("Greetings") → "Getns"	"Getns"	OK	
//		stringBits("Chocoate") → "Coot"	"Coot"	OK	
//		stringBits("pi") → "p"	"p"	OK	
//		stringBits("Hello Kitten") → "HloKte"	"HloKte"	OK	
//		stringBits("hxaxpxpxy") → "happy"	"happy"	OK	
	}
}
