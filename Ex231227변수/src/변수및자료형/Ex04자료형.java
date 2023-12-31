package 변수및자료형;

public class Ex04자료형 {

	public static void main(String[] args) {
		
		//자바의 기본 자료형
		//1. 논리 자료형 : boolean(1byte)
		//-->> 참 또는 거짓을 저장하는 자료형
		//참이라는 데이터를 저장하는 bool이라는 변수 선언
		boolean bool = true;
		bool = false;
		System.out.println(bool);
		
		//2. 문자 자료형 : char(2byte)
		// : 다옴표를 사용해서 작성하고, 한글자만 들어갈수 있다.
		char name = '과';
		System.out.println(name);
		
		//문자열 자료형(기본자료형아닌것)
		// String : 쌍따옴표를 이용해서 작성하며 여러글자 들어갈수 있음
		String name2 = "진주강";
		System.out.println(name2);
		
		//3)정수형 타입 : byte(1) short(2) int(4) long(8)
		//-->> 데이터의 크기가 의미하는 것은 표현할수 잇는 범위!
		// 정수 작성시 java는 기본적으로 int로 인식한다.
		
		//1. 강제 형변환(명시적 형변환)
		// : 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용하는 형 변환이다.
		// 데이터 손실이 발생할수 잇기 때문에 정확하게 ()를 사용하여
		// 손실이 일어나도 괜찮다고 명시해주는 방식이다.
		
		byte num1 = (byte) 128;
		
		//2. 자동 형변환(묵시적 형변환)
		// : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형 변환
		long num2 = 1000;
		
		System.out.println(num1);
		System.out.println(num2);
		
		//4) 실수형(소수점 까지 표시)
		//float(4), double(8) >>double을 더욱 많이 사용함
		//3.14라는 데이터를 담는 double 형태의 변수 num3를 선언
		
		double num3 = 3.14;
		float num4 = (float) 3.14;
		float num5 = 3.14f;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
