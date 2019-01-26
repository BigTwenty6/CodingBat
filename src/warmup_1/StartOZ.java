package warmup_1;


/*
 * 
 * Given a string, return a string made of the first 2 chars (if present), 
 * however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
 * 
 */

public class StartOZ {

	public String startOz(String str) {
		  
		  
		  String word = "";
		  

		  
		  if (str.length() >= 1 && str.substring(0,1).equals("o")) {
		    word = "o";
		  }
		  
		  if (str.length() >= 2 && str.substring(1,2).equals("z")) {
		    word += "z";
		  }
		  
		  return word;
		  
		}
}

//	Expected	Run		
//	startOz("ozymandias") → "oz"	"oz"	OK	
//	startOz("bzoo") → "z"	"z"	OK	
//	startOz("oxx") → "o"	"o"	OK	
//	startOz("oz") → "oz"	"oz"	OK	
//	startOz("ounce") → "o"	"o"	OK	
//	startOz("o") → "o"	"o"	OK	
//	startOz("abc") → ""	""	OK	
//	startOz("") → ""	""	OK	
//	startOz("zoo") → ""	""	OK	
//	startOz("aztec") → "z"	"z"	OK	
//	startOz("zzzz") → "z"	"z"	OK	
//	startOz("oznic") → "oz"	"oz"	OK
