package nuc.sw.zd.xunlian_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static ArrayList<Integer> getArray(ArrayList<Integer> rs,int begin,int end){
		ArrayList<Integer> prs=new ArrayList<Integer>();
			for(int i=begin;i<=end;i++){
				//获取某一区间
				prs.add(rs.get(i));
			}
			return  prs;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//时间少
		BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));
		
		int m=Integer.parseInt(brin.readLine());
		//读取第二行每个数 存入数组
		String s=brin.readLine();
		String[] s1=s.split(" ");
		
		ArrayList<Integer> rs=new ArrayList<Integer>();
		for(int i=0;i<m;i++){
			//将获取到的数添加至数组即可 必须将字符类型转换为整数
			rs.add(Integer.parseInt(s1[i]));
		}
		
		int n=Integer.parseInt(brin.readLine());
		
		int[] result=new int[1001];
		//因为可能输入n组数据，所以使用for
		for(int i=0;i<n;i++){
			String ss=brin.readLine();
			String[] s2=ss.split(" ");
			int l=Integer.parseInt(s2[0]);
			int r=Integer.parseInt(s2[1]);
			int k=Integer.parseInt(s2[2]);
			ArrayList<Integer> prs=getArray(rs,l-1,r-1);
			Collections.sort(prs);
			//输出时为逆序 所以需要用长度－某一位，正好是下标－1
			result[i]=prs.get(prs.size()-k);
		}
		
		//再次循环 输出每组结果
		for(int i=0;i<n;i++){
			System.out.println(result[i]);
		}
	}

}
