package warmup_1;

/*
 * Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */

public class IntMax {
	
	public int intMax(int a, int b, int c) {
		  
		  int max = a;
		  
		  if (b > max) {
		    max = b;
		  }
		  
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		}

//	Expected	Run		
//	intMax(1, 2, 3) → 3	3	OK	
//	intMax(1, 3, 2) → 3	3	OK	
//	intMax(3, 2, 1) → 3	3	OK	
//	intMax(9, 3, 3) → 9	9	OK	
//	intMax(3, 9, 3) → 9	9	OK	
//	intMax(3, 3, 9) → 9	9	OK	
//	intMax(8, 2, 3) → 8	8	OK	
//	intMax(-3, -1, -2) → -1	-1	OK	
//	intMax(6, 2, 5) → 6	6	OK	
//	intMax(5, 6, 2) → 6	6	OK	
//	intMax(5, 2, 6) → 6	6	OK	
}
