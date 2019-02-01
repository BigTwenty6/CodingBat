package string_1;


/* 
 * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. 
 * This is a little harder than it looks.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */


public class WithoutX2 {

	public String withoutX2(String str) {
		  
		  String result = str;
		  boolean hasXfront = false;
		  
		  if (str.length() < 2) {
		    return "";
		  }
		  
		  if (str.charAt(0) == 'x') {
		    result = str.substring(1);
		    hasXfront = true;
		  }
		  
		  if (hasXfront && result.charAt(0) == 'x') {
		    result = result.substring(1);
		  } else if (str.charAt(1) == 'x') {
		    result = result.substring(0,1) + result.substring(2);
		  }
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		withoutX2("xHi") → "Hi"	"Hi"	OK	
//		withoutX2("Hxi") → "Hi"	"Hi"	OK	
//		withoutX2("Hi") → "Hi"	"Hi"	OK	
//		withoutX2("xxHi") → "Hi"	"Hi"	OK	
//		withoutX2("Hix") → "Hix"	"Hix"	OK	
//		withoutX2("xaxb") → "axb"	"axb"	OK	
//		withoutX2("xx") → ""	""	OK	
//		withoutX2("x") → ""	""	OK	
//		withoutX2("") → ""	""	OK	
//		withoutX2("Hello") → "Hello"	"Hello"	OK	
//		withoutX2("Hexllo") → "Hexllo"	"Hexllo"	OK	
//		withoutX2("xHxllo") → "Hxllo"	"Hxllo"	OK
		
	}
}
