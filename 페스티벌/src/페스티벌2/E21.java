package 페스티벌2;

import java.util.Scanner;

public class E21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {

			System.out.print("A 입력 >>");
			num1 = sc.nextInt();
			System.out.print("B 입력 >>");
			num2 = sc.nextInt();
			if (num1 == 0 && num2 == 0) {
				System.out.println();
				break;
			}
			System.out.println("결과>>"+(num1-num2));
		}
		
	}

}
