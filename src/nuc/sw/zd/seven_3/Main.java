package nuc.sw.zd.seven_3;

public class Main {
	static int a,b,c,d,e,f,g,h,i;
	
	public static void main(String[] args) {
		int count=0;
		for( a=1;a<10;a++){
			for( b=1;b<10;b++){
				if(b==a) continue;
				for( c=1;c<10;c++){
					if(c==a||c==b) continue;
					for( d=1;d<10;d++){
						 if(d==a||d==b||d==c) continue;
						for(e=1;e<10;e++){
							 if(e==a||e==b||e==c||e==d) continue;
						     for(f=1;f<10;f++){
						    	  if(f==a||f==b||f==c||f==d||f==e) continue;
						          for(g=1;g<10;g++){
						        	  if(g==a||g==b||g==c||g==d||g==e||g==f) continue;
						          for(h=1;h<10;h++){
							    	  if(h==a||h==b||h==c||h==d||h==e||h==f||h==g) continue;
							          for(i=1;i<10;i++){
							        	  if(i==a||i==b||i==c||i==d||i==e||i==f||i==f||i==g||i==h) continue;
							              double rs=a+b*1.0/c+(d*100+e*10+f)*1.0/(g*100+h*10+i)-10;
							               if(rs==0){
							        	        count++;							        	        
							               }
							          }
						          }
						        }
						     }
						}
					}
				}
			}
	   }
							          System.out.println(count);							        	  
	}
}
