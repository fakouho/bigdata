package 페스티벌1;

import java.util.Scanner;

public class e2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int cong=sc.nextInt();
		System.out.println("잔돈 : "+cong+"원");
		int man=cong/10000;
		System.out.println("10000원 : "+man+"개");
		int chun=(cong-man*10000)/5000;
		System.out.println("5000원 : "+chun+"개");
		int hun=(cong-(man*10000+chun*5000))/1000;
		System.out.println("1000원 : "+hun+"개");
		int oh=(cong-(man*10000+chun*5000+hun*1000))/500;
		System.out.println("500원 : "+ oh + "개");
		int be=(cong-(man*10000+chun*5000+hun*1000+oh*500))/100;
		System.out.println("100원 : "+be + "개");
		
		
		
		


	}

}
