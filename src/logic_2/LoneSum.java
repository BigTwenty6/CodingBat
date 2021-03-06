package logic_2;

/*
 * 
Given 3 int values, a b c, return their sum. 
However, if one of the values is the same as another of the values, it does not count towards the sum.


loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
 */
public class LoneSum {

	public int loneSum(int a, int b, int c) {
		  
		  int sum = 0;
		  
		  if (a != b && a != c) {
		      sum += a;
		    
		  }
		  
		  if (b != c && b != a){
		    sum += b;
		  }
		  
		  if (c != a && c != b) {
		    sum += c;
		  }
		  
		  return  sum;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		loneSum(1, 2, 3) → 6	6	OK	
//		loneSum(3, 2, 3) → 2	2	OK	
//		loneSum(3, 3, 3) → 0	0	OK	
//		loneSum(9, 2, 2) → 9	9	OK	
//		loneSum(2, 2, 9) → 9	9	OK	
//		loneSum(2, 9, 2) → 9	9	OK	
//		loneSum(2, 9, 3) → 14	14	OK	
//		loneSum(4, 2, 3) → 9	9	OK	
//		loneSum(1, 3, 1) → 3	3	OK	
	}
}
