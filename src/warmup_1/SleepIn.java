package warmup_1;

/*
 * public boolean sleepIn(boolean weekday, boolean vacation) {
  
  if (vacation == true || weekday == false) {
    
    if (weekday == false){
      return true;
      
    }
    return true;
    
  } else {
    return false;
  }
  
}

 */

public class SleepIn {

	public static boolean sleepIn(boolean weekday, boolean vacation) {

		if (vacation || !weekday) {

			if (!weekday) {
				return true;

			}

			return true;

		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(SleepIn.sleepIn(false, false));
		System.out.println(SleepIn.sleepIn(true, false));
		System.out.println(SleepIn.sleepIn(false, true));
		System.out.println(SleepIn.sleepIn(true, true));

	}

}
