package 월급계산프로그램;

import javax.print.DocFlavor.STRING;

public class RegularEmployee extends Employee{
	
	private int bonus;
	
	
	//=======================필드================	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);//상속하는(매개변수)
		this.bonus = bonus;
	}
	//=====================생성자	
	public int getMoneyPay() {
		return (pay+bonus)/12;
		
	}
	

}
