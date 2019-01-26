package warmup_2;

/*
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */

public class DoubleX {

	boolean doubleX(String str) {

		for (int i = 0; i < str.length()-1; i++) {
			
			if (str.charAt(i) == 'x') {
				
				if (str.charAt(i+1) == 'x') {
					return true;
				} else {
					return false;
				}
			}
		}
		
		return false;
	}

	public static void main(String[] args) {

//		Expected	Run		
//		doubleX("axxbb") → true	true	OK	
//		doubleX("axaxax") → false	false	OK	
//		doubleX("xxxxx") → true	true	OK	
//		doubleX("xaxxx") → false	false	OK	
//		doubleX("aaaax") → false	false	OK	
//		doubleX("") → false	false	OK	
//		doubleX("abc") → false	false	OK	
//		doubleX("x") → false	false	OK	
//		doubleX("xx") → true	true	OK	
//		doubleX("xax") → false	false	OK	
//		doubleX("xaxx") → false	false	OK
	}
}
