package warmup_2;

public class NoTriples {
	
	public boolean noTriples(int[] nums) {
		  
		  for (int i = 0; i < nums.length - 2 ; i++ ) {
		    
		    if ( ( i+2 < nums.length) && (nums[i] == nums[i+1] && nums[i+1] == nums[i+2])) {
		      return false;
		    }
		  }
		  
		  return true;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		noTriples([1, 1, 2, 2, 1]) → true	true	OK	
//		noTriples([1, 1, 2, 2, 2, 1]) → false	false	OK	
//		noTriples([1, 1, 1, 2, 2, 2, 1]) → false	false	OK	
//		noTriples([1, 1, 2, 2, 1, 2, 1]) → true	true	OK	
//		noTriples([1, 2, 1]) → true	true	OK	
//		noTriples([1, 1, 1]) → false	false	OK	
//		noTriples([1, 1]) → true	true	OK	
//		noTriples([1]) → true	true	OK	
//		noTriples([]) → true	true	OK	
		
	}
}
