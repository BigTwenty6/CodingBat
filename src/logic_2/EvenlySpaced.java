package logic_2;

import java.util.Arrays;

/*
 * Given three ints, a b c, one of them is small, one is medium and one is large. 
 * Return true if the three values are evenly spaced, 
 * so the difference between small and medium is the same as the difference between medium and large.


evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */

public class EvenlySpaced {

	public boolean evenlySpaced(int a, int b, int c) {
		  
		 int [] arr = {a, b, c};
		 
		 Arrays.sort(arr);
		 
		 if ( (arr[1] - arr[0]) == (arr[2] - arr[1]) ) {
		   return true;
		 }
		 
		 return false;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		evenlySpaced(2, 4, 6) → true	true	OK	
//		evenlySpaced(4, 6, 2) → true	true	OK	
//		evenlySpaced(4, 6, 3) → false	false	OK	
//		evenlySpaced(6, 2, 4) → true	true	OK	
//		evenlySpaced(6, 2, 8) → false	false	OK	
//		evenlySpaced(2, 2, 2) → true	true	OK	
//		evenlySpaced(2, 2, 3) → false	false	OK	
//		evenlySpaced(9, 10, 11) → true	true	OK	
//		evenlySpaced(10, 9, 11) → true	true	OK	
//		evenlySpaced(10, 9, 9) → false	false	OK	
//		evenlySpaced(2, 4, 4) → false	false	OK	
//		evenlySpaced(2, 2, 4) → false	false	OK	
//		evenlySpaced(3, 6, 12) → false	false	OK	
//		evenlySpaced(12, 3, 6) → false	false	OK	
		
	}
}
