package warmup_2;

/*
 * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */

public class ArrayFront9 {
	public boolean arrayFront9(int[] nums) {

		int max = 4;

		for (int num : nums) {
			max--;
			if (num == 9 && max > 0) {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {

//		Expected	Run		
//		arrayFront9([1, 2, 9, 3, 4]) → true	true	OK	
//		arrayFront9([1, 2, 3, 4, 9]) → false	false	OK	
//		arrayFront9([1, 2, 3, 4, 5]) → false	false	OK	
//		arrayFront9([9, 2, 3]) → true	true	OK	
//		arrayFront9([1, 9, 9]) → true	true	OK	
//		arrayFront9([1, 2, 3]) → false	false	OK	
//		arrayFront9([1, 9]) → true	true	OK	
//		arrayFront9([5, 5]) → false	false	OK	
//		arrayFront9([2]) → false	false	OK	
//		arrayFront9([9]) → true	true	OK	
//		arrayFront9([]) → false	false	OK	
//		arrayFront9([3, 9, 2, 3, 3]) → true	true	OK
	}

}
