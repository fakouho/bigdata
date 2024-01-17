package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;
		int length = numbers.length;
		System.out.println("배열의 길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화 해주세요
		for (int i = 0; i < numbers.length; i++) { 
			numbers[i] = 5 * (i + 1);
		}
		// 배열의 값을 출력
		for (int j = 0; j < numbers.length; j++) {
			System.out.print(numbers[j]+" ");
		}
		
		System.out.println();
		
		//배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"진주강","나주박","무슨최"};
		//진주강 데이터 출력하기
		System.out.println(names[0]);
		
		
		

	}

}
