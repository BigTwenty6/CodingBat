package logic_2;

public class MakeChocolate {

	public static int makeChocolate(int small, int big, int goal) {
		  
		  int bigNeed = goal / 5 ; 
		  int remain = 0;
		  
		  if (big >= bigNeed) {
		    remain = goal - (bigNeed * 5);
		  }
		    
		  if ( remain <= small) {
		    return remain;
		  }
		  
		  return -1;
		}

	public static void main(String[] args) {
		
		System.out.println(makeChocolate(4, 1, 10));
	}
}
