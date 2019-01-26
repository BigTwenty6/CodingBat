package warmup_1;

/*
 * 
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 2 int values, return true if one or the other is teen, but not both.


loneTeen(13, 99) → true
loneTeen(21, 19) → true
loneTeen(13, 13) → false
 */

public class LoneTeen {

	public boolean loneTeen(int a, int b) {

		if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
			return false;
		}

		if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
			return true;
		}

		return false;
	}

//	Expected	Run
//
//	loneTeen(13, 99) → true	true	OK	
//	loneTeen(21, 19) → true	true	OK	
//	loneTeen(13, 13) → false	false	OK	
//	loneTeen(14, 20) → true	true	OK	
//	loneTeen(20, 15) → true	true	OK	
//	loneTeen(16, 17) → false	false	OK	
//	loneTeen(16, 9) → true	true	OK	
//	loneTeen(16, 18) → false	false	OK	
//	loneTeen(13, 19) → false	false	OK	
//	loneTeen(13, 20) → true	true	OK	
//	loneTeen(6, 18) → true	true	OK	
//	loneTeen(99, 13) → true	true	OK	
//	loneTeen(99, 99) → false	false	OK
}
