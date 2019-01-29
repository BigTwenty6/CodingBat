package warmup_2;

public class Array667 {

	public int array667(int[] nums) {
		  
		  int count = 0;
		  
		  for (int i = 0; i < nums.length-1; i++) {
		    if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7)) {
		      count++;
		    }
		  }
		  
		  return count;
		  
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		array667([6, 6, 2]) → 1	1	OK	
//		array667([6, 6, 2, 6]) → 1	1	OK	
//		array667([6, 7, 2, 6]) → 1	1	OK	
//		array667([6, 6, 2, 6, 7]) → 2	2	OK	
//		array667([1, 6, 3]) → 0	0	OK	
//		array667([6, 1]) → 0	0	OK	
//		array667([]) → 0	0	OK	
//		array667([3, 6, 7, 6]) → 1	1	OK	
//		array667([3, 6, 6, 7]) → 2	2	OK	
//		array667([6, 3, 6, 6]) → 1	1	OK	
//		array667([6, 7, 6, 6]) → 2	2	OK	
//		array667([1, 2, 3, 5, 6]) → 0	0	OK	
//		array667([1, 2, 3, 6, 6]) → 1	1	OK
		
	}

}
