package warmup_1;

// not part of codingbat. 
// store numbers that are prime between 20-50

public class IsPrime {
	
	public static void main(String[] args) {

		String result = "";
		boolean prime = false;

		for (int i = 20; i <= 50; i++) {
			prime = false;
			for (int n = 2; n <= i-1; n++) {
				if (i % n == 0) {
					prime = true;
					break;
				}

			}
			if (!prime) {
				result += i;
				
			}
		}
		System.out.println(result);
	}

}
