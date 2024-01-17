package 이차원배열;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02이차원배열예제1 {

	public static void main(String[] args) {
		int[][] array =new int[5][5];
		for (int j = 0; j < array.length; j++) {
			int num=0;
			for (int i = 0; i < array.length; i++) {
				array[i][j]=21+(1*j)+(5*num++);
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}
	
		
		
			}

}
