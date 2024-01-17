package 통장관리프로그램;

public class bankMain {
	//실행공간
	public static void main(String[] args) {
		// 1. bankbook 설계도면으로 bank1 생성
		bankbook bank1=new bankbook();
		// System.out.println(bank1.money);
		
		//2.bank1에 1000원 입금
		bank1.deposit(1000);
		//3.bank1에 300원 출금
		bank1.withdraw(300);
		//4.bank1의 잔액 확인
		System.out.println(bank1.showmoney());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
