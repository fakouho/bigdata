package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] lotto = new int[5];
		;
		// 1.로또의 0번방 데이터를 랜덤한 수로 초기화
		
		// 2.로또의 1번방 데이터를 랜덤한 수로 초기화
		// 3.로또의 0번방과 1번방의 값이 같은지 비교
		// --> 같다면 로또 1번방을 랜덤한 숫자 부여
		// 4.로또의 2번방 데이터를 랜덤한 수로 초기화
		
		// 4-1 1번방 2번방과 값이 같은지 비교
		for (int j = 0; j < lotto.length; j++) {
			lotto[j] = ran.nextInt(5) + 1;
			for (int i = 0; i < 1; i++) {
				if (lotto[i] == lotto[j]) {
					j--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));

	}

}
