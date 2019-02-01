package string_1;

public class WithoutEnd {

	public String withoutEnd(String str) {
		  
		  return str.substring(1, str.length()-1);
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		withoutEnd("Hello") → "ell"	"ell"	OK	
//		withoutEnd("java") → "av"	"av"	OK	
//		withoutEnd("coding") → "odin"	"odin"	OK	
//		withoutEnd("code") → "od"	"od"	OK	
//		withoutEnd("ab") → ""	""	OK	
//		withoutEnd("Chocolate!") → "hocolate"	"hocolate"	OK	
//		withoutEnd("kitten") → "itte"	"itte"	OK	
//		withoutEnd("woohoo") → "ooho"	"ooho"	OK	
		
	}
}
