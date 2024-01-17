package 페스티벌3;

import java.util.Scanner;

public class 페37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=11	;
		int b=1;
	
		System.out.println("입력 : "+a);
		//b=10*9*8*7*6*5*4*3*2*1;
		for(int i=a;i>0;i--) {
			b=b*i;
		}
		
		System.out.println("출력 : "+b);

		
		

	}

}
