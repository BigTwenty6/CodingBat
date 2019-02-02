package array_1;

/*
 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
 * the elements from a followed by the elements from b. The arrays may be any length, including 0, 
 * but there will be 2 or more elements available between the 2 arrays.


make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
public class Make2 {

	public int[] make2(int[] a, int[] b) {

		int[] result = new int[2];

		if (a.length == 2 || a.length > 2) {
			result[0] = a[0];
			result[1] = a[1];
		}

		if (a.length == 1) {
			result[0] = a[0];
			result[1] = b[0];
		}

		if (a.length == 0) {
			result[0] = b[0];
			result[1] = b[1];
		}

		return result;

	}

	public static void main(String[] args) {

//		Expected	Run		
//		make2([4, 5], [1, 2, 3]) → [4, 5]	[4, 5]	OK	
//		make2([4], [1, 2, 3]) → [4, 1]	[4, 1]	OK	
//		make2([], [1, 2]) → [1, 2]	[1, 2]	OK	
//		make2([1, 2], []) → [1, 2]	[1, 2]	OK	
//		make2([3], [1, 2, 3]) → [3, 1]	[3, 1]	OK	
//		make2([3], [1]) → [3, 1]	[3, 1]	OK	
//		make2([3, 1, 4], []) → [3, 1]	[3, 1]	OK	
//		make2([1], [1]) → [1, 1]	[1, 1]	OK	
//		make2([1, 2, 3], [7, 8]) → [1, 2]	[1, 2]	OK	
//		make2([7, 8], [1, 2, 3]) → [7, 8]	[7, 8]	OK	
//		make2([7], [1, 2, 3]) → [7, 1]	[7, 1]	OK	
//		make2([5, 4], [2, 3, 7]) → [5, 4]	[5, 4]	OK	
	}

}
