package warmup_1;

/*
 * 
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */

public class No35 {

	public boolean or35(int n) {
		  
		  if (n%5 == 0 || n%3 == 0)
		  return true;
		  
		  return false;
		}

//	Expected	Run		
//	or35(3) → true	true	OK	
//	or35(10) → true	true	OK	
//	or35(8) → false	false	OK	
//	or35(15) → true	true	OK	
//	or35(5) → true	true	OK	
//	or35(9) → true	true	OK	
//	or35(4) → false	false	OK	
//	or35(7) → false	false	OK	
//	or35(6) → true	true	OK	
//	or35(17) → false	false	OK	
//	or35(18) → true	true	OK	
//	or35(29) → false	false	OK	
//	or35(20) → true	true	OK	
//	or35(21) → true	true	OK	
//	or35(22) → false	false	OK	
//	or35(45) → true	true	OK	
//	or35(99) → true	true	OK	
//	or35(100) → true	true	OK	
//	or35(101) → false	false	OK	
//	or35(121) → false	false	OK	
//	or35(122) → false	false	OK	
//	or35(123) → true	true	OK
}
