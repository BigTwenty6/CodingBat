package array_1;

/*
 * 
 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class PlusTwo {

	public int[] plusTwo(int[] a, int[] b) {
		  
		  int [] sum = {a[0], a[1], b[0], b[1]};
		  
		  return sum;
		  
		}

	public static void main(String[] args) {
//		Expected	Run		
//		plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]	[1, 2, 3, 4]	OK	
//		plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]	[4, 4, 2, 2]	OK	
//		plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]	[9, 2, 3, 4]	OK	
		
	}
}
