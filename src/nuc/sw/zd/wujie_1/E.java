package nuc.sw.zd.wujie_1;

import java.util.Scanner;

public class E {
	 static int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=new Scanner(System.in).nextInt();
		int num=0;
		for(i=1;i<=(int)Math.sqrt(n*n/2);i++){//时间复杂度低
			//因为是不同的直角三角形，所以要限制不重复
			  j = (int)Math.sqrt(n*n*1.0-i*i);
		  	  if(i*i+j*j==n*n){
		  		  num++;
		  	  }	
		}
		System.out.println(num);
	}
}
