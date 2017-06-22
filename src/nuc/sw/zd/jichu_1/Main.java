package nuc.sw.zd.jichu_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
		int y=Integer.parseInt(strin.readLine());
		if(1990<=y&&y<=2050){
		    if(y%4==0&&y%100!=0||y%400==0)
			   System.out.println("yes");
		    else
			     System.out.println("no");
		}
	}

}
