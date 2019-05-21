package MP3;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class mp3Controller {
	private ArrayList<mp3VO> list = new ArrayList<mp3VO>();
	private MP3Player mp3 = new MP3Player();
	private int index = 0;

	public mp3Controller() {
		list.add(new mp3VO("뱅뱅뱅", "빅뱅", "D:\\mp3\\bangbangbang.mp3"));
		list.add(new mp3VO("오빠차", "인크레더블", "D:\\mp3\\brothercar.mp3"));
		list.add(new mp3VO("치어어얼업", "트와이스", "D:\\mp3\\cheerup.mp3"));
		list.add(new mp3VO("나팔바지", "싸이", "D:\\mp3\\daddy.mp3"));
		list.add(new mp3VO("덤덤", "레드벨벳", "D:\\mp3\\dumbdumb.mp3"));
		list.add(new mp3VO("아이스크림케익", "레드벨벳", "D:\\mp3\\icecreamcake.mp3"));
		list.add(new mp3VO("이럴거면 그러지말지", "백아연", "D:\\mp3\\no.mp3"));
		list.add(new mp3VO("파아아아아티", "소녀시대", "D:\\mp3\\party.mp3"));
		list.add(new mp3VO("업다운", "EXID", "D:\\mp3\\updown.mp3"));
		list.add(new mp3VO("업타운펑크", "브루노마스", "D:\\mp3\\uptownpunk.mp3"));
		
		System.out.println("===============시작===============");
	}

	public void menu() {
		System.out.print("[1]재생  [2]이전곡  [3]다음곡  [4]목록  [5]삭제  [6]종료  >> ");
	}

	public void insertMusic(mp3VO vo) {
		list.add(vo);
	}

	public void deletMenu() {
		System.out.print("삭제 시키고 싶은 곡 번호 >>");
	}

	public void deletMusic(int index) {
		list.remove(index);
	}

	public void getMusicList() {
		System.out.println("=============음악리스트=============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i).toString());
		}
		System.out.println("=============음악리스트=============");
	}

	public mp3VO play() {
		stop();

		System.out.println("┏━━━━┓");
		System.out.println("┃     ∩ ∩     ┃");
		System.out.println("┃┗━━┛┃ 재생 >> " + list.get(index).getSongName() + " - " + list.get(index).getSinger());
		System.out.println("┗━┳┳━┛");
		
		mp3.play(list.get(index).getPath());
		
		return list.get(index);
	}

	public mp3VO previous() {
		indexCheck();

		mp3VO vo = play();

		index--;
		
		return vo;
	}

	public mp3VO next() {
		indexCheck();

		mp3VO vo = play();

		index++;
		
		return vo;
	}

	public void indexCheck() {
		if (index == -1) {
			index = list.size() - 1;
		} else if (index == list.size()) {
			index = 0;
		}
	}

	public void stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}

	public void stopPlayer() {
		stop();
		System.out.println("===============종료===============");
	}

}
