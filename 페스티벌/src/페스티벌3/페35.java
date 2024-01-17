package 페스티벌3;

import java.util.Scanner;

public class 페35 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =0;
		int b =0;
		System.out.println("단수 입력 :");
		a=sc.nextInt();
		System.out.println("어느 수까지 출력 :");
		b=sc.nextInt();
		System.out.println(a+"단");
		for(int c=1;c<=b;c++)
		{System.out.println(a+"*"+c+"="+(a*c));}
		
	}

}
