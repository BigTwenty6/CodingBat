package logic_1;
/*
 * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.


twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
 */
public class TwoAsOne {
	public boolean twoAsOne(int a, int b, int c) {
		  
		  if (a + b == c) {
		   return true;
		  }
		  
		  if (b + c == a) {
		    return true;
		  }
		  
		  if (c + a == b) {
		    return true;
		  }
		  
		  return false;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		twoAsOne(1, 2, 3) → true	true	OK	
//		twoAsOne(3, 1, 2) → true	true	OK	
//		twoAsOne(3, 2, 2) → false	false	OK	
//		twoAsOne(2, 3, 1) → true	true	OK	
//		twoAsOne(5, 3, -2) → true	true	OK	
//		twoAsOne(5, 3, -3) → false	false	OK	
//		twoAsOne(2, 5, 3) → true	true	OK	
//		twoAsOne(9, 5, 5) → false	false	OK	
//		twoAsOne(9, 4, 5) → true	true	OK	
//		twoAsOne(5, 4, 9) → true	true	OK	
//		twoAsOne(3, 3, 0) → true	true	OK	
//		twoAsOne(3, 3, 2) → false	false	OK
	}
}
