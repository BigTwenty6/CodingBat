package logic_1;

/*
 * Given three ints, a b c, return true if two or more of them have the same rightmost digit. 
 * The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 * 
 */

public class LastDigit {

	public boolean lastDigit(int a, int b, int c) {
		  
		  int rA = a % 10;
		  int rB = b % 10;
		  int rC = c % 10;
		  
		  if ( rA == rB || rB == rC || rA == rC) {
		    return true;
		  }
		  
		  return false;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		lastDigit(23, 19, 13) → true	true	OK	
//		lastDigit(23, 19, 12) → false	false	OK	
//		lastDigit(23, 19, 3) → true	true	OK	
//		lastDigit(23, 19, 39) → true	true	OK	
//		lastDigit(1, 2, 3) → false	false	OK	
//		lastDigit(1, 1, 2) → true	true	OK	
//		lastDigit(1, 2, 2) → true	true	OK	
//		lastDigit(14, 25, 43) → false	false	OK	
//		lastDigit(14, 25, 45) → true	true	OK	
//		lastDigit(248, 106, 1002) → false	false	OK	
//		lastDigit(248, 106, 1008) → true	true	OK	
//		lastDigit(10, 11, 20) → true	true	OK	
//		lastDigit(0, 11, 0) → true	true	OK	
	}
	
}
