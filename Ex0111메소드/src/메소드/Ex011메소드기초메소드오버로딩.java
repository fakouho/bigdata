package 메소드;

public class Ex011메소드기초메소드오버로딩 {

	public static void main(String[] args) {
		// 메소드 사용
		// 메소드 오버로딩(중복정의)
		// 메소드 오버로딩은 리턴타입의 매개변수의 개수를 다르게 하고
		// 또는 매개변수의 타입을 다르게 하면 이름을 같이 부여해도 된다.
		System.out.println(add(3.2, 5.2));
		System.out.println(add(3, 5));
		System.out.println(add(3, 5.2));

	}

	// 메소드 오버로딩 성립 조건
	// 1.메소드 이름이 같아야한다.
	// 2.매개변수 개수 또는 자료형(타입)이 달라야한다.
	// 3.매개변수와 메소드이름이 같도 리턴타입만 다른경우는 오버로딩이 아니다.
	
	private static double add(double num1, double num2) {
		return num2 + num1;
	}

	private static int add(int num1, int num2) {
		return num1 + num2;

	}

}
