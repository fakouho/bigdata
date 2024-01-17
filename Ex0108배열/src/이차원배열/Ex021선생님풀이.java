package 이차원배열;

import java.util.Iterator;

public class Ex021선생님풀이 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int num = 21;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
