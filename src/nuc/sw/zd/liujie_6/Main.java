package nuc.sw.zd.liujie_6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1225;
		for(int i=1;i<47;i++){
			for(int j=i+2;j<49;j++){
				int now=num;
				now-=i+i-1;
				now-=j+j-1;
				now+=i*(i+1);
				now+=j*(j+1);
				if(now==2015)
					System.out.println(i+"  "+j);
				
			}
		}
		
	}

}
