package nuc.sw.zd.a5;

public class A {
	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if(i==0)  return j;
		return gcd(j%i,i);
	}
	
	public static void main(String[] args) {
		
		//最小公倍数＝最大公约数＊a＊b
		
		//最大公约数
		
		System.out.println(gcd(15,40));
		
		// TODO Auto-generated method stub
//		int a=15;
//		int b=40;
//		//最大的可能是a    暴力搜索
//		for(int i=a;i>=1;i--){
//			if(a%i==0&&b%i==0){
//				System.out.println(i);
//				break;
//		}
//	}
		
		
		//辗转相除法 整数和余数的性质
//		int a=ka*i+a1;
//		int b=kb*i+b1;
//		(a+b)%i=(ka+kb)*i+(a1+b1)%i
		  
//		a=ka*i
//		b=kb*i
//		(b-a)=(ka-kb)*i
		
		
		//15 40    10 15    5 10   0 5
//		int a=15;
//		int b=40;
//		for(; ; ){
//			if( a==0) {
//				System.out.println(b);
//				break;
//			}
//			int t=a;
//			a=b%a;
//			b=t;
//			
//		}
		

		  
}

	
}
