package array_1;

/*
 * Given an array of ints, return the sum of the first 2 elements in the array. 
 * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.


sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */
public class Sum2 {
	
	public int sum2 (int[] nums) {
		  
		  if (nums.length == 0) {
		    return 0;
		  } else if (nums.length < 2) {
		    return nums[0];
		  }
		  
		  return nums[0]+nums[1];
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		sum2([1, 2, 3]) → 3	3	OK	
//		sum2([1, 1]) → 2	2	OK	
//		sum2([1, 1, 1, 1]) → 2	2	OK	
//		sum2([1, 2]) → 3	3	OK	
//		sum2([1]) → 1	1	OK	
//		sum2([]) → 0	0	OK	
//		sum2([4, 5, 6]) → 9	9	OK	
//		sum2([4]) → 4	4	OK	
		
	}

}