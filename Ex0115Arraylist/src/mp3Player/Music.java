package mp3Player;

public class Music {
	// 뮤직플레이어 안에서 사용할 우리만의 음악 자료형
	// 1.필드 설계(노래 데이터의 제목,가수,재생 시간,노래 파일의 위치(주소,경로))
	private String title;
	private String singer;
	private int playTime;
	private String path;

//================================================================
	// 2.메소드
	// 2-1 모든 필드값을 채울수 있는 생성자(art+shift+s)
	// 2-2 모든 필드의 getter 메소드만 만들기
	public Music(String title, String singer, int playTime, String path) {
		super();
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}

}
