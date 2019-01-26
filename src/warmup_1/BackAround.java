package warmup_1;

/*
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */

public class BackAround {

	public String backAround(String str) {

		String temp = str.substring(str.length() - 1);

		return temp + str + temp;
	}

//	Expected	Run		
//	backAround("cat") → "tcatt"	"tcatt"	OK	
//	backAround("Hello") → "oHelloo"	"oHelloo"	OK	
//	backAround("a") → "aaa"	"aaa"	OK	
//	backAround("abc") → "cabcc"	"cabcc"	OK	
//	backAround("read") → "dreadd"	"dreadd"	OK	
//	backAround("boo") → "obooo"	"obooo"	OK
	
}
