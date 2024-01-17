package 페스티벌3;

import java.util.Scanner;

public class 페36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 10;

		System.out.println("입력 :" + a);
		for (int i = 0; i < a + 10; i++) {
			a = a * i;
		}
		System.out.println("출력 : " + a);

	}
}