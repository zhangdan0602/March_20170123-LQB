package nuc.sw.zd.jichu_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(strin.readLine());//获取到值转换
		int triangle[][]=new int[num][num];//最后输出的三角   默认都为0
		triangle[0][0]=1;
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				if(j==0){
					triangle[i][j]=1;
				}
				else{
					triangle[i][j]=triangle[i-1][j-1]+triangle[i-1][j];//不同行同列加对角
				}
				System.out.print(triangle[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
