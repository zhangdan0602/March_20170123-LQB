package nuc.sw.zd.xunlian_53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		int sum=0;
		int[] result=new int[1001];//最大组数
		BufferedReader brin=new BufferedReader(new InputStreamReader(System.in));
		int k=Integer.parseInt(brin.readLine());//k组数据
		for(int i=0;i<k;i++){
			int k1=Integer.parseInt(brin.readLine());//每组数据个数
			
			String[] l1=brin.readLine().split(" ");//第一行数据
			for(int j=0;j<k1;j++){
				list1.add(Integer.parseInt(l1[j]));
			}
			
			String[] l2=brin.readLine().split(" ");//第2行数据
			for(int p=0;p<k1;p++){
				list2.add(Integer.parseInt(l2[p]));
			}
			Collections.sort(list1);
			Collections.sort(list2);
			Collections.reverse(list2);
			for(int j=0;j<k1;j++){
				sum+=(list1.get(j)*list2.get(j));
			}
			result[i]=sum;//不一定只有一组数据
			list1.clear();
			list2.clear();
			sum=0;//必须清空 否则出错
		}
		
		for(int i=0;i<k;i++){
			System.out.println(result[i]);
		}
	}

}
