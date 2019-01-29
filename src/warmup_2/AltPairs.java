package warmup_2;

public class AltPairs {
	
	public String altPairs(String str) {
		  
		  String result = "";
		  int a = 2;
		  int b = 3;

		  
		  for (int i = 0; i < str.length(); i++) {
		    
		    if (i == a) {
		      a += 4;
		      continue;
		    }
		    
		    if (i == b) {
		      b += 4;
		      continue;
		    }
		    
		    result += str.charAt(i);
		    
		  }
		  
		  return result;
		  
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		altPairs("kitten") → "kien"	"kien"	OK	
//		altPairs("Chocolate") → "Chole"	"Chole"	OK	
//		altPairs("CodingHorror") → "Congrr"	"Congrr"	OK	
//		altPairs("yak") → "ya"	"ya"	OK	
//		altPairs("ya") → "ya"	"ya"	OK	
//		altPairs("y") → "y"	"y"	OK	
//		altPairs("") → ""	""	OK	
//		altPairs("ThisThatTheOther") → "ThThThth"	"ThThThth"	OK
	}
}
