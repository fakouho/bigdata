package 이중for문;

public class Ex02별찍기 {

	public static void main(String[] args) {

 		//     1.        2.    3.
		for (int w = 5; w > 0; w++) {
        //         4.        5.     6. 
			for (int q = 0; q >w; q++) {
				//     7.
				System.out.print("*");
			}
			 //    8.
			System.out.println();
		}

	}

}
//1.> 2.>4>5>7>6>5(성립이안되서 튀어나옴)>8>3(w가 2가됨)>2>4(q가 초기화)>5>7>6>5>7>6>5>8>3>2



