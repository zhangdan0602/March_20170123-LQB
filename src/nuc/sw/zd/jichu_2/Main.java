package nuc.sw.zd.jichu_2;

public class Main {

	public static void main(String[] args) {
		for(int a1=0;a1<=1;a1++){
			for(int a2=0;a2<=1;a2++){
				for(int a3=0;a3<=1;a3++){
					for(int a4=0;a4<=1;a4++){
						for(int a5=0;a5<=1;a5++){
							for(int a6=0;a6<=1;a6++){
								for(int a7=0;a7<=1;a7++){
							
							StringBuffer s=new StringBuffer();
							/*
							当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
							和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
 							StringBuilder 的方法不是线程安全的（不能同步访问）。
 							StringBuilder 有速度优势，所以多数情况下建议使用 StringBuilder 类。
 							然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
							 */
							System.out.println(s.append(a1).append(a2).append(a3).append(a4).append(a5).append(a6).append(a7));
						}
					}
				}
					}
			}
		}

	}
	}


}
