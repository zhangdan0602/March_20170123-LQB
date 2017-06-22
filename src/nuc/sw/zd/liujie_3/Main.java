package nuc.sw.zd.liujie_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1000;i<=9999;i++){
			for(int j=1000;j<=9999;j++){
				
				int q=i%10;//辉
				int r=i/1000%10;//祥
				int m=i/10%10;//生
				int n=j%10;//瑞
				int p=j/10%10;//献
				int a=j/100%10;//羊
				int b=j/1000%10;//三
				int c=i+j;
				for(int d=0;d<=9;d++){//气
					int sum=b*10000+a*1000+m*100+n*10+d;
					if(c==sum&&(b!=sum%10)&&(r!=p)&&(r!=a)&&(r!=b)&&(n!=q)&&(r!=n)&&(a!=b)&&(m!=q)&&(n!=p)&&(r!=m)&&(a!=p)&&(r!=n)&&(m!=r)&&(a!=m)&&(r!=q)&&(n!=q)&&(n!=b)){
						System.out.println(i+" "+j);
					}
				}
				}
			}
		}
	}


