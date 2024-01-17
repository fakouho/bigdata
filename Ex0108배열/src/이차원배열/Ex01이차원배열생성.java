package 이차원배열;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {

		// 이차원배열
		// :배열 안에 또다른 배열이 있는 형태
		// :참조가 2번 일어나는 형태(참조의 참조다)

		// 1. 이차원 배열 선언방법
		// 자료형[][] 여기에 변수명 =new 자려형[행]--[열]ㅣㅣ
		int[][] array = new int[3][3];

		System.out.println(array[0][0]);
		array[1][1] = 5;
		System.out.println(array[1][1]);

		// 이차원배열에 값 넣기(1~9)
		int num = 1;
		for (int j = 0; j < array.length; j++) {
			
			for (int i = 0; i < array.length; i++) { // <--for ctrl 스페이스 2번째
				
				array[j][i] = num++;
			}
		}
		for (int j = 0; j < array.length; j++) {
			
			for (int i = 0; i < array.length; i++) {
				
				System.out.print(array[j][i]+"\t");
			}
			
			System.out.println();
		}
	
		
		
	
//		System.out.print(Arrays.toString(array[0]));
//		System.out.print(Arrays.toString(array[1]));
//		System.out.print(Arrays.toString(array[2]));

	}

}
