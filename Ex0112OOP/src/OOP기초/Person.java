package OOP기초;

public class Person {
	// 설계도, 나만의 자료형 설계도면!!
	// 1.클래스의 구성 (field,속성,data)
	// 이름, 나이, 성별
	String name;
	int age;
	String gender;

	// 2.행동(method(행위, 기능, 로직)
	public void eat() {
		System.out.println("먹다.");
	}

	public void talk() {
		System.out.println("말하다.");
	}
}
