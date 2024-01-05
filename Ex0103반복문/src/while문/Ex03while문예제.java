package while문;

import java.util.Scanner;

public class Ex03while문예제 {
	public static void main(String[] args) {
		// 1.입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int nump = 0;
		while (true) {
			// 2.정수입력출력하기
			System.out.print("정수 입력 : ");
			// 3.정수 입력받기
			num = sc.nextInt();
			// 4.입력받는 정수 누적하기
			nump += num;
			System.out.println("누적결과 : " + nump);
			if (num == -1) {
			// 입력받는 숫자가 -1이랑 같니?
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}
}
