package nuc.sw.zd.linian_3;

import java.util.Scanner;

public class Main {
	static int[] array={1,2,3,4,5,6,7,8,9};
	static int r1=0;
	static int r2=0;
	static int r3=0;
	static int count=0;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int yh=sc.nextInt();
		
		getAllOrder(0,array.length-1,yh);
		
		System.out.println(count);
		/*
		Runtime r=Runtime.getRuntime();
		long freeMemory=r.freeMemory();
		long totalMemory=r.totalMemory();
		long maxMemory=r.maxMemory();
		int availableProcessors=r.availableProcessors();
		
		System.out.println(freeMemory);
		System.out.println(totalMemory);
		System.out.println(maxMemory);
		System.out.println(availableProcessors);
		*/
		
		
	}
	public static void getAllOrder(int begin,int end,int yh){//全排列
		if(begin==end){
			check(yh);
		}
		else{
			for(int i=begin;i<=end;i++){
				swap(begin,i);
				getAllOrder(begin+1,end,yh);
				swap(i,begin);
			}
		}	
	}
	public static void swap(int from,int to){
		if(from==to){
			return;
		}
		int tmp=array[from];
		array[from]=array[to];
		array[to]=tmp;
	}
	public static void check(int yh){
		for(int p=1;p<=7;p++){
			for(int q=p+1;q<=8;q++){
				r1=0;r2=0;r3=0;
				for(int k=0;k<p;k++){
					r1*=10;
					r1+=array[k];
				}
				for(int k=p;k<q;k++){
					r2*=10;
					r2+=array[k];
				}
				for(int k=q;k<9;k++){
					r3*=10;
					r3+=array[k];
				}
				if(yh==(r1+r2/r3)&&r2%r3==0){
					count++;
					//System.out.println("100="+r1+"+"+ r2+"/"+r3);
					}
			}
		}
	}
}
