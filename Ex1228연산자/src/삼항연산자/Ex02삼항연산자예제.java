package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//스캐너
		//입력도구 꺼내오기
	System.out.print("정수를 입력하세요 : ");
	//정수를 입력하세요
	//출력하기
	int num1 = sc.nextInt();
	//정수를 입력받고 변수지정
	//int(다음번에도 사용하기위해 변수에 담는다.) = sc(스캐너 도구 꺼내오기)+nextInt
	String result = num1%2 == 0 ? num1 + "은(는) 짝수입니다" : "은(는) 홀수입니다.";
	//문장을 만나는 = num1을 2로 나누면 0면 num1은 짝수 : 홀수
	//문장을 이어나가며 상향연산자를 사용 
	System.out.println(result);
	//출력문으로 출력
		
	//다른 버전
//	String result = num%2 == "홀수" : "짝수";
	
//	System.out.println(num +"은(는)" + result + "입니다." );

	}

}
