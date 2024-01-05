package while문;

import java.util.Scanner;

public class Ex021 {

//	public static void main(String[] args) {
//
//		// 무한반복문
//		Scanner sc = new Scanner(System.in);
//		//출력문 생성
//		int num = 0;
//		int nump = 0;
//		//입력받을 코드
//		while (true) {
//			// 와일문은 펄스줄스없다.
//			System.out.print("정수입력 : ");
//			// 정수입력
//			num = sc.nextInt();
//			nump=num+nump;
//			System.out.println("누적결과 :"+nump);
//			// 출력문 입력
//			if (num ==-1) {
//				System.out.println("종료되엇습니다.");
//				break;
//			}
//		}
//	}
//
//}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int nump = 0;
		while (true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			nump = num + nump;
			System.out.println("누적결과 : " + nump);
			if (num == -1)

			{
				System.out.println("종료되었습니다.");
				break;
			}

		}

	}

}
