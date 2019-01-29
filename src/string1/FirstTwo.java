package string1;

public class FirstTwo {

	public String firstTwo(String str) {

		if (str.length() < 2) {
			return str;
		} else {

			return str.substring(0, 2);
		}

	}

	public static void main(String[] args) {

//		Expected	Run		
//		firstTwo("Hello") → "He"	"He"	OK	
//		firstTwo("abcdefg") → "ab"	"ab"	OK	
//		firstTwo("ab") → "ab"	"ab"	OK	
//		firstTwo("a") → "a"	"a"	OK	
//		firstTwo("") → ""	""	OK	
//		firstTwo("Kitten") → "Ki"	"Ki"	OK	
//		firstTwo("hi") → "hi"	"hi"	OK	
//		firstTwo("hiya") → "hi"	"hi"	OK
	}
}
