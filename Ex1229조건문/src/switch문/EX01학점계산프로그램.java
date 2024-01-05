package switch문;

import java.util.Scanner;

public class EX01학점계산프로그램 {
public static void main(String[] args) {\
	//1.입력 도구 꺼내오기
	Scanner sc = new Scanner(System.in);
//2. 입력 받기
	System.out.print("점수 입력 : ");
	
	int totalScore = sc.nextInt();
	//3. 학점계산-->switch문으로
	switch (totalScore/10) {
	//토탈을 10으로 나온 숫자가 9,8,7,6D
	case 10:
	case 9:
	System.out.println("A학점입니다.");
	break;
	case 8:
	System.out.println("B학점입니다.");
	break;
	case 7:
	System.out.println("C학점입니다.");
	break;
	default:
		System.out.println("D학점입니다.");
		break;
	
	}
	
}
}
//switch(totalScore/10) {
//case 10:
//	
//case 9:
//	grade = 'a';
//	break;
//case 8:
//	grade = 'b';
//	break;
//case 7:
//	grade = 'c';
//	break;
//default:
//	grade = 'd';
//	break;
//	
//	
//}
//Systema.out.println(grade +"학점입니다.");