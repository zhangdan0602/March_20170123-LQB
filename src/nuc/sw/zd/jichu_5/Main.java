package nuc.sw.zd.jichu_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));//时间短
		String s1=strin.readLine();//获取第一行即个数
		String s2=strin.readLine();//获取第二行即具体的值
		String s3=strin.readLine();//获取第三行即将要查找的数
		String value[]=s2.split(" ");//将获取到的值遇到空格后进行分离 必须保存到数组中
		int[] newArr=new int[Integer.parseInt(s1)];//定义新的数组 个数即获取到的第一个字符串进行转换
		int z=Integer.parseInt(s3);
		for(int i=0;i<newArr.length;i++){
			newArr[i]=Integer.parseInt(value[i]);//分离后的值转换成整数后存入新数组		
			if(z==newArr[i]){//不需要else
				System.out.println(i+1);
				break;     //不加break的话就会输出所有位置
			}
			if(i==newArr.length-1&&z!=newArr[value.length-1]){//判断最后一个  注意数组长度 需要-1
				//如果不判断最后一个 则每一个都会输出-1 不是我们想要的结果 所以只需要区分最后一个  之前用break 
				System.out.println(-1);
			    break;
			    }
	}
}
}