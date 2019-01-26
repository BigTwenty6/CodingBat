package warmup_1;

/*
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. 
 * Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"

 */

public class DelDel {

	public String delDel(String str) {
		  
		  if (str.length() < 4) {
		    return str;
		  }
		  
		  if (str.substring(1,4).equals("del")){
		    return str.substring(0,1)+str.substring(4);
		  }
		  
		  return str;
		}

//	Expected	Run		
//	delDel("adelbc") → "abc"	"abc"	OK	
//	delDel("adelHello") → "aHello"	"aHello"	OK	
//	delDel("adedbc") → "adedbc"	"adedbc"	OK	
//	delDel("abcdel") → "abcdel"	"abcdel"	OK	
//	delDel("add") → "add"	"add"	OK	
//	delDel("ad") → "ad"	"ad"	OK	
//	delDel("a") → "a"	"a"	OK	
//	delDel("") → ""	""	OK	
//	delDel("del") → "del"	"del"	OK	
//	delDel("adel") → "a"	"a"	OK	
//	delDel("aadelbb") → "aadelbb"	"aadelbb"	OK	

}
