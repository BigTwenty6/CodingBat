package warmup_1;

/*
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
 *  Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 * 
 */

public class LastDigit {
	public boolean lastDigit(int a, int b) {

		int lastA = a % 10;
		int lastB = b % 10;

		return (lastA == lastB);
	}

	public static void main(String[] args) {
//		Expected	Run		
//		lastDigit(7, 17) → true	true	OK	
//		lastDigit(6, 17) → false	false	OK	
//		lastDigit(3, 113) → true	true	OK	
//		lastDigit(114, 113) → false	false	OK	
//		lastDigit(114, 4) → true	true	OK	
//		lastDigit(10, 0) → true	true	OK	
//		lastDigit(11, 0) → false	false	OK
	}
}
