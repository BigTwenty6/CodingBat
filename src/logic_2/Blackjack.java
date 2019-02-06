package logic_2;

/*
 * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. 
 * Return 0 if they both go over.


blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
 */
public class Blackjack {

	public int blackjack(int a, int b) {

		int aRet = a;
		int bRet = b;

		if (aRet > 21) {
			aRet = 0;
		}

		if (bRet > 21) {
			bRet = 0;
		}

		if (aRet >= bRet) {
			return aRet;
		} else {
			return bRet;
		}
	}

	public static void main(String[] args) {

//		Expected	Run		
//		blackjack(19, 21) → 21	21	OK	
//		blackjack(21, 19) → 21	21	OK	
//		blackjack(19, 22) → 19	19	OK	
//		blackjack(22, 19) → 19	19	OK	
//		blackjack(22, 50) → 0	0	OK	
//		blackjack(22, 22) → 0	0	OK	
//		blackjack(33, 1) → 1	1	OK	
//		blackjack(1, 2) → 2	2	OK	
//		blackjack(34, 33) → 0	0	OK	
//		blackjack(17, 19) → 19	19	OK	
//		blackjack(18, 17) → 18	18	OK	
//		blackjack(16, 23) → 16	16	OK	
//		blackjack(3, 4) → 4	4	OK	
//		blackjack(3, 2) → 3	3	OK	
//		blackjack(21, 20) → 21	21	OK	
	}
}
