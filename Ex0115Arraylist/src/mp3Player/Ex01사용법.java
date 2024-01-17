package mp3Player;

import javazoom.jl.player.MP3Player;

public class Ex01사용법 {

	public static void main(String[] args) {

		// jar
		// -> 일종의 java project를 압축해놓은 확장자
		// -> 다른 사람이 개발해놓은 class파일들이 모아저 있는 형태
		// -> 일종의 라이브러리

		// jar 파일 추가하는 법
		// 프로젝트 선텍-> 마우스 우클릭 > blild path -> configure build path
		// -> libraries 탭으로 이동 -> class path 선택 > 우측 있는 add jars 선택
		// -> 원하는 jar파일 추가 후 -> apply and close

		// 노래 재생 가능한 도구 꺼내기
		MP3Player mp3 = new MP3Player();

		// 1. 재생하기
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115Arraylist\\player\\Smoke.mp3");

		// 2. 노래멈추기
		mp3.stop();

		// 3. 노래 재생여부 판단하기
		System.out.println(mp3.isPlaying());

	}

}
