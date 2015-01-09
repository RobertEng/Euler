
public class Driver {
	public static void main(String[]args){
		int int1=1, int2=2, int3=3, sum=2;
		while(int3<4000000){
			if(int3%2==0)sum+=int3;
			int1=int2;
			int2=int3;
			int3=int1+int2;
		}
		System.out.println("sum"+sum);
	}
}
