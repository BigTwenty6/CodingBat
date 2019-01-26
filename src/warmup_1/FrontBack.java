package warmup_1;

/*
 * Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 */

public class FrontBack {

		public static String frontBack(String str) {
			  
			  if (str.length() <=1) {
			    return str;
			  }
			  
			  String fLetter = str.substring(0,1);
			  String lLetter = str.substring(str.length()-1);
			  
			  return lLetter + str.substring(1,str.length()-1) + fLetter;
			}

		
	public static void main(String[] args) {
		
		System.out.println(FrontBack.frontBack("alphabet"));
		System.out.println(FrontBack.frontBack("test"));
		System.out.println(FrontBack.frontBack("a"));
		System.out.println(FrontBack.frontBack(""));
		
	}
}
