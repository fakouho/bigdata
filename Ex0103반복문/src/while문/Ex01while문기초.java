package while문;

public class Ex01while문기초 {

	public static void main(String[] args) {
		// while문 구조
		// ctrl shift f : 정렬 단축키
		// Hello World! 5번 출력하는 코드를 작성해보자!

		// 반복 횟수를 정해주는 변수num 선언
		int num = 0;
		//num을 0으로 초기화 한다. 변수 선언
		while (num < 5) {
			//while문을 선언하고 num이 5보다 작니 라고 물어본다
			System.out.println("Hello World!!");
			//출력문 생성
			num++;
			//증가 연산자 
		}
		//문장이 닫히면서 다시 위로 올라간다.올라가서 다시 num 수를 증가시키며 5가 되면 종료된다.

	}

}
