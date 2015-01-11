import java.math.BigInteger;


public class Euler15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int a = 0; a <= 1000; a++) {
			double num = Math.pow(2, a);
			BigInteger biggie = new BigInteger("2");
			biggie = biggie.pow(a);
			int sum = 0;
			while(biggie.compareTo(new BigInteger("10")) >= 0) { // biggie >= 10
				sum += biggie.mod(new BigInteger("10")).intValue();
				biggie = biggie.divide(new BigInteger("10"));
//				num = Math.floor(num);
//				System.out.println(biggie.intValue());
			}
//			System.out.print(num + "  ");
			sum += biggie.mod(new BigInteger("10")).intValue();
			
			System.out.println(a + " " + sum);

		}
	}

}
