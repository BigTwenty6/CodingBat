package warmup_1;

/* 
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 * 
 */

public class MixStart {

	public boolean mixStart(String str) {
		  
		  if (str.length() > 2 && str.substring(1,3).equals("ix")) {
		    return true;
		  }
		  
		  return false;
		}
	
//	Expected	Run		
//	mixStart("mix snacks") → true	true	OK	
//	mixStart("pix snacks") → true	true	OK	
//	mixStart("piz snacks") → false	false	OK	
//	mixStart("nix") → true	true	OK	
//	mixStart("ni") → false	false	OK	
//	mixStart("n") → false	false	OK	
//	mixStart("") → false	false	OK
	
}

