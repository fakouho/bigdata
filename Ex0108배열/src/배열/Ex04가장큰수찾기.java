package 배열;

import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] soo = new int[5];
		int a = 0;

		System.out.print("배열안에 들어 있는 값 : ");
		for (int i = 0; i < soo.length; i++) {
			soo[i] = ran.nextInt(10);
			System.out.print(+soo[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			a = soo[0];
			if (a < soo[i]) {
				a = soo[i];
			}
		}

		System.out.println("가장 큰 값은 " + a);

	}

	}

////1.정수형 데이터 5개를 저장하는 배열선언
//int[] array=new int[5]
////2.랜덤한 숫자로 배열 초기화하기(1~10)
//Random ran = new Random();
//for(int i = 0;i<array.length;i++)
//{array[i] = ran.nextInt(10)+1;}
////3.가장 큰 수를 선언하는 변수 max 선언
//for(int i =0; i<array.length; i++){int max=0;
////4. max와 배열 안에 들어있는 값 비교하기(0부터)
////5. 만약 배열안에 들어있는 값이 max보다 크다면
////   max를 배열안에 있는 값으로 변경하기
//if(array[i]>max) {max=array[i];}}
////6. 배열안의 모든 값 출력하기
//private void syso("배열 안에 들어있는 값 :" + Arrays.tostring(array)); {
//	
//}
////7. 가장 큰 값 출력하기
//System.out.printIn("가장 큰 값은"+max+)