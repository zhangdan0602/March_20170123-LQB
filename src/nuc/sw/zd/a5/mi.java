package nuc.sw.zd.a5;

public class mi {
	
	private static int  f(int i, int j, int p) {
		int x=1;
		for(int a =0;a<j;a++)
			x=(x*i)%p;
		return x;
		
	}
	public static void main(String[] args) {
		//3的50次幂 对17取余
		System.out.println(f(3,50,17));
		
		//求100002个素数  越往后越稀疏   筛法
		 int N=1000*1000*10;
		 int x=100001;
		 byte[] a=new byte[N];
		 for(int i=2;i<N/2;i++){
			 if(a[i]==1)continue;
			 for(int k=2;k<=N/i;k++){
				 if(i*k <N) 
					 a[i*k]=1;
			 }
		 }
		 int m=0;
		 for(int i=2;i<N;i++){
			 if(a[i]==0){
				 m++;
				 if(m==x)
					 System.out.println(i+" ");
			 }
		 }
		 System.out.println("m="+m);
		
	  
		
	}

	

}
