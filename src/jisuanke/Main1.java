package jisuanke;

import java.util.Scanner;

	public class Main1 {
		public static void main(String[] args) {
			// TODO Auto	-generated method stub
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
	        int i;
	        if(N==2)
	           System.out.println("YES");          
	        for(i=2;i<=N/2;i++){
			  if(N%i==0){
	             System.out.println("NO");
	             return;
	           }
	          else{
	            continue;
	          }   
	        }

	        if(i==N/2)
	            System.out.println("YES");          
		}
	    
	}


