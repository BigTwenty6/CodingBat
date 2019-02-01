package string_1;

public class SeeColor {
	
	public String seeColor(String str) {
		  
		  if ( str.length() >= 3 && str.substring(0,3).equals("red")) {
		      return "red";
		      }
		  

		  if ( str.length() >= 4 && str.substring(0,4).equals("blue")) {
		      return "blue";
		      }
		  
		  return "";
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		seeColor("redxx") → "red"	"red"	OK	
//		seeColor("xxred") → ""	""	OK	
//		seeColor("blueTimes") → "blue"	"blue"	OK	
//		seeColor("NoColor") → ""	""	OK	
//		seeColor("red") → "red"	"red"	OK	
//		seeColor("re") → ""	""	OK	
//		seeColor("blu") → ""	""	OK	
//		seeColor("blue") → "blue"	"blue"	OK	
//		seeColor("a") → ""	""	OK	
//		seeColor("") → ""	""	OK	
//		seeColor("xyzred") → ""	""	OK
		
	}

}
