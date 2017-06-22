package nuc.sw.zd.jichu_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			
			List<Integer> rs=new ArrayList<Integer>();//集合存放回文数
			
			for(int i=1;i<10;i++){//左数第一个
				for(int j=0;j<10;j++){//左数第2个
					for(int k=0;k<10;k++){//左数第3个
						if(2*i+2*j+k==n)//5位
							rs.add(i*10000+j*1000+k*100+j*10+i);
						if(2*i+2*j+2*k==n)//6位
							rs.add(i*100000+j*10000+k*1000+k*100+j*10+i);
					}
				}
			}
					Collections.sort(rs);//集合从小到大排序
					for(int i=0;i<rs.size();i++)
						System.out.println(rs.get(i));
	}
}
