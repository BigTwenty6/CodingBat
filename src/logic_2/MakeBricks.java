package logic_2;

/*
 * We want to make a row of bricks that is goal inches long. 
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
 * Return true if it is possible to make the goal by choosing from the given bricks. 
 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */

public class MakeBricks {

	public boolean makeBricks(int small, int big, int goal) {
		  
		  if ( (big*5) + small < goal) {
		    return false;
		  }
		  
		  int remaining = goal % 5; 
		  
		  if (small < remaining) {
		    return false;
		  }
		  
		  return true;
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		makeBricks(3, 1, 8) → true	true	OK	
//		makeBricks(3, 1, 9) → false	false	OK	
//		makeBricks(3, 2, 10) → true	true	OK	
//		makeBricks(3, 2, 8) → true	true	OK	
//		makeBricks(3, 2, 9) → false	false	OK	
//		makeBricks(6, 1, 11) → true	true	OK	
//		makeBricks(6, 0, 11) → false	false	OK	
//		makeBricks(1, 4, 11) → true	true	OK	
//		makeBricks(0, 3, 10) → true	true	OK	
//		makeBricks(1, 4, 12) → false	false	OK	
//		makeBricks(3, 1, 7) → true	true	OK	
//		makeBricks(1, 1, 7) → false	false	OK	
//		makeBricks(2, 1, 7) → true	true	OK	
//		makeBricks(7, 1, 11) → true	true	OK	
//		makeBricks(7, 1, 8) → true	true	OK	
//		makeBricks(7, 1, 13) → false	false	OK	
//		makeBricks(43, 1, 46) → true	true	OK	
//		makeBricks(40, 1, 46) → false	false	OK	
//		makeBricks(40, 2, 47) → true	true	OK	
//		makeBricks(40, 2, 50) → true	true	OK	
//		makeBricks(40, 2, 52) → false	false	OK	
//		makeBricks(22, 2, 33) → false	false	OK	
//		makeBricks(0, 2, 10) → true	true	OK	
//		makeBricks(1000000, 1000, 1000100) → true	true	OK	
//		makeBricks(2, 1000000, 100003) → false	false	OK	
//		makeBricks(20, 0, 19) → true	true	OK	
//		makeBricks(20, 0, 21) → false	false	OK	
//		makeBricks(20, 4, 51) → false	false	OK	
//		makeBricks(20, 4, 39) → true	true	OK	
		
	}
}
