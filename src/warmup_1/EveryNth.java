package warmup_1;

/*
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. 
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 * 
 */

public class EveryNth {

	public String everyNth(String str, int n) {

		String newS = "";
		int idx = n;

		for (int i = 0; i < str.length(); i += idx) {

			newS += str.charAt(i);
		}

		return newS;
	}
	
	public static void main(String[] args) {
	
//		Expected	Run		
//		everyNth("Miracle", 2) → "Mrce"	"Mrce"	OK	
//		everyNth("abcdefg", 2) → "aceg"	"aceg"	OK	
//		everyNth("abcdefg", 3) → "adg"	"adg"	OK	
//		everyNth("Chocolate", 3) → "Cca"	"Cca"	OK	
//		everyNth("Chocolates", 3) → "Ccas"	"Ccas"	OK	
//		everyNth("Chocolates", 4) → "Coe"	"Coe"	OK	
//		everyNth("Chocolates", 100) → "C"	"C"	OK	
	}

}
