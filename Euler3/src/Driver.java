
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tryNum=3;
		long big=0;
		long rock=600851475143L;
		while(rock>big){
			if(rock%tryNum==0){
				big=tryNum;
				rock=rock/tryNum;
				tryNum-=2;
			}
			tryNum+=2;
		}
		System.out.println("big"+big);
	}

}
