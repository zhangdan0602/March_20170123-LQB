package nuc.sw.zd.rumen_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num=new Scanner(System.in).nextInt();
		int[] a=new int[num+2];
		a[1]=a[2]=1;
		if(num==1)
			a[num]=1;
		else if(num==2)
			a[num]=1;
		else{
			for(int i=3;i<=num;i++){
				a[i]=(a[i-1]+a[i-2])%10007;
						}
		}
}
}