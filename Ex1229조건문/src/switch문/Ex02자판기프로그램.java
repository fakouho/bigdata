package switch문;

import java.util.Scanner;

public class Ex02자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("금액을 입력하세요");
		int gold =sc.nextInt();
		System.out.println("메뉴를 고르세요.");
		System.out.print("1.아우터(700원) 2.이구동성(1000원) 에그몽(500원)>> : ");
		int num=sc.nextInt();
		if(num==1) {
			if(gold>=700) {
				System.out.println("돈이부족해요ㅠㅠ");
				System.out.println("잔돈 : "+gold);
			}
			else {
				System.out.println("잔돈 : " + (gold- 700));
			}
		} else if(num==2) {
			if(gold<1000) {System.out.println("돈이부족해요ㅠㅠ");
			System.out.println("잔돈 : "+ gold);
		}else {
			System.out.println("잔돈 : " + (gold- 1000));
		}
		} else {
			if(gold<500) {System.out.println("돈이부족해요ㅠㅠ");
			System.out.println("잔돈 : "+gold);
		}
			else {
			System.out.println("잔돈 : "+ (gold- 500));
		
		}
		

	}

}
	//int change=money
//int num=sc.nextInt();
//if(num==1) {
//	change =num-700;{
//   if(moeny>=700){ 
//   change=money-700;
//} else if(num==2) {
//	change =num-1000;
//} else if(num==3) {
//	change =num-500;
//
//Systema.out.prin("잔돈은"+num+"원입니다.')
