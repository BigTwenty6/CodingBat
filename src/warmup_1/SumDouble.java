package warmup_1;

/*
 * Given two int values, return their sum. 
 * Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */

public class SumDouble {

	public static int sumDbl(int a, int b) {

		if (a == b) {
			return (a + b) * 2;
		} else {
			return a + b;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(SumDouble.sumDbl(1, 2));
		System.out.println(SumDouble.sumDbl(3, 2));
		System.out.println(SumDouble.sumDbl(2, 2));
		System.out.println(SumDouble.sumDbl(-1, 0));
		System.out.println(SumDouble.sumDbl(3, 3));
		System.out.println(SumDouble.sumDbl(0, 0));
		
		
	}
}
