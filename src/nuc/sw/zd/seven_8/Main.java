package nuc.sw.zd.seven_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		for(int a=0;a<3000;a++){
			for(int b=a;b<3000;b++){
				for(int c=b;c<3000;c++){
					for(int d=c;d<3000;d++){
						if((a*a+b*b+c*c+d*d)==n){
							System.out.println(a+" "+b+" "+c+" "+d);
							return;
						}
					
					}
					
				}
			}
		}
	}

}
