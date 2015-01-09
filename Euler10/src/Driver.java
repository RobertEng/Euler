
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 2 3 5 7 11
		int count=3, curr=7;
		long sum=10;
		while(curr<2000000){
			if(prime(curr)){
				count++;
				sum+=curr;
				System.out.print(" count"+count+"curr"+curr+"sum"+sum);
			}
			curr++;
			if(count%10000==0)System.out.println();
		}
		System.out.println();
		System.out.println(sum);

	}

	private static boolean prime(int curr) {
		for(int a=2; a<Math.sqrt(curr)+1; a++){
			if(curr%a==0)return false;
		}
		return true;
	}
}
