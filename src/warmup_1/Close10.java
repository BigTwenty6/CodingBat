package warmup_1;

/*
 * 
Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. 
Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 * 
 */

public class Close10 {

	public int close10(int a, int b) {

		int nA = Math.abs(10 - a);
		int nB = Math.abs(10 - b);

		if (nA == nB) {
			return 0;
		}

		if (nA < nB) {
			return a;
		} else {
			return b;
		}
		
		
	}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		close10(8, 13) → 8	8	OK	
//		close10(13, 8) → 8	8	OK	
//		close10(13, 7) → 0	0	OK	
//		close10(7, 13) → 0	0	OK	
//		close10(9, 13) → 9	9	OK	
//		close10(13, 8) → 8	8	OK	
//		close10(10, 12) → 10	10	OK	
//		close10(11, 10) → 10	10	OK	
//		close10(5, 21) → 5	5	OK	
//		close10(0, 20) → 0	0	OK	
//		close10(10, 10) → 0	0	OK
	}
	
	

}
