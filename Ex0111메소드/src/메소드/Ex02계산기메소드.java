package 메소드;

import java.util.Scanner;

public class Ex02계산기메소드 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc. nextInt();
		System.out.print("정수2 입력 :");
		int num2 = sc. nextInt();
		char op = '+';
		System.out.println();
		System.out.println(cal(num1,num2,op));

	}
	//private이라는 접근 제한자는
	//다른 클래스에서는 접근이 불가능 하게 막아주는 접근 제한자
	public static int cal(int num1,int num2,char op ) {
		int gab =0;
		//op가 어떤 연산자가 들있는지 판별
		if(op =='-') {
			return gab=num1>num2?num1-num2:num2-num1;
		}else if(op == '+') {
			return gab=num1+num2;
		}else if(op == '*') {
			return gab=num1*num2;
		}else if(op == '/') {
			return gab=num1/num2;
		}else {
			//조건에 맞지않는 연산자가 들어왔을 때 보내줄 결과값도 작성해야
			return 0;
		}
		
		
	}
}

	
