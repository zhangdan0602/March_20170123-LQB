package nuc.sw.zd.liujie_7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]dp=new int[14][14];
		dp[0][0]=1;
		for(int i=1;i<14;i++)
			for(int j=0;j<14;j++)
				for(int k=0;k<5;k++)
					if(j+k<14)
						dp[i][j+k]+=dp[i-1][j];
		System.out.println(dp[13][13]);
	}

}
