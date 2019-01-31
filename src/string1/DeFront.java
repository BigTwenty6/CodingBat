package string1;

public class DeFront {

	public static String deFront(String str) {

		String result = "";

		if (str.charAt(0) == 'a') {
			result += "a";
		}

		if (str.charAt(1) == 'b') {
			result += "b";

		}

		return result + str.substring(2);
	}

	public static void main(String[] args) {

		System.out.println(deFront("abc"));
		
//		Expected	Run		
//		deFront("Hello") → "llo"	"llo"	OK	
//		deFront("java") → "va"	"va"	OK	
//		deFront("away") → "aay"	"aay"	OK	
//		deFront("axy") → "ay"	"ay"	OK	
//		deFront("abc") → "abc"	"abc"	OK	
//		deFront("xby") → "by"	"by"	OK	
//		deFront("ab") → "ab"	"ab"	OK	
//		deFront("ax") → "a"	"a"	OK	
//		deFront("axb") → "ab"	"ab"	OK	
//		deFront("aaa") → "aa"	"aa"	OK	
//		deFront("xbc") → "bc"	"bc"	OK	
//		deFront("bbb") → "bb"	"bb"	OK	
//		deFront("bazz") → "zz"	"zz"	OK	
//		deFront("ba") → ""	""	OK	
//		deFront("abxyz") → "abxyz"	"abxyz"	OK	
//		deFront("hi") → ""	""	OK	
//		deFront("his") → "s"	"s"	OK	
//		deFront("xz") → ""	""	OK	
//		deFront("zzz") → "z"	"z"	OK
	}
}
