package string1;

public class ConCat {

	public static String conCat(String a, String b) {

		if (a.length() == 0) {
			return b;
		} else if (b.length() == 0) {
			return a;
		}

		if (

		a.charAt(a.length() - 1) != b.charAt(0)) {

			return a + b;

		} else {

			return a + b.substring(1);
		}

	}

	public static void main(String[] args) {
		
		System.out.println(conCat("abc", "cat"));
//		Expected	Run		
//		conCat("abc", "cat") → "abcat"	"abcat"	OK	
//		conCat("dog", "cat") → "dogcat"	"dogcat"	OK	
//		conCat("abc", "") → "abc"	"abc"	OK	
//		conCat("", "cat") → "cat"	"cat"	OK	
//		conCat("pig", "g") → "pig"	"pig"	OK	
//		conCat("pig", "doggy") → "pigdoggy"	"pigdoggy"	OK

	}

}
