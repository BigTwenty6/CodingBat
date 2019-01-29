package warmup_2;

public class StringYak {

	public static String stringYak(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {

			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
					i += 2;
				} else {
					result = result + str.charAt(i);
				}
			}
		

		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(stringYak("yak123ya"));

//		Expected	Run		
//		stringYak("yakpak") → "pak"	"pak"	OK	
//		stringYak("pakyak") → "pak"	"pak"	OK	
//		stringYak("yak123ya") → "123ya"	"123ya"	OK	
//		stringYak("yak") → ""	""	OK	
//		stringYak("yakxxxyak") → "xxx"	"xxx"	OK	
//		stringYak("HiyakHi") → "HiHi"	"HiHi"	OK	
//		stringYak("xxxyakyyyakzzz") → "xxxyyzzz"	"xxxyyzzz"	OK
	}
}