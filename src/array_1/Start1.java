package array_1;

/*
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1

 */
public class Start1 {

	public int start1(int[] a, int[] b) {
		  
		  int count = 0;
		  
		  if (a.length > 0 && a[0] == 1) {
		    count++;
		  }
		  
		  if (b.length > 0 && b[0] == 1) {
		    count++;
		  }
		  
		  return count;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		start1([1, 2, 3], [1, 3]) → 2	2	OK	
//		start1([7, 2, 3], [1]) → 1	1	OK	
//		start1([1, 2], []) → 1	1	OK	
//		start1([], [1, 2]) → 1	1	OK	
//		start1([7], []) → 0	0	OK	
//		start1([7], [1]) → 1	1	OK	
//		start1([1], [1]) → 2	2	OK	
//		start1([7], [8]) → 0	0	OK	
//		start1([], []) → 0	0	OK	
//		start1([1, 3], [1]) → 2	2	OK	
		
	}
}
