package 다중if문;

import java.util.Scanner;

public class Ex02학점계산프로그램 {
public static void main(String[] args) {
	//1. 입력도구 꺼내오기
	Scanner sc=new Scanner(System.in);
	//2. 점수 입력받기
	System.out.print("점수 입력 : ");
	
	int num = sc.nextInt();
	//3. 점수에 따른 학점 계산하기
	if(num>=90) {System.out.println("A학점입니다.");
	} else if(num>=80) {System.out.println("B학점입니다.");
	} else if(num>=70) {System.out.println("C학점입니다.");
	} else {System.out.println("D학점입니다.");
	}

		
}
}
