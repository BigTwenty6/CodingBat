package array_1;

/*
 * 
 * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

public class RotateLeft3 {
	
	public int[] rotateLeft3(int[] nums) {
		  
		  int [] rotated = {nums[1], nums[2], nums[0]};
		  
		  return rotated;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		rotateLeft3([1, 2, 3]) → [2, 3, 1]	[2, 3, 1]	OK	
//		rotateLeft3([5, 11, 9]) → [11, 9, 5]	[11, 9, 5]	OK	
//		rotateLeft3([7, 0, 0]) → [0, 0, 7]	[0, 0, 7]	OK	
//		rotateLeft3([1, 2, 1]) → [2, 1, 1]	[2, 1, 1]	OK	
//		rotateLeft3([0, 0, 1]) → [0, 1, 0]	[0, 1, 0]	OK	
		
	}
	


}
