package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/// 1.입력받는 도구 꺼내기
		// 스캐너
		int num = 0;
		// 변수선언
		while (num < 10) {
			// 와일문(반복문)
			// num이 10보다 커지면 반복문이 종료된다.
			System.out.print("정수 입력 : ");
			// 2.정수입력 : 출력하기
			// 출력문 생성 정수를 입력하세요
			num = sc.nextInt();
			// num을 작성한다.
		}
		System.out.println("종료되었습니다.");
//위 와일문 조건부인 10을 넘을경우 와일문 밖으로 나와서 종료되었습니다.
	}

}
