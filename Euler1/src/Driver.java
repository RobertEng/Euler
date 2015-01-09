
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum=0, flag3=3, flag5=5, flag15=15;
		while(flag5<1000){
			sum+=flag5;
			flag5+=5;
		}
		while(flag3<1000){
			sum+=flag3;
			flag3+=3;
		}
		while(flag15<1000){
			sum-=flag15;
			flag15+=15;
		}
		System.out.println("sum"+sum);
	}

}
