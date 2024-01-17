package 이차원배열;

import java.util.Iterator;

public class Ex03이차원배열예제 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int num = 21;
		for (int j = 0; j < array.length; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++;
				}
			}
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i]+"\t");
			}
			System.out.println();

		}

	}

}
