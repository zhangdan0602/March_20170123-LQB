package nuc.sw.zd.rumen_3;

import java.util.Scanner;

public class Main {
	
	private  static final double PI=3.14159265358979323;//类的主方法调用则需要用static
	 
	public static void main(String[] args) {
		int r=new  Scanner(System.in).nextInt();
		if(1<=r&&r<=10000){
			double circular=PI*r*r;
			String result=String.format("%.7f", circular);
			System.out.println(result);
		}
	}

}
