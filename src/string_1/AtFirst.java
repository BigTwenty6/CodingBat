package string_1;

public class AtFirst {

	public static String atFirst(String str) {

		String result = "";

		int shortL = str.length() - 2;

		if (shortL < 0) {

			result = str;

			while (result.length() < 2) {

				result += "@";
			}

			return result;
		}

		return str.substring(0, 2);

	}

	public static void main(String[] args) {

		System.out.println(atFirst("h"));
		
//		Expected	Run		
//		atFirst("hello") → "he"	"he"	OK	
//		atFirst("hi") → "hi"	"hi"	OK	
//		atFirst("h") → "h@"	"h@"	OK	
//		atFirst("") → "@@"	"@@"	OK	
//		atFirst("kitten") → "ki"	"ki"	OK	
//		atFirst("java") → "ja"	"ja"	OK	
//		atFirst("j") → "j@"	"j@"	OK
	}

}
