package array_1;

/*
 * 
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. 
Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]
 */

public class BiggerTwo {

	public int[] biggerTwo(int[] a, int[] b) {
		  
		  int sumA = a[0] + a[1];
		  
		  int sumB = b[0] + b[1];
		  
		  if (sumA < sumB) {
		    return b;
		  } else if (sumB < sumA){
		    return a;
		  } else {
		    return a;
		  }
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		biggerTwo([1, 2], [3, 4]) → [3, 4]	[3, 4]	OK	
//		biggerTwo([3, 4], [1, 2]) → [3, 4]	[3, 4]	OK	
//		biggerTwo([1, 1], [1, 2]) → [1, 2]	[1, 2]	OK	
//		biggerTwo([2, 1], [1, 1]) → [2, 1]	[2, 1]	OK	
//		biggerTwo([2, 2], [1, 3]) → [2, 2]	[2, 2]	OK	
//		biggerTwo([1, 3], [2, 2]) → [1, 3]	[1, 3]	OK	
//		biggerTwo([6, 7], [3, 1]) → [6, 7]	[6, 7]	OK
		
	}
}
