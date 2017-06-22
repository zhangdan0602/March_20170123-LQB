package nuc.sw.zd.liujie_9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

		static int MOD = (int) (1e9+7);
		public static void main(String[] args) {
			int [][]ar = new int[40][40];
			int []mm = {0,4,5,6,1,2,3};
			long [][]dp = new long[2][7];
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();
			for(int i = 0;i<m;i++){
				int u  = in.nextInt();
				int v  =in.nextInt();
				ar[u][v] = 1;
				ar[v][u] = 1;
			}
			
			int pre = 1;
			int now = 0;
			for (int i = 1; i < 7; i++)
				dp[0][i] = 4;
			for (int i = 2; i <= n; i++) {
				pre = (pre + 1) % 2;
				now = (now + 1) % 2;
				Arrays.fill(dp[now], 0);
				for (int j = 1; j < 7; j++)
					for(int k = 1;k<7;k++){
						dp[now][j] += (dp[pre][k] * 4) % MOD;
					}
				for (int j = 0; j < 7; j++) {
					for(int k = 0;k<=j;k++) 
						if(ar[j][k]==1){
						dp[now][mm[j]] = (MOD + dp[now][mm[j]] - dp[pre][k] * 4) % MOD;
						dp[now][mm[k]] = (MOD + dp[now][mm[k]] - dp[pre][j] * 4) % MOD;
					}
				}
			}
			long ans = 0;
			for (int i = 1; i < 7; i++)
				ans = (ans + dp[now][i]) % MOD;
			System.out.println(ans);
}
}
