package logic_2;

/*
 * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), 
 * while the other is "far", differing from both other values by 2 or more.
 *  Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
public class CloseFar {

	public boolean closeFar(int a, int b, int c) {
		  
		  if ( Math.abs(a-b) <= 1 && (Math.abs(a-c) >= 2 && Math.abs(b-c) >=2 ) ) { 
		    return true;
		  }
		  
		  if ( Math.abs(a-c) <= 1 && (Math.abs(a-b) >= 2 && Math.abs(b-c) >=2 ) ) {
		    return true;
		  }
		  
		  return false;
		  
		  // can write methods to do close and far functions but you end up with the same amount of code.
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		closeFar(1, 2, 10) → true	true	OK	
//		closeFar(1, 2, 3) → false	false	OK	
//		closeFar(4, 1, 3) → true	true	OK	
//		closeFar(4, 5, 3) → false	false	OK	
//		closeFar(4, 3, 5) → false	false	OK	
//		closeFar(-1, 10, 0) → true	true	OK	
//		closeFar(0, -1, 10) → true	true	OK	
//		closeFar(10, 10, 8) → true	true	OK	
//		closeFar(10, 8, 9) → false	false	OK	
//		closeFar(8, 9, 10) → false	false	OK	
//		closeFar(8, 9, 7) → false	false	OK	
//		closeFar(8, 6, 9) → true	true	OK
	}
}
