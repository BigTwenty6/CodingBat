package string1;

public class LastChars {

	public String lastChars(String a, String b) {
		  
		  String result = ""; 

		  
		  if (a.length() == 0) {
		     result += "@"; 
		  } else {
		    result += a.charAt(0);
		  }
		  
		  if (b.length() == 0) {
		    result += "@";
		  } else {
		    result += b.charAt(b.length()-1);
		  }
		  
		  return result;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		lastChars("last", "chars") → "ls"	"ls"	OK	
//		lastChars("yo", "java") → "ya"	"ya"	OK	
//		lastChars("hi", "") → "h@"	"h@"	OK	
//		lastChars("", "hello") → "@o"	"@o"	OK	
//		lastChars("", "") → "@@"	"@@"	OK	
//		lastChars("kitten", "hi") → "ki"	"ki"	OK	
//		lastChars("k", "zip") → "kp"	"kp"	OK	
//		lastChars("kitten", "") → "k@"	"k@"	OK	
//		lastChars("kitten", "zip") → "kp"	"kp"	OK
	}
}
