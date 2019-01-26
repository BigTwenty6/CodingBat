package warmup_2;

/*
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 * 
 *
 */

public class CountXX {

	public static int countXX(String str) {

		int count = 0;

		String xx = "";

		for (int i = 0; i < str.length() - 1; i++) {

			xx = str.substring(i, (i + 2));

			if (xx.equals("xx")) {
				count++;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(CountXX.countXX("Hexxo thxxe"));
		System.out.println(CountXX.countXX("xxxx"));
		
//		Expected	Run		
//		countXX("abcxx") → 1	1	OK	
//		countXX("xxx") → 2	2	OK	
//		countXX("xxxx") → 3	3	OK	
//		countXX("abc") → 0	0	OK	
//		countXX("Hello there") → 0	0	OK	
//		countXX("Hexxo thxxe") → 2	2	OK	
//		countXX("") → 0	0	OK	
//		countXX("Kittens") → 0	0	OK	
//		countXX("Kittensxxx") → 2	2	OK	
	}

}
