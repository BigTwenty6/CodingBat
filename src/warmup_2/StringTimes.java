package warmup_2;

public class StringTimes {

	public static String stringTimes(String str, int n) {

		  String copy = "";
//		  
//		  for (int i = 0; i < n; i++) {
//		  
//		    copy += str + "";
//
//		  }
//		  
//		  return str;
//		}

		while (n > 0) {
			copy += str;
			n--;
		}

		return copy;
	}

	public static void main(String[] args) {

		System.out.println(stringTimes("Hi", 3));

//		Expected	Run		
//		stringTimes("Hi", 2) → "HiHi"	"HiHi"	OK	
//		stringTimes("Hi", 3) → "HiHiHi"	"HiHiHi"	OK	
//		stringTimes("Hi", 1) → "Hi"	"Hi"	OK	
//		stringTimes("Hi", 0) → ""	""	OK	
//		stringTimes("Hi", 5) → "HiHiHiHiHi"	"HiHiHiHiHi"	OK	
//		stringTimes("Oh Boy!", 2) → "Oh Boy!Oh Boy!"	"Oh Boy!Oh Boy!"	OK	
//		stringTimes("x", 4) → "xxxx"	"xxxx"	OK	
//		stringTimes("", 4) → ""	""	OK	
//		stringTimes("code", 2) → "codecode"	"codecode"	OK	
//		stringTimes("code", 3) → "codecodecode"	"codecodecode"	OK
	}
}
