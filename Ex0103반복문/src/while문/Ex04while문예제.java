package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int num1 = 0;
//		int num2 = 0;
//		while (true) {
//			System.out.print("숫자 입력 : ");
//			num = sc.nextInt();
//			System.out.println("짝수 개수 : " + num1);
//			System.out.println("홀수 개수 : " + num2);
//		
//		if (num % 2 == 0) {
//			num1++;
//
//		} else if (num %2 != 0) {
//			num2++;
//		
//		}else if (num==-1){
//			System.out.println("종료되었습니다.");
//			break;
//
		// 1.입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		int jjak = 0;
		int hol = 0;
		// 2.정수 입력출력하기
		while (true) {
			System.out.print("정수 입력 : ");
			// 3.정수입력받기
			int num = sc.nextInt();
			// -->짝수의 개수와 홀수의 개수를 구별할 변수 하나씩 필요!
			if (num % 2 == 0) {
				// 4.입력받은 정수가 짝수라면 짝수의 개수를 +1
				jjak++;
			} else if (num % 2 == 1) {
				// 5.입력받은 정수가 홀수라면 홀수의 개수를 +1
				hol++;
			}else if(num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			System.out.println("짝수의 개수 : " + jjak);
			System.out.println("홀수의 개수 : " + hol);
		}

	}
}