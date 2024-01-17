package 페스티벌3;

import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class 페31 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
				System.out.print(i+" ");
				}
			if(i%2==0) {
				sum += -i;
				System.out.print(-i+" ");	
			}
			
		}
		System.out.println("결과 : "+sum);
	}

}
