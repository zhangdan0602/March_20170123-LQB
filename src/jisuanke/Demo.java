package jisuanke;

import java.util.Scanner;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int data=sc.nextInt();
		for(int i=1;i<=data;i++){
			for(int j=0;j<(2*data-1)/2+1-i;j++){
				System.out.print(" ");
					
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
