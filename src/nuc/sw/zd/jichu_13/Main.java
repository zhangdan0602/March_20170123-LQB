package nuc.sw.zd.jichu_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));//时间短
		String s1=strin.readLine();//获取第一行即个数
		String s2=strin.readLine();//获取第二行即具体的值
		String value[]=s2.split(" ");//将获取到的值遇到空格后进行分离 必须保存到数组中
		int[] newArr=new int[Integer.parseInt(s1)];//定义新的数组 个数即获取到的第一个字符串进行转换
		int sum=0;
		for(int i=0;i<newArr.length;i++){
			newArr[i]=Integer.parseInt(value[i]);//分离后的值转换成整数后存入新数组
		}
		java.util.Arrays.sort(newArr);
		for(int i=0;i<newArr.length;i++){
			StringBuffer s=new StringBuffer();
			s.append(newArr[i]).append(" ");
			System.out.print(s);
		}	
	}
}
