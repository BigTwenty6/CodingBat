package warmup_2;

/*
 * 
 * 
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3

 */
public class ArrayCount9 {
	
	public int arrayCount9(int[] nums) {
		  
		  int count = 0;
		  
		  for (int num: nums) {
		    if (num == 9){
		      count++;
		    }
		  }
		  
		  return count;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		arrayCount9([1, 2, 9]) → 1	1	OK	
//		arrayCount9([1, 9, 9]) → 2	2	OK	
//		arrayCount9([1, 9, 9, 3, 9]) → 3	3	OK	
//		arrayCount9([1, 2, 3]) → 0	0	OK	
//		arrayCount9([]) → 0	0	OK	
//		arrayCount9([4, 2, 4, 3, 1]) → 0	0	OK	
//		arrayCount9([9, 2, 4, 3, 1]) → 1	1	OK	
	}


}
