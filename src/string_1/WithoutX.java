package string_1;


/* 
 Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

 */

public class WithoutX {
	
	public String withoutX(String str) {
		  
		   String result = str;
		   
		   if (str.length() < 2) {
		     return "";
		   }
		   
		   if (str.charAt(0) == 'x'){
		     result = str.substring(1);
		   }
		   
		   if (str.charAt(str.length()-1) == 'x') {
		     result = result.substring(0, result.length()-1);
		   }
		   
		   return result;
		  
	}
	
	public static void main(String[] args) {
		
		
//		Expected	Run		
//		withoutX("xHix") → "Hi"	"Hi"	OK	
//		withoutX("xHi") → "Hi"	"Hi"	OK	
//		withoutX("Hxix") → "Hxi"	"Hxi"	OK	
//		withoutX("Hi") → "Hi"	"Hi"	OK	
//		withoutX("xxHi") → "xHi"	"xHi"	OK	
//		withoutX("Hix") → "Hi"	"Hi"	OK	
//		withoutX("xaxbx") → "axb"	"axb"	OK	
//		withoutX("xx") → ""	""	OK	
//		withoutX("x") → ""	""	OK	
//		withoutX("") → ""	""	OK	
//		withoutX("Hello") → "Hello"	"Hello"	OK	
//		withoutX("Hexllo") → "Hexllo"	"Hexllo"	OK	
		
	}

}
