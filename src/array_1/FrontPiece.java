package array_1;

public class FrontPiece {
		
		public int[] frontPiece(int[] nums) {
			  
			
			  if (nums.length == 0) {
			    int [] result = new int [0];
			    return result;
			  }
			  
			  if (nums.length < 2) {
			    int [] result = new int [nums.length];
			    result[0] = nums[0];
			    return result;
			  }
			  
			  int [] result = new int [2];

			  result [0] = nums[0];
			  result [1] = nums[1];
			  
			  return result;
			}

		public static void main(String[] args) {
			
		
			
//			Expected	Run		
//			frontPiece([1, 2, 3]) → [1, 2]	[1, 2]	OK	
//			frontPiece([1, 2]) → [1, 2]	[1, 2]	OK	
//			frontPiece([1]) → [1]	[1]	OK	
//			frontPiece([]) → []	[]	OK	
//			frontPiece([6, 5, 0]) → [6, 5]	[6, 5]	OK	
//			frontPiece([6, 5]) → [6, 5]	[6, 5]	OK	
//			frontPiece([3, 1, 4, 1, 5]) → [3, 1]	[3, 1]	OK	
//			frontPiece([6]) → [6]	[6]	OK
			
		}
}
