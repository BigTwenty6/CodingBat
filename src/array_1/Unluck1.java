package array_1;

/*
 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. 
 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.


unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class Unluck1 {
	
	public boolean unlucky1(int[] nums) {
		  
		  if (nums.length < 2) {
		    return false;
		  }
		  
		  if (nums[0] == 1 && nums[1] == 3){
		    return true;
		  }
		  
		  if (nums[1] == 1 && nums[2] == 3){
		    return true;
		  }
		  
		  if (nums[nums.length-2] == 1 && nums[nums.length-1] == 3){
		    return true;
		  }
		  
		  return false;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		unlucky1([1, 3, 4, 5]) → true	true	OK	
//		unlucky1([2, 1, 3, 4, 5]) → true	true	OK	
//		unlucky1([1, 1, 1]) → false	false	OK	
//		unlucky1([1, 3, 1]) → true	true	OK	
//		unlucky1([1, 1, 3]) → true	true	OK	
//		unlucky1([1, 2, 3]) → false	false	OK	
//		unlucky1([3, 3, 3]) → false	false	OK	
//		unlucky1([1, 3]) → true	true	OK	
//		unlucky1([1, 4]) → false	false	OK	
//		unlucky1([1]) → false	false	OK	
//		unlucky1([]) → false	false	OK	
//		unlucky1([1, 1, 1, 3, 1]) → false	false	OK	
//		unlucky1([1, 1, 3, 1, 1]) → true	true	OK	
//		unlucky1([1, 1, 1, 1, 3]) → true	true	OK	
//		unlucky1([1, 4, 1, 5]) → false	false	OK	
//		unlucky1([1, 1, 2, 3]) → false	false	OK	
//		unlucky1([2, 3, 2, 1]) → false	false	OK	
//		unlucky1([2, 3, 1, 3]) → true	true	OK	
//		unlucky1([1, 2, 3, 4, 1, 3]) → true	true	OK
	
	}
}
