package warmup_1;

/* 
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.


icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
 */

public class IcyHot {

	public boolean icyHot(int temp1, int temp2) {
		  
		  if ( (temp1 > 0 && temp2 < 100) ||  (temp1 < 0 && temp2 > 100) ) {
		    return true;
		  }
		  
		  return false;
		}
	
//	Expected	Run		
//	icyHot(120, -1) → true	true	OK	
//	icyHot(-1, 120) → true	true	OK	
//	icyHot(2, 120) → false	false	OK	
//	icyHot(-1, 100) → false	false	OK	
//	icyHot(-2, -2) → false	false	OK	
//	icyHot(120, 120) → false	false	OK	

}
