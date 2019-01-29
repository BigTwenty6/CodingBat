package string1;

public class LastTwo {

	public String lastTwo(String str) {

		if (str.length() < 2) {
			return str;
		}

		return str.substring(0, str.length() - 2) + 
				str.charAt(str.length() - 1) + 
				str.charAt(str.length() - 2);
		

	}

	public static void main(String[] args) {

//		Expected	Run		
//		lastTwo("coding") → "codign"	"codign"	OK	
//		lastTwo("cat") → "cta"	"cta"	OK	
//		lastTwo("ab") → "ba"	"ba"	OK	
//		lastTwo("a") → "a"	"a"	OK	
//		lastTwo("") → ""	""	OK
	}
}
