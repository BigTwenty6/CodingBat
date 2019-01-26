package warmup_1;

/*
 * 
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

 */

public class In1020 {	

	public static boolean in1020(int a, int b) {
			  
			  if ( (a >= 10 && a <= 20) || (b >= 10 && b <= 20) ) {
			    return true;
			  }
			  
			  return false;
			}
	
	public static void main(String[] args) {
		
		System.out.println(in1020(8, 99));
		
//		Expected	Run		
//		in1020(12, 99) → true	true	OK	
//		in1020(21, 12) → true	true	OK	
//		in1020(8, 99) → false	false	OK	
//		in1020(99, 10) → true	true	OK	
//		in1020(20, 20) → true	true	OK	
//		in1020(21, 21) → false	false	OK	
//		in1020(9, 9) → false	false	OK
	}
}
