package nuc.sw.zd.liujie_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int ans = 0;
			int mod = 0;
			while(n!=0){
				ans +=n;
				int t = n;
				if(t%3+mod>=3){
					n = t/3+1;
					mod = (t%3+mod)-3;
				}else{
					n = t/3;
					mod += t%3;
				}
			}
			System.out.println(ans);
		}	
	}


