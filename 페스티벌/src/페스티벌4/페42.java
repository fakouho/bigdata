package 페스티벌4;

import java.util.Scanner;

public class 페42 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int e=0;
		System.out.print("행 개수 : ");
		e=sc.nextInt();

		for (int w = e; w >= 0; w--) {
			for (int q = 0; q < w; q++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
