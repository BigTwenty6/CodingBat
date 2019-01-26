package warmup_2;

/* 
 * 
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */

public class Array123 {
	
	public boolean array123(int[] nums) {
		  
		  for (int i = 0; i < nums.length-2; i++) {
		    
		    if ((nums[i] == 1) && (nums[i+1] == 2) && (nums[i+2] == 3)){
		      return true;
		    }
		    }
		   
		   return false;
		  
		}

	
	public static void main(String[] args) {
		
//		Expected	Run		
//		array123([1, 1, 2, 3, 1]) → true	true	OK	
//		array123([1, 1, 2, 4, 1]) → false	false	OK	
//		array123([1, 1, 2, 1, 2, 3]) → true	true	OK	
//		array123([1, 1, 2, 1, 2, 1]) → false	false	OK	
//		array123([1, 2, 3, 1, 2, 3]) → true	true	OK	
//		array123([1, 2, 3]) → true	true	OK	
//		array123([1, 1, 1]) → false	false	OK	
//		array123([1, 2]) → false	false	OK	
//		array123([1]) → false	false	OK	
//		array123([]) → false	false	OK
	}

}
