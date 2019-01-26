package warmup_1;

public class Max1020 {

	public int max1020(int a, int b) {

		int maxA = 0;
		int maxB = 0;

		if (a >= 10 && a <= 20) {
			maxA = a;
		}

		if (b >= 10 && b <= 20) {
			maxB = b;
		}

		if (maxA > maxB) {
			return maxA;
		} else {
			return maxB;
		}
	}

	public static void main(String[] args) {

//		Expected	Run		
//		max1020(11, 19) → 19	19	OK	
//		max1020(19, 11) → 19	19	OK	
//		max1020(11, 9) → 11	11	OK	
//		max1020(9, 21) → 0	0	OK	
//		max1020(10, 21) → 10	10	OK	
//		max1020(21, 10) → 10	10	OK	
//		max1020(9, 11) → 11	11	OK	
//		max1020(23, 10) → 10	10	OK	
//		max1020(20, 10) → 20	20	OK	
//		max1020(7, 20) → 20	20	OK	
//		max1020(17, 16) → 17	17	OK
	}
}
