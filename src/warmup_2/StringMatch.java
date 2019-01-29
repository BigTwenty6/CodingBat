package warmup_2;

/*
 * Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 * 
 */

public class StringMatch {

	public static int stringMatch(String a, String b) {

		int lpSize = Math.min(a.length(), b.length());
		int count = 0;
		

		for (int i = 0; i < lpSize-1; i++) {
			
			String tempA = a.substring(i, i+2);
			String tempB = b.substring(i, i+2);
			
			if (tempA.equals(tempB)) {
				count++;
				}
		}

		return count;

	}

	public static void main(String[] args) {

		System.out.println(stringMatch("xxcaazz", "xxbaaz"));
		
//		Expected	Run		
//		stringMatch("xxcaazz", "xxbaaz") → 3	3	OK	
//		stringMatch("abc", "abc") → 2	2	OK	
//		stringMatch("abc", "axc") → 0	0	OK	
//		stringMatch("hello", "he") → 1	1	OK	
//		stringMatch("he", "hello") → 1	1	OK	
//		stringMatch("h", "hello") → 0	0	OK	
//		stringMatch("", "hello") → 0	0	OK	
//		stringMatch("aabbccdd", "abbbxxd") → 1	1	OK	
//		stringMatch("aaxxaaxx", "iaxxai") → 3	3	OK	
//		stringMatch("iaxxai", "aaxxaaxx") → 3	3	OK
	}

}
