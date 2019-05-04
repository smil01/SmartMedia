package MP3;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class mp3Controller {
	private ArrayList<mp3VO> list = new ArrayList<mp3VO>();
	private MP3Player mp3 = new MP3Player();
	private int index = 0;

	public mp3Controller() {
		list.add(new mp3VO("����", "���", "D:\\mp3\\bangbangbang.mp3"));
		list.add(new mp3VO("������", "��ũ������", "D:\\mp3\\brothercar.mp3"));
		list.add(new mp3VO("ġ�����", "Ʈ���̽�", "D:\\mp3\\cheerup.mp3"));
		list.add(new mp3VO("���ȹ���", "����", "D:\\mp3\\daddy.mp3"));
		list.add(new mp3VO("����", "���座��", "D:\\mp3\\dumbdumb.mp3"));
		list.add(new mp3VO("���̽�ũ������", "���座��", "D:\\mp3\\icecreamcake.mp3"));
		list.add(new mp3VO("�̷��Ÿ� �׷�������", "��ƿ�", "D:\\mp3\\no.mp3"));
		list.add(new mp3VO("�ľƾƾƾ�Ƽ", "�ҳ�ô�", "D:\\mp3\\party.mp3"));
		System.out.println("===============����===============");
	}

	public void menu() {
		System.out.print("[1]���  [2]������  [3]������  [4]���  [5]����  [6]����  >> ");
	}

	public void insertMusic(mp3VO vo) {
		list.add(vo);
	}

	public void deletMenu() {
		System.out.print("���� ��Ű�� ���� �� ��ȣ >>");
	}

	public void deletMusic(int index) {
		list.remove(index);
	}

	public void getMusicList() {
		System.out.println("=============���Ǹ���Ʈ=============");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + ". " + list.get(i).toString());
		}
		System.out.println("=============���Ǹ���Ʈ=============");
	}

	public void play() {
		stop();

		System.out.println("������������");
		System.out.println("��     �� ��     ��");
		System.out.println("������������ ��� >> " + list.get(index).getSongName() + " - " + list.get(index).getSinger());
		System.out.println("������������");
	}

	public void previous() {
		indexCheck();

		play();

		index--;
	}

	public void next() {
		indexCheck();

		play();

		index++;
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
		System.out.println("===============����===============");
	}

}
