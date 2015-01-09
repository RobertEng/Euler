
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(962*924);
		int big=0;
		for(int int1=999; int1>300; int1--){
			for(int int2=999; int2>300; int2--){
				if(check(int1*int2)){
					System.out.println("big "+int1*int2+" int1 "+int1+" int2 "+int2);
					if(big<int1*int2)big=int1*int2;
				}
			}
		}
		System.out.println("big"+big);
	}
	
static boolean check(int hi){
		if(hi/100000==hi%10){
			hi=hi/10;
			hi-=hi/10000*10000;
			if(hi/1000==hi%10){
				hi=hi/10;
				hi-=hi/100*100;
				if(hi/10==hi%10){
					return true;
				}
			}
		}
		return false;
	}

}
