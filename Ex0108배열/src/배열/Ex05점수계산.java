package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int max = 0;
		int pull = 0;
		double x = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력>>");
			array[i] = sc.nextInt();
		}
		System.out.println("입력된 점수 : " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}
		System.out.println("최고 점수 : " + max);
		int b = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < b) {
				b = array[i];
			}
		}
		System.out.println("최저 점수 : " + b);
		for (int i = 0; i < array.length; i++) {
			pull = pull + array[i];
		}
		System.out.println("총합 : " + pull);

		x = (double) pull / (double) array.length;
		System.out.println("평균 :" + x);

	}

}
