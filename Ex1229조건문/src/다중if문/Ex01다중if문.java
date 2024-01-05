package 다중if문;

import java.util.Scanner;

public class Ex01다중if문 {

	public static void main(String[] args) {
		
//		사용자로부터 점수를 입력받아서 해당하는 숫자가
//		홀수인지,짝수인지,0인지 판단하는 프로그램
//		1.입력받는 도구 꺼내오기
//		Scanner sc =new Scanner(System.in);
//		//2.숫자를 입력하세요. 출력문 작성
//		System.out.println("숫자를 입력하세요 : ");
//		//3.숫자 입력받기
//		int sum = sc.nextInt();
//		//4.조건식을 판단하여 홀수,짝소,0인지 판단 프로그램 제작
//		if(sum==0) {System.out.println("0입니다.");
//		} else if(sum%2==1) {System.out.println("홀수입니다");
//		} else {System.out.println("짝수입니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int num = sc.nextInt();
		if(num==0) {System.out.println("점수는 0입니다,");
		} else if (num%2==1) {System.out.println("점수는 홀수입니다.");
		} else {System.out.println("점수는 짝수입니다.");
		}
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요:");
//		int num =sc.nextInt();
//		if(num>=90) {System.out.println("A입니다");
//		} else if(num>=70) {System.out.println("B입니다.");
//		} else if(num>=50) {System.out.println("C입니다.");
//		} else

	}

}
