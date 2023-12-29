package Ifelse문;

import java.util.Scanner;

public class Ex02ifelso문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====에버랜드에 오신 걸 환영합니다.===");
		System.out.print("나이를 입력하세요 :");
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 :");
		int num = sc.nextInt();
		int muney = 5000;
		if(age<20 ) {System.out.println("총"+ num *muney/2+"원입니다");
		
		
		} else {
			System.out.println("총"+num * muney + "원입니다");
		}
		//지역변수(local variable)****
		//= {}영역 안에서 선언된 변수로서 {}안에서만 사용이 가능하다.
		//--->{}=scope 라고도 말한다.
		//다른버전
		//if(age < 20){ int moner= =5000* people*0.5):}
		//elso
		//{int moner2 = 5000*people;}
		
		
				

	}
	

}
