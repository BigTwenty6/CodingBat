package warmup_1;

/*
 * Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 * 
 * 
 */

public class StringE {

	public boolean stringE(String str) {

		char target = 'e';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == target) {
				count++;
			}
		}

		if (count >= 1 && count <= 3) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
//		Expected	Run		
//		stringE("Hello") → true	true	OK	
//		stringE("Heelle") → true	true	OK	
//		stringE("Heelele") → false	false	OK	
//		stringE("Hll") → false	false	OK	
//		stringE("e") → true	true	OK	
//		stringE("") → false	false	OK
	}

}
