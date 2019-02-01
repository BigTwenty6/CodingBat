package string_1;

public class FrontAgain {

	public boolean frontAgain(String str) {
		  
		  if (str.length() < 2){
		    return false;
		  }
		  
		  String start = str.substring (0, 2);
		  String end = str.substring(str.length()-2); 
		  
		  if (start.equals(end)){
		    return true;
		  }
		  
		  return false;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		frontAgain("edited") → true	true	OK	
//		frontAgain("edit") → false	false	OK	
//		frontAgain("ed") → true	true	OK	
//		frontAgain("jj") → true	true	OK	
//		frontAgain("jjj") → true	true	OK	
//		frontAgain("jjjj") → true	true	OK	
//		frontAgain("jjjk") → false	false	OK	
//		frontAgain("x") → false	false	OK	
//		frontAgain("") → false	false	OK	
//		frontAgain("java") → false	false	OK	
//		frontAgain("javaja") → true	true	OK
	}
}
