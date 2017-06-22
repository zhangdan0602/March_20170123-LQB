package nuc.sw.zd.wujie_1;

public class C {
   static double e=0.000001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double l= 2,r=3,mid;
		while(l+e<r){
			mid=(l+r)/2;
		if(Math.pow(mid, mid)<10.0){
			l=mid;
		 }
		else
			r=mid;
		}
		System.out.printf("%.6f", l);
	}

}
