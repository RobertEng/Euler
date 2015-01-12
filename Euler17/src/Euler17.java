
public class Euler17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] refones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		int[] ones = {4, 3, 3, 5, 4, 4, 3, 5, 5, 4, 3};
		String[] refteens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		int[] teens = {6, 6, 8, 8, 7, 7, 9, 8, 8};
		String[] reftens = {"nah", "special", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		int[] tens = {2000, 2000, 6, 6, 5, 5, 5, 7, 6, 6};
		int and = 3;
		int hundred = 7;
		
		int sum = 0;
		//1-10
		for(int a = 1; a < 11; a++) {
			System.out.println(refones[a]);
			sum += ones[a];
		}
		
		for(int e = 0; e < 9; e++) {
			System.out.println(refteens[e]);
			sum += teens[e];
		}
		
		for(int i = 2; i < 10; i++){
			//20, 30, 40, ... 90
			System.out.println(reftens[i]);
			sum += tens[i];
			for(int u = 1; u < 10; u++) {
				//21-29, .... 91-99
				System.out.print(reftens[i]);
				System.out.println(refones[u]);
				sum += tens[i];
				sum += ones[u];
			}
		}
		
		for(int b = 1; b < 10; b++) {
			System.out.print(refones[b]);
			System.out.println("hundred");
			sum += ones[b];
			sum += hundred;
			
			//1-10
			for(int a = 1; a < 11; a++) {
				System.out.print(refones[b]);
				System.out.print("hundred and ");
				System.out.println(refones[a]);

				sum += ones[b];
				sum += hundred;
				sum += and;
				sum += ones[a];
			}
			
			for(int e = 0; e < 9; e++) {
				System.out.print(refones[b]);
				System.out.print("hundred and ");
				System.out.println(refteens[e]);

				sum += ones[b];
				sum += hundred;
				sum += and;
				sum += teens[e];
			}
			
			for(int i = 2; i < 10; i++){
				//20, 30, 40, ... 90
				System.out.print(refones[b]);
				System.out.print("hundred and ");
				System.out.println(reftens[i]);

				sum += ones[b];
				sum += hundred;
				sum += and;
				sum += tens[i];
				for(int u = 1; u < 10; u++) {
					//21-29, .... 91-99
					System.out.print(refones[b]);
					System.out.print("hundred and ");
					System.out.print(reftens[i]);
					System.out.println(refones[u]);

					sum += ones[b];
					sum += hundred;
					sum += and;
					sum += tens[i];
					sum += ones[u];
				}
			}
			
			
			
		}
		
		//1000
		//one thousand
		System.out.println("one thousand");
		sum +=  11;
		
		System.out.println(sum);
	}

}
