package for문;

public class Ex06곱셈누적77 {

	public static void main(String[] args) {
		int ib = 0;
		int num=1;
		for(int i= 77; i>0; i--) {
			//i=77~1 num=1~77
			ib= ib+(i*num);
			num++;
			
			
		}
		System.out.println(ib);

	}

}
