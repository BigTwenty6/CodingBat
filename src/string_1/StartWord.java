package string_1;

/*
 * Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, 
 * except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
 *  So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.


startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
 */

public class StartWord {

	public String startWord(String str, String word) {
		  
		  String result = "";
		  
		  int idx = word.length();
		  
		  if (str.length() < idx) {
		    return "";
		  }
		  
		  if (str.substring(1, idx).equals(word.substring(1, idx))) {
		    return str.substring(0,1)+word.substring(1);
		  }
		  
		  return "";
		  
		}

	public static void main(String[] args) {
		
		
//		Expected	Run		
//		startWord("hippo", "hi") → "hi"	"hi"	OK	
//		startWord("hippo", "xip") → "hip"	"hip"	OK	
//		startWord("hippo", "i") → "h"	"h"	OK	
//		startWord("hippo", "ix") → ""	""	OK	
//		startWord("h", "ix") → ""	""	OK	
//		startWord("", "i") → ""	""	OK	
//		startWord("hip", "zi") → "hi"	"hi"	OK	
//		startWord("hip", "zip") → "hip"	"hip"	OK	
//		startWord("hip", "zig") → ""	""	OK	
//		startWord("h", "z") → "h"	"h"	OK	
//		startWord("hippo", "xippo") → "hippo"	"hippo"	OK	
//		startWord("hippo", "xyz") → ""	""	OK	
//		startWord("hippo", "hip") → "hip"	"hip"	OK	
//		startWord("kitten", "cit") → "kit"	"kit"	OK	
//		startWord("kit", "cit") → "kit"	"kit"	OK	
	}

}
