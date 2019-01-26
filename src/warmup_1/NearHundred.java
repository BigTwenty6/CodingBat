package warmup_1;

/*
 * 
 * 
Given an int n, return true if it is within 10 of 100 or 200. 

Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */

public class NearHundred {
	
	public static boolean nearHundred(int n) {
		  
		  int temp100 = Math.abs(n - 100);
		  int temp200 = Math.abs(n - 200);
		  
		  if ( temp100 <= 10 || temp200 <= 10) {
		    
		    return true;
		    
		  } else {
		    
		    return false;
		    
		  }
		  
		}
	
	public static void main(String[] args) {
		
		System.out.println(NearHundred.nearHundred(93));
		System.out.println(NearHundred.nearHundred(90));
		System.out.println(NearHundred.nearHundred(89));
		System.out.println(NearHundred.nearHundred(110));
		System.out.println(NearHundred.nearHundred(111));
		System.out.println(NearHundred.nearHundred(121));
		System.out.println(NearHundred.nearHundred(-101));
		
		
	}

}
