package nuc.sw.zd.seven_2;

public class Main {

	public static void main(String[] args) {
		
		for(int i=1;i<100;i++){
			boolean is=false;
			int s=i,n=i;
			while(true){
				n++;
				s+=n;
				if(s==236){
					System.out.println(i+" "+n);
					is=true;
					break;
				}
				if(s>236)
					break;
				
			}
			if(is)
				break;
		}
	}

}
