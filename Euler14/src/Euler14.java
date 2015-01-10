
public class Euler14 {

	/**
	 * @param args
	 */
	
	final static int SIZE = 1000000;
	// For ease better understandability, I'm making array size + 1 to ignore 0th element
	final static int[] ARRTERMS = new int[SIZE + 1];
	
	public static void main(String[] args) {
		// Let's try some dynamic programming
		for(int e = 0; e <= SIZE; e++) {
			ARRTERMS[e] = 0;
		}
		
		for(int a = 1; a <= SIZE; a++) {
			collatz(a);
		}
		
		int largeInd = 1;
		for(int i = 0; i <= SIZE; i++) {
			if(ARRTERMS[largeInd] < ARRTERMS[i]) largeInd = i;
			
		}
		System.out.println(largeInd);
		
	}
	
	public static int collatz(long a) {
//		System.out.println("collatz" + a);
		if(a <= SIZE && ARRTERMS[(int) a] > 0) return ARRTERMS[(int) a];
		if(a <= 1) {
			ARRTERMS[1] = 1; // Corresponds with # of terms in collatz(1)
			System.out.println(a);
			if(a < 1) System.out.println("This should never print");
			return 1;
		}
		
		long newNum;
		
		if(a % 2 == 0) { // even
			newNum = a / 2;
		} else { // odd
			newNum = 3 * a + 1;
		}
		
		int terms = 1 + collatz(newNum);
		if(a <= SIZE) ARRTERMS[(int) a] = terms;
		return terms;
	}

}
