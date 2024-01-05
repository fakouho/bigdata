package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex03플러스게임 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2.랜덤숫자 추출하는 도구 꺼내오기
		Random ran = new Random();
		do{
		int num1 = ran.nextInt(9) + 1;
		int num2 = ran.nextInt(9) + 1;
		// 3. 문제 출력
			System.out.print(num1 + "+" + num2 + "=");
		// 4. 사용자로부터 정답 입력
		int input = sc.nextInt();
		// 5. 입력받은 숫자와 정답이 같은지 비교
		if (num1 + num2 == input) {
			System.out.println("성공");
		} else {
			// 5-1. 정답이 일치하지 않은 경우에만 계속하시겠습니까?출력
			System.out.println("실패");
			System.out.print("계속하시겠습니까? : ");
			String dab = sc.next();
			//5-2 N을 입력받으면 게임 종료
			//문자열 비교개념>equals
			
			if (dab.equals("N")) {
				System.out.println("종료합니다.");
				break;
			}
		}
		}while(true);
	}
	
}
