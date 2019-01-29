package string1;

public class FirstHalf {
	
	public String firstHalf(String str) {
		  
		  int half = str.length() / 2;
		  
		  return str.substring(0, half);
		  
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		firstHalf("WooHoo") → "Woo"	"Woo"	OK	
//		firstHalf("HelloThere") → "Hello"	"Hello"	OK	
//		firstHalf("abcdef") → "abc"	"abc"	OK	
//		firstHalf("ab") → "a"	"a"	OK	
//		firstHalf("") → ""	""	OK	
//		firstHalf("0123456789") → "01234"	"01234"	OK	
//		firstHalf("kitten") → "kit"	"kit"	OK	
//		other tests
//		OK	
		
	}

}
