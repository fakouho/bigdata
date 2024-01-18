package 월급계산프로그램;

public class TempEmployes extends Employee {
	
	//==필드
	public TempEmployes(String empno, String name, int pay) {
		super(empno, name, pay);//상속하는(매개변수)
		
	}
	//==생성자
	
	//==초기화 메소드
	public int getMoneyPay() {
		return pay/12;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
