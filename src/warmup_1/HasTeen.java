package warmup_1;

/*
 * 
We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */

public class HasTeen {
	
	public boolean hasTeen(int a, int b, int c) {
		  
		  if (  (a >= 13 && a <= 19) ||
		        (b >= 13 && b <= 19) ||
		        (c >= 13 && c <= 19) ) {
		        return true;
		      }
		      
		  return false;
		}

//	Expected	Run		
//	hasTeen(13, 20, 10) → true	true	OK	
//	hasTeen(20, 19, 10) → true	true	OK	
//	hasTeen(20, 10, 13) → true	true	OK	
//	hasTeen(1, 20, 12) → false	false	OK	
//	hasTeen(19, 20, 12) → true	true	OK	
//	hasTeen(12, 20, 19) → true	true	OK	
//	hasTeen(12, 9, 20) → false	false	OK	
//	hasTeen(12, 18, 20) → true	true	OK	
//	hasTeen(14, 2, 20) → true	true	OK	
//	hasTeen(4, 2, 20) → false	false	OK	
//	hasTeen(11, 22, 22) → false	false	OK
}
