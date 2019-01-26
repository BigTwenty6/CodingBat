package warmup_1;

/*
 * 
 * Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"

 */

public class NotString {

	public String notString(String str) {

		  if (str.length() < 3) {
		    return "not " + str;
		  }
		  
		  String not = str.substring(0,3);
		  
		  if (!not.equals("not")) {
		    return "not "+str;
		  }
		  
		  return str;
		  
		}
//
//	
//	Expected	Run		
//	notString("candy") → "not candy"	"not candy"	OK	
//	notString("x") → "not x"	"not x"	OK	
//	notString("not bad") → "not bad"	"not bad"	OK	
//	notString("bad") → "not bad"	"not bad"	OK	
//	notString("not") → "not"	"not"	OK	
//	notString("is not") → "not is not"	"not is not"	OK	
//	notString("no") → "not no"	"not no"	OK	

}
