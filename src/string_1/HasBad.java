package string_1;

public class HasBad {

	public boolean hasBad(String str) {

		if (str.contains("bad")) {
			for (int i = 0; i < 2; i++) {
				if ((str.charAt(i) == 'b' || str.charAt(i + 1) == 'b') && str.charAt(i + 2) == 'd') {
					return true;
				}
			}

		}

		return false;
	}

	public static void main(String[] args) {
		
//		Expected	Run		
//		hasBad("badxx") → true	true	OK	
//		hasBad("xbadxx") → true	true	OK	
//		hasBad("xxbadxx") → false	false	OK	
//		hasBad("code") → false	false	OK	
//		hasBad("bad") → true	true	OK	
//		hasBad("ba") → false	false	OK	
//		hasBad("xba") → false	false	OK	
//		hasBad("xbad") → true	true	OK	
//		hasBad("") → false	false	OK	
//		hasBad("badyy") → true	true	OK	
	}
}
