package poketGame;

import java.util.Scanner;

public class pokemonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 실행공간
		// 두마리 포켓몬 생성(객체 생성)

		// 메타몽/노멀/변신하기/hp:80/atk:10
		Pokemon meta = new Pokemon("메타몽", 80, 10, "변신하기", "노말"); // <--객체생성
		// 피카츄/전기/백만볼트/hp:100/atk:15
		Pokemon pika = new Pokemon("피카츄", 100, 15, "백만볼트", "전기"); // 객체 생성시 메소드의 순서대로 생성해야한다.

		while (true) {
			System.out.println("포켓몬을 선택하세요 : ");
			System.out.print("[1]메타몽  [2]피카츄 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("공격을 선택하세요");
				System.out.print("[1]일반 공격 [2]스킬공격 >>");
				int chioceAtk = sc.nextInt();
				if (chioceAtk == 1) {
					// 메타몽이 피카츄를 일반 공격하겠다.
					//메타몽의 공격력만큼 피카츄의 hp감소.
					pika.setHp(pika.getHp()-meta.getAtk());
					
					System.out.println("현재 피카츄의 Hp는 "+ pika.getHp()+"입니다.");
					System.out.println("현재 메타몽의 Hp는 "+ meta.getHp()+"입니다.");
				} else if (chioceAtk == 2) {
					// 메타몽이 피카츄를 스킬 공격하겠다.
					pika.setHp((int)(pika.getHp()-(int)meta.getAtk()*1.5));
					System.out.println(meta.getName()+"!!!"+meta.getSkill());
					System.out.println("현재 피카츄의 Hp는 "+ pika.getHp()+"입니다.");
					System.out.println("현재 메타몽의 Hp는 "+ meta.getHp()+"입니다.");
				}
				
				
			} else if (choice == 2) {
				System.out.print("[1]일반 공격 [2]스킬공격 >>");
				int chioceAtk1 = sc.nextInt();
				if (chioceAtk1 == 1) {
					// 피캬츄가 메타몽를 일반 공격하겠다.
					//피카츄의 공격령 만큼 메타몽의 HP가 감소한다.
					meta.setHp(meta.getHp()-pika.getAtk());
					System.out.println("현재 피카츄의 Hp는 "+ pika.getHp()+"입니다.");
					System.out.println("현재 메타몽의 Hp는 "+ meta.getHp()+"입니다.");
				
				} else if (chioceAtk1 == 2) {
					// 피카츄가 메타몽를 스킬 공격하겠다.
					meta.setHp((int)(meta.getHp()-pika.getAtk()*1.5));
					System.out.println(pika.getName()+"!!!"+pika.getSkill()+"!!!");
					System.out.println("현재 피카츄의 Hp는 "+ pika.getHp()+"입니다.");
					System.out.println("현재 메타몽의 Hp는 "+ meta.getHp()+"입니다.");
				
				}
			}else {
				System.out.println("번호를 잘못 누르셨습니다.");
			}
			// 1.둘중에 한마리의 포켓몬이 0보다 작거나 같을때 프로그램 종료	
			if(pika.getHp()<=0||meta.getHp()<=0) {
				if(pika.getHp()<=0) {
					System.out.println("!!!연약한"+meta.getName()+"이(가) 승리하였습니다!!!!");
				}else {
					System.out.println("!!!인식이 좋은"+pika.getName()+"이(가) 승리하였습니다!!!");
				}
				break;
			}
			// 2.둘중에 누가 승자인지 출력
			//단 포켓몬 설계도는 건들지 말것
			
			
			
		}

	}

}
