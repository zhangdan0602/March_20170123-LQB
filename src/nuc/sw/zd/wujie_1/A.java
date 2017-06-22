package nuc.sw.zd.wujie_1;
public class A
{
	public static int f(String s)
	{
		return s.split("\\p{Punct}").length;
	}
	
	public static void main(String[] args)
	{
		System.out.println(f("12+35*5-2*18/9-3")); //7
		System.out.println(f("354*12+3-14/7*6")); //6
	}
}
