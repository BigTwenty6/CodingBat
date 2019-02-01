package string_1;

public class WithoutEnd2 {
	
	public String withouEnd2(String str) {
		  
	    if (str.length() < 2) {
	      return "";
	    }
	    
	    return str.substring(1,str.length()-1);
	  
	}

	public static void main(String[] args) {
		
//		Expected	Run		
//		withouEnd2("Hello") → "ell"	"ell"	OK	
//		withouEnd2("abc") → "b"	"b"	OK	
//		withouEnd2("ab") → ""	""	OK	
//		withouEnd2("a") → ""	""	OK	
//		withouEnd2("") → ""	""	OK	
//		withouEnd2("coldy") → "old"	"old"	OK	
//		withouEnd2("java code") → "ava cod"	"ava cod"	OK	
		
	}
}
