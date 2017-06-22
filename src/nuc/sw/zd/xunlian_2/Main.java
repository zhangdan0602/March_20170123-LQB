package nuc.sw.zd.xunlian_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader brin=new BufferedReader(new InputStreamReader(System.in));
		long n=Long.parseLong(brin.readLine());
		//n是奇数
		long r1=n*(n-1)*(n-2);
		//n是偶数 且不被3整除
		long r2=n*(n-1)*(n-3);
		//n是偶数 且被3整除
		long r3=(n-3)*(n-1)*(n-2);
		if(n==1){
			System.out.println(1);
		}
		else if(n==2){
			System.out.println(2);
		}
		else if(n%2!=0){
			System.out.println(r1);
		}
		else if(n%3!=0){
			System.out.println(r2);
		}
		else if(n%3==0){
			System.out.println(r3);
		}
	}

}
