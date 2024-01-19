package model;

public class MemberDTO {
	
	//Model 역할
	// DTO -> Data Transfer Object-->getter 메소드로 가져오기만 
	// VO -> Value Object --> getter,setter 메소드
	
	// 1. 필드(아이디,비밀번호,이름,나이,점수)
	private String id;
	private String pw;
	private String name;
	private int age;
	private int score;
		
		// 2. 메소드(모든 매개변수를 받는 생성자 1개,getter메소드)
		public MemberDTO(String id, String pw, String name, int age, int score) {
			super();
			 this.id = id;
			this.pw = pw;
			this.name = name;
			this.age = age;
			this.score = score;
		}
		
		public String getId() {
			return id;
		}
		public String getPw() {
			return pw;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public int getScore() {
			return score;
		}
		
		

}
