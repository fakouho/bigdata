package dowhile문;

import java.util.Scanner;

public class Ex02dowhile예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soo = 1;

		System.out.print("현재몸무게 : ");
		int hunm = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int mogm = sc.nextInt();

		while (true) {
			System.out.print(soo + "주차 감량 몸무게 : ");
			int gam = sc.nextInt();
			soo++;
			hunm -= gam;
			// hunm = hunm-gam;
			if (hunm <= mogm) {
				System.out.println(hunm + "kg 달성!! 축하드립니다!");
				break;
			}
		}

	}

}

//1.입력도구 꺼내오기
//scanner sc =new Scanner(System.in)
//2.현재 몸무게 입력받기
//System.out.print("현재 몸무게:");
//int now=scnext
//3.목표몸무게 입력받기
//system.out.print("목표 몸무게 : "
//int goal=sc.nextInt();
//4.주차별 감량 몸무게 입력받기
//syso("1주차 감량 몸무게 : ");
//int minus =scnext
//5-1. 현재 몸무게 = 원래 몸무게 -감량몸무게
//nuw=num-minus;
//5-2 현재몸무게가 목표 몸무게에 도달했는지 조건판단
//if(now<=goal){
//(syso달성 축하 문장)};
//