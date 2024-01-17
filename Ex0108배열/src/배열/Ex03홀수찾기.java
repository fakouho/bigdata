package 배열;

import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Random ran = new Random();
		String hol=" ";
		int count =0;
		

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100)+1;
			if(array[i]%2==1) {
				hol+=array[i]+" "; 
				count++;				
			}
		}
		System.out.println("array에 들어있는 홀수는"+hol+"이며");
		System.out.println("총"+count+"개 입니다.");
		
	}

}
