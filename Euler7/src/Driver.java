
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=3, curr=7;
		while(count<10001){
			if(prime(curr)){
				count++;
				System.out.println(" count"+count+"curr"+curr);
			}
			curr++;
		}
		System.out.println(curr-1);
	}

	private static boolean prime(int curr) {
		for(int a=2; a<Math.sqrt(curr)+1; a++){
			if(curr%a==0)return false;
		}
		return true;
	}

}
