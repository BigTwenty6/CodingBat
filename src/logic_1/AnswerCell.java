package logic_1;

/*
 * Your cell phone rings. Return true if you should answer it. 
 * Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.


answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 * 
 */
public class AnswerCell {
	
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		  
		  if (isAsleep) {
		    return false;
		  }
		  
		  if (isMorning && !isMom){
		      return false;
		    } 
		    
		  return true;
		}

	
	public static void main(String[] args) {
		
//		Expected	Run		
//		answerCell(false, false, false) → true	true	OK	
//		answerCell(false, false, true) → false	false	OK	
//		answerCell(true, false, false) → false	false	OK	
//		answerCell(true, true, false) → true	true	OK	
//		answerCell(false, true, false) → true	true	OK	
//		answerCell(true, true, true) → false	false	OK
	}

}
