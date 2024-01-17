package 통장관리프로그램;

public class bankbook {
	//통장관리 프로그램을 만든다는 가정
	//통장 설계도면--> 통장을 관리할수 있는 우리만의 자료형 만들기

												// 1.Field(Data,속성)
	private int money;  //<--캡슐화
												// 정보은닉을 지켜주어야 한다.(사용자 임의로 변경하는 것을 막는다.)
	
												// 2.Method(행위,로직,기능)
												//입금하다(deposit)
	public void deposit(int money) {
		this.money=this.money+money;            //money +=num; //this.=필드에 있는 현재 클래스 자체를 의미하는 키워드.
	}
	                                          	//출금하다(withdraw)
	public void withdraw(int money) {
		this.money -=money;
	}
												//잔액확인(showMoney)
	public int showmoney() {
		return money;
	}
	
	
	
	
	
	
	
	
	
	
	

}
