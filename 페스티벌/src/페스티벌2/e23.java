package 페스티벌2;

import java.util.Random;
import java.util.Scanner;

public class e23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int num3 = 1;
		while (true) {
			int num1 = ran.nextInt(9) + 1;//랜덤 수 1~9까지 받음
			int num2 = ran.nextInt(9) + 1;
			int sum = 0;
			System.out.print(num1 + "+" + num2 + "=");
			sum = sc.nextInt();

			if (sum == num1 + num2) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
				//넘31씩증가해서 5가 초가되면 브레이크
				//아에 와일문이 끝나는 곳에서 종료
				num3++;
				if (num3 > 5) {
					break;
				}
			}
		}
		System.out.println("종료");
	}
}
