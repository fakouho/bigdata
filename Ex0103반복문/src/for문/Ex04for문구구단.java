package for문;

import java.util.Scanner;

public class Ex04for문구구단 {

	public static void main(String[] args) {
		//원하든 단을 입력받아 구구단 출력
		//1.입려도구 꺼내기
		Scanner sc = new Scanner(System.in);
		//2.단 입력받기
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		//3.수 입력받기
		System.out.print("어느수까지 출력 : ");
		int chol = sc.nextInt();
		
		for (int i = 1; i <= chol; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i);
		}

	}

}
