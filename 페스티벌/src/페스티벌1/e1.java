package 페스티벌1;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int num = sc.nextInt();
		int money = 0;
		if (num > 8) {
			 money = (num - 8) * 7500 + 40000;

		} else {
			money = num * 5000;
		}

		System.out.println("총 임금은" + money + "입니다.");

	}

}
