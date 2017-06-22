package nuc.sw.zd.a7;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N=1000*100;
		int n=0;
		for(int i=0;i<N;i++){//循环随机  增大概率
			
			int[] x=new int[365]; //最开始都是0
			
			for(int j=0;j<30;j++){//一个班30个人
			 
				int p=(int)(Math.random()*365);
				if(x[p]==1){//某一天生日的有两个人
					n++;
				    break;//一次随机中重复过一次即退出此次随机 进行下次循环
				}
				else
					x[p]=1;
			}
			
		}
		
		double r=(double)n/N;
		System.out.println(n);
		System.out.println(r);
	}

}
