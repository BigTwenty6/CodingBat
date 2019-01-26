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

		for (int i = 0; i < str.length()-1; i++) {

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
	}

}
