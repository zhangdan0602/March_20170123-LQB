package nuc.sw.zd.linian_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int i=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int Max=max(a,b,c);
		while(true){
			int j=Max*i;
			if(j%a==0&&j%b==0&&j%c==0)
				break;
			i++;
		}
		System.out.println(i*Max);
	}
	public static int max(int a,int b,int c){
		int max=a;
		if(max<b)
			max=b;
		if(max < c)
			max=c;
		return max;
	}
}
