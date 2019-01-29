package warmup_2;

public class StringX {
	
	public String stringX(String str) {

	 String result = "";
	  
	  for (int i = 0; i < str.length(); i++) {
	    
	    if (i == 0 || i == (str.length()-1)) {
	      result += str.charAt(i);
	      continue;
	    }
	    
	    if (str.charAt(i) != 'x') {
	      result += str.charAt(i)+"";
	    }
	  }
	  
	  return result;
	}

	public static void main(String[] args) {
		
//		Expected	Run		
//		stringX("xxHxix") → "xHix"	"xHix"	OK	
//		stringX("abxxxcd") → "abcd"	"abcd"	OK	
//		stringX("xabxxxcdx") → "xabcdx"	"xabcdx"	OK	
//		stringX("xKittenx") → "xKittenx"	"xKittenx"	OK	
//		stringX("Hello") → "Hello"	"Hello"	OK	
//		stringX("xx") → "xx"	"xx"	OK	
//		stringX("x") → "x"	"x"	OK	
//		stringX("") → ""	""	OK	
	}
}
