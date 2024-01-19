package 월급계산프로그램;

public abstract class Employee {

	// 접근제한자
	// private<<default(패키치내)<<protected(상속)<<public

	protected String empno;
	protected String name;
	protected int pay;
	//필드
	public  Employee(String empno,String name,int pay) {
		this.empno =empno;
		this.name=name;
		this.pay=pay;
	}
	
	public abstract int getMoneyPay();
	// abstract = 중괄호 생략

	public String print() {

		return empno + " " + name + " " + pay;

	}

}
