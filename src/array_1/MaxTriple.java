package array_1;

/*
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5

 */

public class MaxTriple {
	
	public int maxTriple(int[] nums) {
		  int max = nums[0];
		  
		  if (max < nums[nums.length/2]){
		    max = nums[nums.length/2];
		  }
		  
		  if (max < nums[nums.length-1]){
		    max = nums[nums.length-1];
		  }
		  
		  return max;
		}
	
		


	public static void main(String[] args) {
		
//		Expected	Run		
//		maxTriple([1, 2, 3]) → 3	3	OK	
//		maxTriple([1, 5, 3]) → 5	5	OK	
//		maxTriple([5, 2, 3]) → 5	5	OK	
//		maxTriple([1, 2, 3, 1, 1]) → 3	3	OK	
//		maxTriple([1, 7, 3, 1, 5]) → 5	5	OK	
//		maxTriple([5, 1, 3, 7, 1]) → 5	5	OK	
//		maxTriple([5, 1, 7, 3, 7, 8, 1]) → 5	5	OK	
//		maxTriple([5, 1, 7, 9, 7, 8, 1]) → 9	9	OK	
//		maxTriple([5, 1, 7, 3, 7, 8, 9]) → 9	9	OK	
//		maxTriple([2, 2, 5, 1, 1]) → 5	5	OK
	}
}
