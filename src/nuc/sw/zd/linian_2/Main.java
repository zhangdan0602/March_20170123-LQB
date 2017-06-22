package nuc.sw.zd.linian_2;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int low,row,center;
		low=row=4*(n-1)+9;
		int [][]array=new int[low][row];
		for(int i=0;i<low;i++)
			for(int j=0;j<row;j++){
				array[i][j]='.';
			}
		center=row/2;
		for(int i=center-2;i<=center+2;i++){
			array[center][i]='$';
			array[i][center]='$';
		}
		for(int m=0;m<n;m++){
		for(int i=center-2-2*m;i<(center+3+2*m);i++){
			array[center-(4+m*2)][i]='$';
			array[center+(4+m*2)][i]='$';
			array[i][center-(4+m*2)]='$';
			array[i][center+(4+m*2)]='$';
		}
		}
		for(int m=0;m<n;m++){
		for(int i=center-3-2*m;i<=center+3+2*m;i++){
			array[center-(2+2*m)][i]='$';
			array[center+(2+2*m)][i]='$';
			array[i][center-(2+2*m)]='$';
			array[i][center+(2+2*m)]='$';
		}
		
		array[center-(2+2*m)][center-(1+2*m)]='.';
		array[center-(2+2*m)][center+(1+2*m)]='.';
		array[center-(1+2*m)][center-(2+2*m)]='.';
		array[center-(1+2*m)][center+(2+2*m)]='.';
		array[center+(1+2*m)][center-(2+2*m)]='.';
		array[center+(1+2*m)][center+(2+2*m)]='.';
		array[center+(2+2*m)][center-(1+2*m)]='.';
		array[center+(2+2*m)][center+(1+2*m)]='.';
		}
		
		for(int i=0;i<low;i++){
			for(int j=0;j<row;j++){
				System.out.print((char)array[i][j]);
			}
		 System.out.println();
		}
	}

}
