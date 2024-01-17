package mp3Player;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 노래를 재생시크는 도구 생성하기 --> MP3Player
		MP3Player mp3 = new MP3Player();
		String comPath = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\JavaStudy\\\\Ex0115Arraylist\\\\player\\\\"; // <-- 이상태로 써도
																											// 되고 역슬레시
																											// 2개씩 지워도됨.
		// 2. 노래 데이터(Music 객체)를 생성(Music 자료형 사용하기)
		// 노래 데이터를 전부 저장하는 ArrayList 생성 이름은 musicList
		ArrayList<Music> musicList = new ArrayList<Music>();

		Music m1 = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");
		musicList.add(m1);
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가 될수 있게", "Day6", 185, comPath + "한페이지가될수있게.mp3"));

		// IAM/아이브/198/경
		// LoveLee/악동뮤지션/200/경로
		// Smoke/다이나믹듀오/210/경로
		// 한페이지가 될수 있게/Day6/185/경로

		System.out.println("=============연재의 MP3플레이어=============");
		int i = 0; // 몇번째 곡인지 기억하고 있는 변수

		while (true) {

			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("재생");
				// 1.재생중인 노래가 있는지 여부를 판단
				if (mp3.isPlaying()) {
					// 2.재생중인 노래가 있다면 노래 멈추기
					mp3.stop();
				}
				// 3.musicList의 0번방에 잇는 노래 재생
				// 노래를 재생하기 위해서 필요한 데이터?
				// 노래의 주소가 필요함
				mp3.play(musicList.get(i).getPath());
				// 4. 가수 - 노래제목 이 재생중입니다.출력
				System.out.println(musicList.get(i).getSinger() + "-" + musicList.get(i).getTitle() + "이 재생중입니다.");
//===================================================================================================================				

			} else if (input == 2) {
				System.out.println("정지");
				// 1. 노래가 재생중인지 여부 판단]
				if (mp3.isPlaying()) {
					mp3.stop();
					// 2. 재생중이라면 노래를 멈추고
					// "노래재생을 정지합니다"
					System.out.println("노래재생을 정지합니다.");
				} else {
					// 3.재생중이 아니라면
					// "재생중이 노래가 없습니다."츨력
					System.out.println("재생중인 노래가 없습니다.");
				}
//===================================================================================================================	

			} else if (input == 3) {
				System.out.println("이전곡");
				// 1. 노래가 재생중인지 여부 확인
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				i--;
				if (i > -1) {
					// 3. musicList 이전곡 재생
					mp3.play(musicList.get(i).getPath());
					System.out.println(musicList.get(i).getSinger() + "-" + musicList.get(i).getTitle());
					// 4. 현재 재생중인 노래 출력하기
				} else {
					System.out.println("이전곡이 없습니다.");
					i = 0;
					// 5. 더이상 이전곡이 없을 경우
					// "이전곡이 없습니다.
				}
				// 6. 다시재생을 선택했을 경우
				// musicList의 첫번쨰 곡이 재생되도록 만들기
//===================================================================================================================					

			} else if (input == 4) {
				System.out.println("다음곡");
				// 1. 재생중인 노래가 있는 여부 판단
				if (mp3.isPlaying()) {
					// 2. 재생중이라면 노래를 정지
					mp3.stop();
				}
				// 3. musicList(우리가 만든 ArrayLIst)에서 다음곡 재생
				i++;
				if (i < musicList.size()) {
					mp3.play(musicList.get(i).getPath());
					// 4. 현재 재생중인 노래를 출력하세요
					System.out.println(musicList.get(i).getSinger() + "-" + musicList.get(i).getTitle());
				} else {
					System.out.println("다음곡이 없습니다.");
					i = musicList.size() - 1;
				}
				// 6. 다시 재생을 선택한다면 musucList의 마지막 곡이 재생되게 만들기!
//===================================================================================================================	

			} else if (input == 5) {
				System.out.println("mp3 종료");
				if (mp3.isPlaying()) {
					mp3.stop();
				}
				break;
			} else {
				System.out.println("번호를 잘못입력하셨습니다.");
			}
		}
	}
	private static char[] musicList(Music m1) {
		// TODO Auto-generated method stub
		return null;
	}

}
