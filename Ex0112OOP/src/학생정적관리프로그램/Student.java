package 학생정적관리프로그램;

public class Student {
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	private String name;
	private String number;
	private int age;
	private int scoreJaval;
	private int scoreWeb;
	private int scoreAndroid;
	private int scoreJava;
	private int sroreAndroid;
															 //생성자(Constructor) //자동완선 단축키 또한 소스(오른쪽마우스 소스에서 Generate fieleds들어가면됨
															 //--> 객체를 생성하는 숙나에 실행되는 메소드
															 //--> 필드에 있는 데이터를 객체를 생성하는 순간에 초기화(초기값)를
															 //    시켜줄 수 있도록 로직 작성
	public Student(String name, String number, int age) {    //생성자의 특징
		this.name =name;                                     //1. 리턴타입을 지정조차 하지않는다(void도 작성 안함                       
		this.number =number;                                 //2. 생성자의 이름은 클래스 이름과 동일해야한다.(대소문자까
		this.age =age;                                       //3. 생성자도 결국 메소드이다.
	} 													  	 //4. 매개변수가 아무것도 없는 생성자는 기본생성자(default constructor)
															 //   라고 부르는데 생략 가능하다.
															 // 단, 새로운 나만의 생성자를 만들게 되면 기본생성자는 덮어 씌워진다(사라진다)
	public Student() {										 //5. 생성자도 오버로딩(중복정의)가능하다.
	}														 // 오버로딩이란 메소드의 이름과 리턴타입이 동일할떄 매개변수의 개수와 타입을 다르게는 기법


															//2Method
															//getter 메소드
															//---> 클래스 내부에 있는 필드 값을
															//     외부 (다른 클래스)에서 가져갈수 있는  메소드
	public String getName() {
		return name;
	}
															//setter 메소드
															//--> 클래스 내부에 있는 필드 값을
															//    외부 다른 클래스에서 수정할수 있도록 하는 메소드
	public void setName(String name) { 
		this.name = name;
	}
	public String getNumber() {   							//<--밖으로 내볼낼거야 이 객체를 =public+객체의 자료형+get객체
		return number;
	}
	public void setNumber(String number) { 					//<-밖으로 내볼낼떄는 자료형태이며 나가는 set객체(객체 전체이름)
		this.number = number;              					//<--이객체/외부입력코드
	}
	
	public int getAge() {            						//getter,setters 자동완성 단축기//alt shift s//오른쪽마우스 source에도 있다
		return age;                  
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getSroreAndroid() {
		return sroreAndroid;
	}
	public void setSroreAndroid(int sroreAndroid) {
		this.sroreAndroid = sroreAndroid;
	}
	
	
}
