package string_1;

public class ComboString {

	public String comboString(String a, String b) {
		  
		  String shortW = "";
		  String longW = "";
		  
		  if ( a.length() < b.length() ) {
		    shortW = a;
		    longW = b;
		  } else  {
		    shortW = b;
		    longW = a;
		  }
		  
		  return shortW + longW+ shortW;
	}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		comboString("Hello", "hi") → "hiHellohi"	"hiHellohi"	OK	
//		comboString("hi", "Hello") → "hiHellohi"	"hiHellohi"	OK	
//		comboString("aaa", "b") → "baaab"	"baaab"	OK	
//		comboString("b", "aaa") → "baaab"	"baaab"	OK	
//		comboString("aaa", "") → "aaa"	"aaa"	OK	
//		comboString("", "bb") → "bb"	"bb"	OK	
//		comboString("aaa", "1234") → "aaa1234aaa"	"aaa1234aaa"	OK	
//		comboString("aaa", "bb") → "bbaaabb"	"bbaaabb"	OK	
//		comboString("a", "bb") → "abba"	"abba"	OK	
//		comboString("bb", "a") → "abba"	"abba"	OK	
//		comboString("xyz", "ab") → "abxyzab"	"abxyzab"	OK	
		
	}
}
