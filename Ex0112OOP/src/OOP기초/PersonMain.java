package OOP기초;

public class PersonMain {
	private Object person2;

	// 실행할 수 있는 공간
	public static void main(String[] args) {

		// 1. 설계도를 기반으로 객체를 생성
		// 자료형 변수명  = new 자료형();
		// 사람자료형을 만들기 변수명은 person
		Person person =new Person();
		System.out.println();
				
		System.out.println(person.name);
		System.out.println(person.age);
		// field에 아무것도 넣어주지 않았을 때는 기본값으로 세팅된다.
		//String은 null 이엇고 int는 0이었다.
		System.out.println(person.gender);
		person.age =25;
		person.name ="진주강";
		person.gender = "남성";
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.gender);
		
		// 하나의 클래스로 여러개의 객체 생성이 가능하다.
		// 여러분 짝궁의 정보 저장하는
		// person2 객체를 생성
		// 짝꿍의 이름, 나이, 성별 저장
		// 전부 출력!
		
	    Person preson2= new Person();
	    preson2.age=19;
	    preson2.name="정대주";
	    preson2.gender="남성";
	    System.out.println(preson2.age);
	    System.out.println(preson2.name);
	    System.out.println(preson2.gender);
	    
	    preson2.talk();
		
		

	}

}
