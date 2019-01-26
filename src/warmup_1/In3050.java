package warmup_1;


/*
 * 
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true

*/

public class In3050 {

	public boolean in3050(int a, int b) {

		  if ( ( a >= 30 && a <= 40) && (b >= 30 && b <= 40) ) {
		  return true;
		  }
		    
		  if ( ( a >= 40 && a <= 50) && (b >= 40 && b <= 50) ) {
		    return true;
		  }
		    
		  return false;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		in3050(30, 31) → true	true	OK	
//		in3050(30, 41) → false	false	OK	
//		in3050(40, 50) → true	true	OK	
//		in3050(40, 51) → false	false	OK	
//		in3050(39, 50) → false	false	OK	
//		in3050(50, 39) → false	false	OK	
//		in3050(40, 39) → true	true	OK	
//		in3050(49, 48) → true	true	OK	
//		in3050(50, 40) → true	true	OK	
//		in3050(50, 51) → false	false	OK	
//		in3050(35, 36) → true	true	OK	
//		in3050(35, 45) → false	false	OK
	}

}
