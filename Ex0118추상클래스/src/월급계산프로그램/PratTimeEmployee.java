package 월급계산프로그램;

public class PratTimeEmployee extends Employee {
	
	private int workDay;
//==필드
	public PratTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);//상속하는(매개변수)
		
		this.workDay = workDay;
	}
	//===생성자
	
//==메소드 초기화	
	public int getMoneyPay() {
		return pay*workDay;
	}
	
	
	
	
	
	
}
