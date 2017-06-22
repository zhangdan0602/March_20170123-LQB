package nuc.sw.zd.linian_4;

import java.util.Scanner;

public class Main {
	static int n,m;
	static int[][] arr;
	static int[] array;
	static boolean[][] flag;
	static boolean[][] visit;
	static int total=0;
	static int result=0;
	static int finalResult=Integer.MAX_VALUE;
	static int index=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		m=sc1.nextInt();
		n=sc1.nextInt();
		arr=new int[n][m];
		array=new int[n*m];
		flag=new boolean[n][m];
		for(int i=0;i<n;i++){
			sc1=new Scanner(sc.nextLine());
			for(int j=0;j<m;j++){
				arr[i][j]=sc1.nextInt();
				array[index++]=arr[i][j];
				total+=arr[i][j];
			}
		}
		
		if(total%2!=0||array[0]>total/2){
			System.out.println(0);
		}
		else{
			flag[0][0]=true;
			result++;
			dp(total/2-array[0],1);
			if(finalResult==Integer.MAX_VALUE)
				finalResult=0;
			System.out.println(finalResult);
		}
	}

	private static void dp(int count, int start) {
		if(count==0){
			if(confirm()&&finalResult>result){
				finalResult=result;
				return;
			}
		}
		for(int i=start;i<index;i++){
			if(count>=array[i]){
				count-=array[i];
				flag[i/m][i%m]=true;//访问过
				result++;
				dp(count,i+1);
				count+=array[i];
				flag[i%m][i/m]=false;
				result--;
			}
		}
	}	
		public static boolean confirm(){
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					System.out.print(flag[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			int row=0,col=0;
			visit=new boolean[n][m];
			for(int i=1;i<index;i++){
				if(flag[i/m][i%m]==false){
					row=i/m;
					col=i%m;
					break;
				}
			}
			if(dfs(0,0,1)==result&&dfs(row,col,0)==index-result){
				return true;
			}
			else{
				return false;
			}
		}
	

	public  static int dfs(int row, int col, int f) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		if(f==1&&flag[row][col]==true){
			visit[row][col]=true;
			if(row+1<n&&!visit[row+1][col])
				num1=dfs(row+1,col,1);
			if(col+1<m&&!visit[row][col+1])
				num2=dfs(row,col+1,1);
			return num1+num2+1;
		}else if(f==0&&flag[row][col]==false){
			visit[row][col]=true;
			if(row+1<n&&!visit[row+1][col])
				num1=dfs(row+1,col,0);
			if(col+1<m&&!visit[row][col+1])
				num2=dfs(row,col+1,0);
			if(row-1>=0&&!visit[row-1][col])
				num3=dfs(row-1,col,0);
			if(col-1>=0&&!visit[row][col-1])
				num4=dfs(row,col-1,0);
			return num1+num2+num3+num4+1;
		
	  }
		else{
			return 0;
			}
		}
}
