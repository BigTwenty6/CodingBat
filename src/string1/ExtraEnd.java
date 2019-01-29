package string1;

public class ExtraEnd {
	
	public String extraEnd(String str) {
		  
		  String last2 = str.substring(str.length()-2);
		  
		  return last2+last2+last2;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		extraEnd("Hello") → "lololo"	"lololo"	OK	
//		extraEnd("ab") → "ababab"	"ababab"	OK	
//		extraEnd("Hi") → "HiHiHi"	"HiHiHi"	OK	
//		extraEnd("Candy") → "dydydy"	"dydydy"	OK	
//		extraEnd("Code") → "dedede"	"dedede"	OK	
		
	}

}
