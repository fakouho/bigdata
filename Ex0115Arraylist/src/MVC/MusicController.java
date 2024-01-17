package MVC;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicController {

	// Controller : 기능들을 가지고 있는 도구

	// 1) 필드
	// 사용자마다 MP3Player가 달라지지 않기 때문에 그냥 바로 생성!
	private MP3Player mp3 = new MP3Player();
	private ArrayList<Music> musicList = new ArrayList<Music>();
	private int i = 0; // 몇번째 곡인지 기억하고 있는 변수

	// 2) 메소드
	// 생성자 메소드
	public MusicController() {
		String comPath = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\JavaStudy\\\\Ex0115Arraylist\\\\player\\\\"; // <-- 이상태로 써도
		Music m1 = new Music("HypeBoy", "뉴진스", 180, comPath + "HypeBoy.mp3");
		musicList.add(m1);
		musicList.add(new Music("IAM", "아이브", 198, comPath + "IAM.mp3"));
		musicList.add(new Music("LoveLee", "악동뮤지션", 200, comPath + "LoveLee.mp3"));
		musicList.add(new Music("Smoke", "다이나믹듀오", 210, comPath + "Smoke.mp3"));
		musicList.add(new Music("한페이지가 될수 있게", "Day6", 185, comPath + "한페이지가될수있게.mp3"));
	}

	// 2. 재생하는 메소드
	public Music play(int songN) {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		mp3.play(musicList.get(songN-1).getPath());
		return musicList.get(songN-1);
	}
	// 3. 정지하는 메소드
	public boolean stop() {
		boolean result =false;
		if (mp3.isPlaying()) {
			mp3.stop();
			result=true;
		} 
		return result;
	}
	// 4. 이전곡 재생하는 메소드
	public Music ezun() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		i--;
		if (i > -1) {
			mp3.play(musicList.get(i).getPath());
			return musicList.get(i); 
		} else {
			i = 0;
			return null;
		}
	}
	// 5. 다음곡
	public Music daem() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
		i++;
		if (i < musicList.size()) {
			mp3.play(musicList.get(i).getPath());
			return musicList.get(i);
		} else {
			
			i = musicList.size() - 1;
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
