package 상속기초;

public class Child extends Parent{
	// 자식클래스, 새로운 클래스, 서브클래스
	// extends : 연장하다, 확장하다 의미!
	
	// 짜장면 만들기
	/**
	 * @author 진주강 
	 * @since 20240117
	 * @return void
	 * @param 매개변수 없음
	 */
	public void makeJjajang() {
		System.out.println("맛있는 짜장면을 만든다!");
	}
	
	
	@Override //어너테이션(annotation): 특정기능을 가지고 있는것은 아니다! ,단순표시
	public void makeJam() {
		System.out.println("맛있는 해물 듬뿍 짬뽕을 만드다 !! 부글부글");
	}
	// 메소드 오버라이딩(method overriding)
	// : 상속이 전제되어 있어야한다.
	// : 부모 클래스가 가지고 있는 메소드의 틀(메소드명, 리턴타입, 매개변수)을 
	// 그대로 가지고 와서 {} 안에 로직만 ***재정의** 하는 기법
	
	
	
	
	
	
	
	

}
