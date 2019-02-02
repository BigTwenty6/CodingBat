package logic_1;
/*
 * 
 * The number 6 is a truly great number. 
 * Given two int values, a and b, return true if either one is 6.
 *  Or if their sum or difference is 6. 
 *  Note: the function Math.abs(num) computes the absolute value of a number.


love6(6, 4) → true
love6(4, 5) → false
love6(1, 5) → true
 */

public class Love6 {

	public boolean love6(int a, int b) {
		  
		  if (a == 6 || b == 6) {
		    return true;
		  }
		  
		  if (a+b == 6 || Math.abs(a-b) == 6){
		    return true;
		  }
		  
		  return false;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		love6(6, 4) → true	true	OK	
//		love6(4, 5) → false	false	OK	
//		love6(1, 5) → true	true	OK	
//		love6(1, 6) → true	true	OK	
//		love6(1, 8) → false	false	OK	
//		love6(1, 7) → true	true	OK	
//		love6(7, 5) → false	false	OK	
//		love6(8, 2) → true	true	OK	
//		love6(6, 6) → true	true	OK	
//		love6(-6, 2) → false	false	OK	
//		love6(-4, -10) → true	true	OK	
//		love6(-7, 1) → false	false	OK	
//		love6(7, -1) → true	true	OK	
//		love6(-6, 12) → true	true	OK	
//		love6(-2, -4) → false	false	OK	
//		love6(7, 1) → true	true	OK	
//		love6(0, 9) → false	false	OK	
//		love6(8, 3) → false	false	OK	
//		love6(3, 3) → true	true	OK	
//		love6(3, 4) → false	false	OK
		
	}
}
