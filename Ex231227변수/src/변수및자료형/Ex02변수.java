package 변수및자료형;

import java.util.Scanner;

public class Ex02변수 {
	//main이라 작성후 strl 스페이스 하면 자동완성(main을 만들지 못한경우)

	public static void main(String[] args) {
		
		
		//변수 선언 
		//정수 데이터 4를 담을수 있는 num 변서 선언
		//자료형 변수명 = 값;
		  int num = 2;
	    // 변수를 사용하는 이유는 재사용하기 위해서 이다.  
		  System.out.println(num);
		  
		//1. 입력받는 도구 꺼내오기
		  Scanner sc = new Scanner(System.in);
		  System.out.print("숫자를 입력하세요 >>>");
			
		//2. 정수형 숫자 입력받기  
		  int input = sc.nextInt();
		//3. 입력받은 숫자를 출력하기
		 
		  System.out.print(input);
		  
		//상수 선언하는법>> final 키워드 사용 
		//정수형 3을 담을수 있는 상수 num2 선언
		  
		  
		  final int num2 = (6);
		  
		// 변수에 들어가는 값 변경  
		  num = 14;
		//  num2= 10; >> 상수(final)는 값 변경이 불가능
		// int input = 5; >> 변수명 중복선언은 불가능하다. 
		  
		  
		  
		  
		  
		  
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
