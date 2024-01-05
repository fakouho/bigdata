package 페스티벌2;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int soo= 1;
		System.out.print("현재몸무게 : ");
		int hun = sc.nextInt();
		System.out.print("목표몸무게 :");
		int mog = sc.nextInt();
		while(true) {
			System.out.print(soo+"주차별 감량 몸무게 :");
			int gam= sc.nextInt();
			soo++;
			hun=hun-gam;
			if(hun<mog) {
				System.out.println(hun+ "달성!! 축하드립니다.");
				break;
			}
		}

	}

}
