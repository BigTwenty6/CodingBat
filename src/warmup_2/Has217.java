package warmup_2;

public class Has217 {

	public static boolean has271(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {

			int second = nums[i] + 5;
			int third = nums[i] - 1;

			if ((i + 2 < nums.length) && (nums[i + 1] == second)) {

				if ((Math.abs(nums[i + 2] - third)) <= 2) {

					return true;
				}
			}
		}
		
		return false;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 7, 1 };

		System.out.println(has271(arr));

//		Expected	Run		
//		has271([1, 2, 7, 1]) → true	false	X	
//		has271([1, 2, 8, 1]) → false	false	OK	
//		has271([2, 7, 1]) → true	false	X	
//		has271([3, 8, 2]) → true	false	X	
//		has271([2, 7, 3]) → true	false	X	
//		has271([2, 7, 4]) → false	false	OK	
//		has271([2, 7, -1]) → true	false	X	
//		has271([2, 7, -2]) → false	false	OK	
//		has271([4, 5, 3, 8, 0]) → true	false	X	
//		has271([2, 7, 5, 10, 4]) → true	false	X	
//		has271([2, 7, -2, 4, 9, 3]) → true	false	X	
//		has271([2, 7, 5, 10, 1]) → false	false	OK	
//		has271([2, 7, -2, 4, 10, 2]) → false	false	OK	
//		has271([1, 1, 4, 9, 0]) → false	false	OK	
//		has271([1, 1, 4, 9, 4, 9, 2]) → true	false	X

	}
}
