package warmup_2;

/*
 * 
 * Given a string, return the count of the number of times that a substring length 2 appears in the string 
 * and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */

public class Last2 {

	public int last2(String str) {
		  
		  if (str.length() < 2){
		    return 0;
		  }
		  
		  String last2 = str.substring(str.length()-2);
		  int count = 0;
		  
		  for (int i= 0; i < str.length()-2; i++) {
		    if (str.substring(i,i+2).equals(last2)) {
		      count++;
		    }
		  }
		  
		  return count;
		  
		}

	public static void main(String[] args) {
		
//		Expected	Run		
//		last2("hixxhi") → 1	1	OK	
//		last2("xaxxaxaxx") → 1	1	OK	
//		last2("axxxaaxx") → 2	2	OK	
//		last2("xxaxxaxxaxx") → 3	3	OK	
//		last2("xaxaxaxx") → 0	0	OK	
//		last2("xxxx") → 2	2	OK	
//		last2("13121312") → 1	1	OK	
//		last2("11212") → 1	1	OK	
//		last2("13121311") → 0	0	OK	
//		last2("1717171") → 2	2	OK	
//		last2("hi") → 0	0	OK	
//		last2("h") → 0	0	OK	
//		last2("") → 0	0	OK
		
	}
}
