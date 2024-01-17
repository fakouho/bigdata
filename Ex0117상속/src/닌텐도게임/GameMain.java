package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// 게임을 실행하는 공간
		// 게임칩 가지고 오기
		Pokemon p =new Pokemon();
		// 게임칩 끼우기
		insert(p);
		
		//마리오,젤다 칩 가져오기
		Mario m = new Mario();
		insert(m);
		Zelda z = new Zelda();
		insert(z);
		
		
		
		
		
	}
	// 게임칩을 끼우는 기능
	private static void insert(Pokemon game) {
		game.gameStart();
		
	}
	//메소드 오버로딩 활용한 방법
	
	

}
