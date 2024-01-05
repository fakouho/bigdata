package switch문;

import java.util.Scanner;

public class munge {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//sc스캐너
	System.out.println("금액을 입력하세요.");
	//첫줄 금액임력하세요 문장생성
	int num= sc.nextInt();
	//금액을 입력하세요 밑에 타이핑가능하게하
	System.out.println("메뉴를 고르세요");
	//단둔 메뉴고르세요 문장생성
	System.out.print("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원)>> : ");
	//메뉴 생성을 위한 종류 문장
	int fae= sc.nextInt();
	//원하는 종류 결정하기
	int change=(num);
	if(num==1) {
		
	}else if(num==2) {
		
	}if(num==3) {
		
	}
	System.out.println("잔돈은"+change+ "원입니다.");
	System.out.print("천원 : " + change/1000 +"개");
	System.out.print("오백원 : " +change%1000/500+ "개");
	System.out.println("백원 : " + change%1000%500/100 + "개" );
	//마지막 생성 문장+금액
	
	
	
}
}
