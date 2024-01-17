package 학생정적관리프로그램;

public class StudenMain {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("임경남");
		stu1.setNumber("20220458");
		stu1.setAge(20);
		stu1.setScoreJava(90);	
		stu1.setScoreWeb(25);
		stu1.setSroreAndroid(50);
		//이름, 자바점수 출력
		System.out.println(stu1.getAge());
		System.out.println(stu1.getScoreJava());
	
		
		//Student 자료형 stu2 객세 생성
		Student stu2 =new Student("임경남","20242222",19);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// ****생성자(Constructor)****
		

	}

}
