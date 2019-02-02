package logic_1;

public class In1To10 {

	public boolean in1To10(int n, boolean outsideMode) {
		  
		  if (!outsideMode) {
		    if (n >= 1 && n <= 10) {
		      return true;
		    }
		  }
		  
		  if (outsideMode && (n <= 1 || n >= 10)) {
		      return true;
		    }
		  
		  return false;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		in1To10(5, false) → true	true	OK	
//		in1To10(11, false) → false	false	OK	
//		in1To10(11, true) → true	true	OK	
//		in1To10(10, false) → true	true	OK	
//		in1To10(10, true) → true	true	OK	
//		in1To10(9, false) → true	true	OK	
//		in1To10(9, true) → false	false	OK	
//		in1To10(1, false) → true	true	OK	
//		in1To10(1, true) → true	true	OK	
//		in1To10(0, false) → false	false	OK	
//		in1To10(0, true) → true	true	OK	
//		in1To10(-1, false) → false	false	OK	
//		in1To10(-1, true) → true	true	OK	
//		in1To10(99, false) → false	false	OK	
//		in1To10(-99, true) → true	true	OK
		
	}
}
