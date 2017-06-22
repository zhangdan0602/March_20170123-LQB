package nuc.sw.zd.rumen_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
			BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
			/*
			System.in是用户输入
			InputStream is = System.in;//键盘输入字节流
			InputStreamReader isr = new InputStreamReader(is);//把输入作为参数，构建一个读取数据用的流   字节流转换为字符流
			BufferedReader bufr = new BufferedReader(isr);//把字符流对象isr做个包装，包装成缓冲BufferedReader流
			*/
			long i=Integer.parseInt(strin.readLine());//读取一行文本
			long sum =(1+i)*i/2;
			System.out.println(sum);
			/*
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
		    long sum=0;
			for(int i=1;i<=n;i++){
				sum+=i;
			}
			System.out.println(sum);
			*/
			/*
			Scanner sc=new Scanner(System.in);
			long n=sc.nextLong();
		    long sum=(1+n)*n/2;
			for(int i=1;i<=n;i++){
				sum+=i;
			}
			System.out.println(sum);
			*/
			
	}

}
