package 페스티벌4;

import java.util.Scanner;

public class 페41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int e = 0;
		System.out.print("행개수 :");
		e = sc.nextInt();

		for (int w = 1; w <= e; w++) {
			for (int q = 0; q < w; q++) {
				System.out.print("*");
			} // inner for (별의 갯수를 찍어주는 for)
			System.out.println();
		} // outer for (별의 갯수를 만족시켜줬을때 줄바꿈을 진행하는 for)

//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

	}
}