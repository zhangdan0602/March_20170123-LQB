package nuc.sw.zd.moni_5;

import java.util.Scanner;

public class Main {
	static double rs=10000;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		int n=sc.nextInt();
		double sure=rs/n;
		double result=0.0;
		System.out.println(sure);
		
		for(double j=sure;;j=j+0.01){
			for(int i=0;i<n;i++){
				double profit=(double) (rs*(r*0.01/12));
				rs=rs+profit-sure;
				String r1=String.format("%.2f",rs);
				System.out.println(r1);
			}
			if(rs<0){
				result=sure;
				break;
			}
			result=sure;
		}
		System.out.println(result*100);
	}

}
