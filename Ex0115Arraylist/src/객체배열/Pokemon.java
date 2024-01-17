package 객체배열;

public class Pokemon {
	//이름,체력,공격력,기술,타입
	
	private String name;
	private int hp;
	private int atk;
	private String skill;
	private String type;
	
	//모든 필드를 초기화 할수 있는 생성자 메소드 생성
	
	
	public Pokemon(String name, int hp, int atk, String skill, String type) {
		
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.skill = skill;
		this.type = type;
	}
	//모든 필드의 getter,setter 메소드 생성
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
