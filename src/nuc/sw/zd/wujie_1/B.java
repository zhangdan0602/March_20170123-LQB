package nuc.sw.zd.wujie_1;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=1; ;i++){
			sum+=1.0/i;
			if(sum>=15.0){
				System.out.println(i);
			    break;
			}
		}
	}

}
