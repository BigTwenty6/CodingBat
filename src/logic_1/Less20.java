package logic_1;

/*
 * Return true if the given non-negative number is 1 or 2 less than a multiple of 20.
 * So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod


less20(18) → true
less20(19) → true
less20(20) → false
 * 
 */
public class Less20 {
	
	public boolean less20(int n) {
		  
		  
		  if ((n+1) % 20 == 0 || (n+2) % 20 == 0) {
		    
		    return true;
		  
		  }
		  
		  return false;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		less20(18) → true	true	OK	
//		less20(19) → true	true	OK	
//		less20(20) → false	false	OK	
//		less20(8) → false	false	OK	
//		less20(17) → false	false	OK	
//		less20(23) → false	false	OK	
//		less20(25) → false	false	OK	
//		less20(30) → false	false	OK	
//		less20(31) → false	false	OK	
//		less20(58) → true	true	OK	
//		less20(59) → true	true	OK	
//		less20(60) → false	false	OK	
//		less20(61) → false	false	OK	
//		less20(62) → false	false	OK	
//		less20(1017) → false	false	OK	
//		less20(1018) → true	true	OK	
//		less20(1019) → true	true	OK	
//		less20(1020) → false	false	OK	
//		less20(1021) → false	false	OK	
//		less20(1022) → false	false	OK	
//		less20(1023) → false	false	OK	
//		less20(37) → false	false	OK
		
	}

}
