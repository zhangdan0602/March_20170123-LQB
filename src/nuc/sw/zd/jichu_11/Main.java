package nuc.sw.zd.jichu_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		String str=strin.readLine();//获取到转换成字符串
		char c[]=str.toCharArray();//字符串转换为字符数组  最高位为c[0]
		int n=c.length;
		long sum=0;//十进制数
		for(int i=0;i<n;i++){
			//if((int)c[i]-48>9){//50
			if(c[i]>='A'&&c[i]<='F'){//100  c[i]是字符 转成整数。0在ASCII码中是48    >=F则是25
			  if(c[i]=='A')//A-F
				  sum+=10*Math.pow(16, n-i-1);//一定是－1
			  else if(c[i]=='B')
				  sum+=11*Math.pow(16, n-i-1);
			  else if(c[i]=='C')
				  sum+=12*Math.pow(16, n-i-1);
			  else if(c[i]=='D')
				  sum+=13*Math.pow(16, n-i-1);
			  else if(c[i]=='E')
				  sum+=14*Math.pow(16, n-i-1);
			  else if(c[i]=='F')
				  sum+=15*Math.pow(16, n-i-1);
			}
			else{//0-9
				sum+=((int)c[i]-48)*Math.pow(16, n-i-1);
			}
		}
		System.out.println(sum);
	}
}
