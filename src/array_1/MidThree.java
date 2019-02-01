package array_1;

/*
 * 
 * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
 *  The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
public class MidThree {

	public int[] midThree(int[] nums) {
		  
		  int idx = nums.length / 2; 
		  
		  int [] result = {nums[idx-1], nums[idx], nums[idx+1]};
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		midThree([1, 2, 3, 4, 5]) → [2, 3, 4]	[2, 3, 4]	OK	
//		midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]	[7, 5, 3]	OK	
//		midThree([1, 2, 3]) → [1, 2, 3]	[1, 2, 3]	OK
	}
}
