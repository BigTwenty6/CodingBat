package logic_1;

/*
 * Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. 
 * If the sum has more digits than a, just return a without b. 
 * (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */
public class SumLimit {

	public int sumLimit(int a, int b) {

		int sum = a + b;

		String aString = a + "";
		String sString = sum + "";

		if (sString.length() > aString.length()) {
			return a;
		}

		return sum;

// Alternative solution using String.valueOf method
//		  int aLength = String.valueOf(a).length();
//		  int bLength = String.valueOf(b).length();
//		  
//		  if (sum >  aLength) {
//			  return a;
//		  }
//		  
//		  return sum;

	}

	public static void main(String[] args) {

//		Expected	Run		
//		sumLimit(2, 3) → 5	5	OK	
//		sumLimit(8, 3) → 8	8	OK	
//		sumLimit(8, 1) → 9	9	OK	
//		sumLimit(11, 39) → 50	50	OK	
//		sumLimit(11, 99) → 11	11	OK	
//		sumLimit(0, 0) → 0	0	OK	
//		sumLimit(99, 0) → 99	99	OK	
//		sumLimit(99, 1) → 99	99	OK	
//		sumLimit(123, 1) → 124	124	OK	
//		sumLimit(1, 123) → 1	1	OK	
//		sumLimit(23, 60) → 83	83	OK	
//		sumLimit(23, 80) → 23	23	OK	
//		sumLimit(9000, 1) → 9001	9001	OK	
//		sumLimit(90000000, 1) → 90000001	90000001	OK	
//		sumLimit(9000, 1000) → 9000	9000	OK	
	}

}
