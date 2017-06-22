package nuc.sw.zd.a7;

import java.util.Scanner;
import java.util.Stack;

public class cal24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true){
			
			System.out.println("4个整数:");
			String[] ss=sc.nextLine().split(" +");
			f(ss);
		}
		
	}

	private static void f(String[] ss) {
		// TODO Auto-generated method stub
		//随机组合序列 ＝＝24  
		for(int k=0;k<100000;k++){
			//二茶树表达式  中缀   后缀（逆波兰）
			String[] buf=new String[7];
			for(int i=0;i<4;i++)
				buf[i]=ss[i];
			for(int i=4;i<7;i++)
				buf[i]=random_op();
			shuffle(buf);
			if(jisuan(buf)){
				show(buf);
				break; 
			}
			
		}
	}

	private static void show(String[] buf) {
		// TODO Auto-generated method stub
		Stack stk=new Stack();
		for(int i=0;i<buf.length;i++){
			if(buf[i].equals("+")||buf.equals("-")||buf.equals("*")||buf.equals("/")){
				stk.push("("+stk.pop()+buf[i]+stk.pop()+")");
				}
			else{
				stk.push(buf[i]);
			}
		}
		System.out.println(stk.pop());
	}

	private static boolean jisuan(String[] buf) {
		
		Stack stk=new Stack();
		try{
		for(int i=0;i<buf.length;i++){
			if(buf[i].equals("+")||buf[i].equals("-")||buf[i].equals("*")||buf[i].equals("/")){
				int a=Integer.parseInt((String) stk.pop());
				int b=Integer.parseInt((String) stk.pop());
				stk.push(op(a,b,buf[i])+" ");
			}
			else{
				stk.push(buf[i]);
			}
		}
		}
		catch(Exception e){
			return false;
		}
		if(stk.size()==1&&stk.pop().equals("24"))
			return true;
		return false;
	}

	private static int op(int a, int b, String ope) throws Exception{
		// TODO Auto-generated method stub
		if(ope.equals("+"))
			return a+b;
		if(ope.equals("-"))
			return a-b;
		if(ope.equals("*"))
			return a*b;
		if(a%b!=0) throw new Exception("not / ");
		return a/b;
	}

	private static void shuffle(String[] buf) {
		// TODO Auto-generated method stub
		for(int i=0;i<buf.length;i++){
			int j=(int)(Math.random()*buf.length);
			String t=buf[i];
			buf[i]=buf[j];
			buf[j]=t; 
		}
	}

	private static String random_op() {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*4);
		if(n==0)
			return "+";
		if(n==1)
			return "- ";
		if(n==2)
			return "*";
		return "/";
	}

}
