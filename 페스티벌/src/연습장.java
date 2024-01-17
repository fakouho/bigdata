import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class 연습장 {

	public static void main(String[] args) {
		for (int i = 4; i >=0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		
		
	}

}
