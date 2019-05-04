package MP3;

public class mp3VO {
	private String songName;
	private String singer;
	private String path;

	public mp3VO(String songName, String singer, String path) {
		this.songName = songName;
		this.singer = singer;
		this.path = path;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String toString() {
		return songName + "/" + singer;
	}

}
