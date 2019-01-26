package warmup_1;

/*
 * Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */

public class startHi {

	public boolean startHi(String str) {
		  
		  if (str.length() < 2){
		    return false;
		  }
		  
		  if (str.substring(0,2).equals("hi")){
		    return true;
		  }
		  
		  return false;
		}

//	Expected	Run		
//	startHi("hi there") → true	true	OK	
//	startHi("hi") → true	true	OK	
//	startHi("hello hi") → false	false	OK	
//	startHi("he") → false	false	OK	
//	startHi("h") → false	false	OK	
//	startHi("") → false	false	OK	
//	startHi("ho hi") → false	false	OK	
//	startHi("hi ho") → true	true	OK	

	
}
