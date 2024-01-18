import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class java페스티벌 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = sc.nextInt();
		String result = "";
		while(n > 0) {
			result =(n % 2) + " " + result;
			n = n / 2;
		}
		System.out.println(result);
		
	
		
	}
}