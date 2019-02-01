package array_1;

/*
 * 
 * 
Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */
public class MakeEnds {
	
	public int[] makeEnds(int[] nums) {
		  
		  int [] result = {nums[0], nums[nums.length-1]};
		  
		  return result;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		makeEnds([1, 2, 3]) → [1, 3]	[1, 3]	OK	
//		makeEnds([1, 2, 3, 4]) → [1, 4]	[1, 4]	OK	
//		makeEnds([7, 4, 6, 2]) → [7, 2]	[7, 2]	OK	
//		makeEnds([1, 2, 2, 2, 2, 2, 2, 3]) → [1, 3]	[1, 3]	OK	
//		makeEnds([7, 4]) → [7, 4]	[7, 4]	OK	
//		makeEnds([7]) → [7, 7]	[7, 7]	OK	
//		makeEnds([5, 2, 9]) → [5, 9]	[5, 9]	OK	
//		makeEnds([2, 3, 4, 1]) → [2, 1]	[2, 1]	OK
		
	}

}
