package string1;

public class Left2 {

	public String left2(String str) {
		  
		  
		  String left = str.substring(0, 2);
		  
		  return str.substring(2)+left;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		left2("Hello") → "lloHe"	"lloHe"	OK	
//		left2("java") → "vaja"	"vaja"	OK	
//		left2("Hi") → "Hi"	"Hi"	OK	
//		left2("code") → "deco"	"deco"	OK	
//		left2("cat") → "tca"	"tca"	OK	
//		left2("12345") → "34512"	"34512"	OK	
//		left2("Chocolate") → "ocolateCh"	"ocolateCh"	OK	
//		left2("bricks") → "icksbr"	"icksbr"	OK	
		
	}
}
