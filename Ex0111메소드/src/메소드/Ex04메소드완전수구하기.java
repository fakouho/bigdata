package 메소드;

import java.util.Scanner;

public class Ex04메소드완전수구하기 {
	public static void main(String[] args) {
		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기 자신인 수!
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println(getSum(7));
		System.out.println(isPerfect(6));

	}


	// 1.약수찾기 메소드
	// 메소드명 isDibisor
	// 매개변수 : 2개, int
	// 리턴타입 : boolean

	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		// num2가 num1의 약수이니?
		if (num1 % num2 == 0) {
			result = true;
		}
		return result;
	}

	// 2.자신을 제외한 약수의 총합을 구하는 메소드
	// 매소드명 getSum
	// 매소드 int,1개
	// 리턴타입 int
	private static int getSum(int num1) {
		int result = 0;
		// 1. 입력된 숫자의 약수를 구한다 ->1~num에서 num을 제외한 범위
		// 2. 나 자신을 제외한 숫자들의 합을 구한다 --> 누적합계

		for (int num2 = 1; num2 < num1; num2++) {
			// ** 기존방식
//			if (num1 % num2 == 0) {
			// ** 메소드를 호출한 로직
			//메소드안에 새로운 매소드 구현은 안되나 매소드를 호출하여 사용은 가능!
			if(isDivisor(num1,num2)==true) {
				result = result + num2; // =result += num2
			}
		}
		return result;
	}
	// 3. 완전수인지 확인하는 메소드
	//메소드 명 : 
	//매개변수 :int 1개
	//리턴타입 : boolean
	private static boolean isPerfect(int num1) {
		boolean result =false;
		if (getSum(num1)==num1) {
			//num은 완전수다
			result=true;
		}
		
		return result;
		
	}
}
