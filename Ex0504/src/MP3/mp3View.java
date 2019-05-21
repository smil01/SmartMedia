package MP3;

import java.util.Scanner;

public class mp3View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		mp3Controller mp3Player = new mp3Controller();

		int status = 0;
		do {
			mp3Player.menu();

			status = scanner.nextInt();
			switch (status) {
			case 1:
				mp3Player.play();
				break;
			case 2:
				mp3Player.previous();
				break;
			case 3:
				mp3Player.next();
				break;
			case 4:
				mp3Player.getMusicList();
				break;
			case 5:
				mp3Player.deletMenu();
				mp3Player.deletMusic(scanner.nextInt());
				break;
			}
		} while (status != 6);

		mp3Player.stopPlayer();
		scanner.close();
	}
}
