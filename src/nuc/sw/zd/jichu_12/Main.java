package nuc.sw.zd.jichu_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static String str=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		String num=strin.readLine();//第一行即个数
		String[] number=new String[Integer.parseInt(num)];//所有的十六进制
		
		for(int j=0;j<number.length;j++){
			str=strin.readLine();//循环获取
			number[j]=str;//存放到数组中
		}
		for(int j=0;j<number.length;j++){//一个一个转换
			char c[]=number[j].toCharArray();//字符串转换为字符数组
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
			int rs=(int)sum;//先转换成十进制
			System.out.println(Integer.toOctalString(rs));//再转化成八进制
		
		  }
	}
}
