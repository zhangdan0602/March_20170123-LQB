package nuc.sw.zd.jichu_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//输入两个数 可以用Buffered  但是需要分隔
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][] charArr=new char[n][m];
		char[] c=new char[m>n?m:n];
		int tc=65;
		for(int i=0;i<c.length;i++){//事先定义好 直接调用就可以
			c[i]=(char)tc;
			tc++;
		}
		
		for(int i=0;i<n;i++){//一圈一圈减少 五行减少五次
			for(int j=0;j<n-i&&i<m;j++){//先填列 (层递减 <n-i)  保持列不变
				charArr[j+i][i]=c[j];
			}
			for(int j=0;j<m-i;j++){//再填行(层递减 <m-i)  保持行不变
				charArr[i][j+i]=c[j];
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(charArr[i][j]);
			}
			System.out.println();
		}
	}

}
