
public class Driver {
	public static void main(String[]args){
		int sum =0, sumsqr=0;
		for(int a=1; a<101; a++){
			sumsqr+=a*a;
		}
		for(int b=1; b<101; b++){
			sum+=b;
		}
		System.out.println(sum*sum-sumsqr);
	}
}
