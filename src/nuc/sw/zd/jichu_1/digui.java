package nuc.sw.zd.jichu_1;

public class digui {
	//加法划分 打印  
	//a缓存 k ：当前位置
	public static void f(int n,int[] a, int k){
		if(n<1) {
			for(int i=0;i<k;i++)
				System.out.print(a[i]+" ");
			System.out.println();
			return ;
			}
		for(int i=n-1;i>0;i--){
			if(k>0&&i>a[k-1]) continue;
			a[k]=i;
			f(n-i,a,k+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int [100];
		f(6,a,0);//数组存放之前的
	}

}
