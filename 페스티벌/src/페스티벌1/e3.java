package 페스티벌1;

import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int num2 = 0;
		int num3 =num%10;
		int num4 = num/10;
		
		if(5>num3) { System.out.println("반올림 수 : "+num4*10);
		
		} else {System.out.println("반올림 수 : "+(num4*10 +10));
			
		

	}

}
}
