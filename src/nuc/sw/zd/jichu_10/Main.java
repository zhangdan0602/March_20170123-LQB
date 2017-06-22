package nuc.sw.zd.jichu_10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n=new Scanner(System.in).nextInt();
		System.out.println(Integer.toHexString(n).toUpperCase());//java中自带，低于16；转为大写
		System.out.println(Integer.toBinaryString(n)); //二进制
		System.out.println(Integer.toOctalString(n));// 八进制
	}
}
