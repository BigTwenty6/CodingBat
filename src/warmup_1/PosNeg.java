package warmup_1;

/*
 * 
 * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true
 */

public class PosNeg {

	public boolean posNeg(int a, int b, boolean negative) {
		  
		  if ( negative ) {
		    
		    if (a < 0 && b < 0 ){
		      
		    return true;
		    
		    } else {
		      
		     return false;
		    }
		  }
		  
		  if ( (a < 0 || b < 0) && (a > 0 || b > 0) ) {
		    
		    return true;
		  }
		  
		  return false;
		}
	
//	posNeg(1, -1, false) → true	true	OK	
//	posNeg(-1, 1, false) → true	true	OK	
//	posNeg(-4, -5, true) → true	true	OK	
//	posNeg(-4, -5, false) → false	false	OK	
//	posNeg(-4, 5, false) → true	true	OK	
//	posNeg(-4, 5, true) → false	false	OK	
//	posNeg(1, 1, false) → false	false	OK	
//	posNeg(-1, -1, false) → false	false	OK	
//	posNeg(1, -1, true) → false	false	OK	
//	posNeg(-1, 1, true) → false	false	OK	
//	posNeg(1, 1, true) → false	false	OK	
//	posNeg(-1, -1, true) → true	true	OK	
//	posNeg(5, -5, false) → true	true	OK	
//	posNeg(-6, 6, false) → true	true	OK	
//	posNeg(-5, -6, false) → false	false	OK	
//	posNeg(-2, -1, false) → false	false	OK	
}
