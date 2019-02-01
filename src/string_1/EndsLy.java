package string_1;

public class EndsLy {
	
	public boolean endsLy(String str) {
		  
		  if (str.length() < 2) {
		    return false;
		    
		  }
		  
		  if (str.substring(str.length()-2, str.length()).equals("ly")) {
		    return true;
		  }
		  
		  return false;
		}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		endsLy("oddly") → true	true	OK	
//		endsLy("y") → false	false	OK	
//		endsLy("oddy") → false	false	OK	
//		endsLy("oddl") → false	false	OK	
//		endsLy("olydd") → false	false	OK	
//		endsLy("ly") → true	true	OK	
//		endsLy("") → false	false	OK	
//		endsLy("falsey") → false	false	OK	
//		endsLy("evenly") → true	true	OK	
		
	}

}
