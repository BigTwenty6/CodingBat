package array_1;


/* 
 * 
 * Expected	Run		
commonEnd([1, 2, 3], [7, 3]) → true	true	OK	
commonEnd([1, 2, 3], [7, 3, 2]) → false	false	OK	
commonEnd([1, 2, 3], [1, 3]) → true	true	OK	
commonEnd([1, 2, 3], [1]) → true	true	OK	
commonEnd([1, 2, 3], [2]) → false	false	OK

 */
public class CommonEnd {
	
	public boolean commonEnd(int[] a, int[] b) {
		  
		  return (a[0] == b[0] || a[a.length-1] == b[b.length-1]);
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		commonEnd([1, 2, 3], [7, 3]) → true	true	OK	
//		commonEnd([1, 2, 3], [7, 3, 2]) → false	false	OK	
//		commonEnd([1, 2, 3], [1, 3]) → true	true	OK	
//		commonEnd([1, 2, 3], [1]) → true	true	OK	
//		commonEnd([1, 2, 3], [2]) → false	false	OK	
		
	}
}
