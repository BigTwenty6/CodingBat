package array_1;

/*
 * 
 * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]

 */
public class MaxEnd3 {

	public int[] maxEnd3(int[] nums) {
		  
		  int target = nums[0];
		  
		  int third = nums[2];
		  
		  if (target < third) {
		    target = third;
		  }
		  
		  // alternatively, can use Math.max(nums[0], nums[2])
		  
		  int [] maxN = {target, target, target};
		  
		  return maxN;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		maxEnd3([1, 2, 3]) → [3, 3, 3]	[3, 3, 3]	OK	
//		maxEnd3([11, 5, 9]) → [11, 11, 11]	[11, 11, 11]	OK	
//		maxEnd3([2, 11, 3]) → [3, 3, 3]	[3, 3, 3]	OK	
//		maxEnd3([11, 3, 3]) → [11, 11, 11]	[11, 11, 11]	OK	
//		maxEnd3([3, 11, 11]) → [11, 11, 11]	[11, 11, 11]	OK	
//		maxEnd3([2, 2, 2]) → [2, 2, 2]	[2, 2, 2]	OK	
//		maxEnd3([2, 11, 2]) → [2, 2, 2]	[2, 2, 2]	OK	
//		maxEnd3([0, 0, 1]) → [1, 1, 1]	[1, 1, 1]	OK
		
	}
}
