package string_1;

public class Right2 {

	public static String right2(String str) {

		String right = str.substring(str.length() - 2);

		return right + str.substring(0, str.length() - 2);

	}

	public static void main(String[] args) {

		System.out.println(right2("hello"));
		
//		Expected	Run		
//		right2("Hello") → "loHel"	"loHel"	OK	
//		right2("java") → "vaja"	"vaja"	OK	
//		right2("Hi") → "Hi"	"Hi"	OK	
//		right2("code") → "deco"	"deco"	OK	
//		right2("cat") → "atc"	"atc"	OK	
//		right2("12345") → "45123"	"45123"	OK

	}
}
