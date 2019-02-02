package logic_1;

/*
 * 
The squirrels in Palo Alto spend most of the day playing.
In particular, they play if the temperature is between 60 and 90 (inclusive). 
Unless it is summer, then the upper limit is 100 instead of 90. 
Given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise.


squirrelPlay(70, false) → true
squirrelPlay(95, false) → false
squirrelPlay(95, true) → true
 */

public class SquirrelPLay {

	public boolean squirrelPlay(int temp, boolean isSummer) {

		if (temp >= 60) {
			if (isSummer && temp <= 100) {
				return true;
			} else if (temp <= 90) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

//		Expected	Run		
//		squirrelPlay(70, false) → true	true	OK	
//		squirrelPlay(95, false) → false	false	OK	
//		squirrelPlay(95, true) → true	true	OK	
//		squirrelPlay(90, false) → true	true	OK	
//		squirrelPlay(90, true) → true	true	OK	
//		squirrelPlay(50, false) → false	false	OK	
//		squirrelPlay(50, true) → false	false	OK	
//		squirrelPlay(100, false) → false	false	OK	
//		squirrelPlay(100, true) → true	true	OK	
//		squirrelPlay(105, true) → false	false	OK	
//		squirrelPlay(59, false) → false	false	OK	
//		squirrelPlay(59, true) → false	false	OK	
//		squirrelPlay(60, false) → true	true	OK	

	}
}
