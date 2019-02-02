package array_1;

import java.util.Arrays;

/*
 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
 * If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */

public class Front11 {

	public int[] front11(int[] a, int[] b) {
		  
		  int [] result = new int [0];
		  int idx = 0;
		  int length = 1;
		  
		  if (a.length != 0) {
		    result = Arrays.copyOf(result,length);
		    
		    result[idx] = a[0];
		    length++;
		    idx++;
		  }
		  
		  if (b.length != 0) {
		    result = Arrays.copyOf(result,length);
		    result[idx] = b[0];
		  
		  }
		  
		  return result;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		front11([1, 2, 3], [7, 9, 8]) → [1, 7]	[1, 7]	OK	
//		front11([1], [2]) → [1, 2]	[1, 2]	OK	
//		front11([1, 7], []) → [1]	[1]	OK	
//		front11([], [2, 8]) → [2]	[2]	OK	
//		front11([], []) → []	[]	OK	
//		front11([3], [1, 4, 1, 9]) → [3, 1]	[3, 1]	OK	
//		front11([1, 4, 1, 9], []) → [1]	[1]	OK	
		
	}
}
