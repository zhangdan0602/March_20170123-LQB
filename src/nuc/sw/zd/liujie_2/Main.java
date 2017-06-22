package nuc.sw.zd.liujie_2;

public class Main {
	static long n=1000000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		for(int i=1;i<n;i++){
			int rs=i*i*i;
			int sum=0;
			while(rs!=0){
				sum+=rs%10;
				rs/=10;
			}
			
			if(sum==i){
				num++;
				System.out.println("第"+num+"个"+i);			
			}
			
		}
	}

}
