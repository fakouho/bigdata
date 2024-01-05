package 페스티벌1;

import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("첫번째 숫자 입력>>");
		int num1=sc.nextInt();
		System.out.print("두번째 숫자 입력>>");
		int num = sc.nextInt();
		
		int num2=num%10*num1;
				System.out.println(num2);
		
		int num3=num/10%10*num1;
				System.out.println(num3);
		
		int num4=num/100*num1;
		System.out.println(num4);
		int num5=num*num1;
		System.out.println(num5);
		

	}

}
