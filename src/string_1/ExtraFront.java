package string_1;

public class ExtraFront {
	
	public String extraFront(String str) {
		  
		  if ( str.length() < 2 ) { 
		    return str+str+str;
		  }
		  
		  return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		extraFront("Hello") → "HeHeHe"	"HeHeHe"	OK	
//		extraFront("ab") → "ababab"	"ababab"	OK	
//		extraFront("H") → "HHH"	"HHH"	OK	
//		extraFront("") → ""	""	OK	
//		extraFront("Candy") → "CaCaCa"	"CaCaCa"	OK	
//		extraFront("Code") → "CoCoCo"	"CoCoCo"	OK	
	}

}
