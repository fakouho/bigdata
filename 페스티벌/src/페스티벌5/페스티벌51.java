package 페스티벌5;

import java.util.Random;

public class 페스티벌51 {

	public static void main(String[] args) {
		int[] array = new int[8];
		Random ran = new Random();
		// int num = ran.nextInt(100) + 1; //여기다 랜수를변수를 느면 하나만 고정된다
		System.out.print("배열안에 있는 모든 값 : " + " ");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int a = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (a < array[i]) {
				a = array[i];
			}
		} System.out.println("가장 큰 값 :"+a);
		int b = array[0];
		for (int i = 0; i < array.length; i++) {
			if(b>array[i]) {
				b=array[i];
			}
			
		}System.out.println("가장 작은 값 :"+b);
	}

}
