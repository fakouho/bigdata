package Ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		int mool = num;
		int fa = 10000;
		//int fa = 0;	
		
		if(num>=10) {System.out.println("가격은"+num*9000+"입니다." );}
		//if{(num>=10){(int)(fa*num*0.9);}
		//elso =fa*num;
		//System.out.println("가격은"+fa+"입니다");
		else {System.out.println("가격은"+num*10000+"원입니다.");
			
		}
				
//	 if(num>=10) {
//		 System.out.println("가격은"+num*((int)fa*0.9)"입니다");
//	 }
//		 
//		

	}

}
