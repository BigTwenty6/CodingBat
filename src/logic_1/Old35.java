package logic_1;

/*
 * Return true if the given non-negative number is a multiple of 3 or 5, but not both. 

old35(3) → true
old35(10) → true
old35(15) → false
 */

public class Old35 {

	public boolean old35(int n) {

		int mod3 = n % 3;
		int mod5 = n % 5;

		if ((mod3 == 0 || mod5 == 0) && (mod3 != mod5)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

//			Expected	Run		
//			old35(3) → true	true	OK	
//			old35(10) → true	true	OK	
//			old35(15) → false	false	OK	
//			old35(5) → true	true	OK	
//			old35(9) → true	true	OK	
//			old35(8) → false	false	OK	
//			old35(7) → false	false	OK	
//			old35(6) → true	true	OK	
//			old35(17) → false	false	OK	
//			old35(18) → true	true	OK	
//			old35(29) → false	false	OK	
//			old35(20) → true	true	OK	
//			old35(21) → true	true	OK	
//			old35(22) → false	false	OK	
//			old35(45) → false	false	OK	
//			old35(99) → true	true	OK	

	}

}
