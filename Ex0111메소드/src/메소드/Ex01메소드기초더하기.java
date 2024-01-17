package 메소드;

public class Ex01메소드기초더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기 (main영역 안쪽에서 사용)
		double result = addDubble(4.2, 3.14); //<--더블
		System.out.println(result);           //<-- int
		System.out.println(sumNum(7,3));
		printHello();
		
	}
	//3. "hello World5번 출력하기
	public static void printHello() {       //<--void는 리턴없이
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
		System.out.println("hello World");
	}
	
	

	// 2.빼기를 수행하는 메소드 생성
	// 리턴타입 : int/매개변수 : int 2개/메소드명:sumNum
	// 매개변수로 받아온 데이터 두개를 뺀 결가값을 돌려주는 메소드
	// 단. 큰수에서 작은 수를 뺸 결과를 돌려주기
	public static int sumNum(int num1,int num2) {
		int result=0;
		// 삼항연산자
		// 조건식 ? 실행문(조건식이 참일 때) : 실행문2(조건식이 거짓일 때)
		result=num1 > num2 ? num1-num2: num2-num1;
		return result;
		}

	// 1. 메소드 생성(main 영역 벗어나서 작성하기)
	// static= 자바에 있는 저장공간 중 하나로 제일먼저 실행되는 공간
	// 리턴타입 double/ 매개변서 :2개 double/메소드 명 : addDdouble
	public static double addDubble(double num1, double num2) {
		// 메소드는 return을 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드를 작성할 것
		double result = num1 + num2;
		return result;
	}

}
