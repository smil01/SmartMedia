import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.print("야구 게임 자리수 결정 >> ");
		int game = scanner.nextInt();
		
		int[] arr = new int[game];

		for (int i = 0; i < arr.length; i++) {
			int var = -1;
			for (int j = 0; j < arr.length; j++) {
				if (j == 0) {
					var = random.nextInt(game) + 1;
				}

				if (arr[j] == var) {
					j = -1;
				}
			}
			arr[i] = var;
		}

		System.out.print("생성된 랜덤수 : ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();

		while (true) {
			int[] arr2 = new int[game];
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(i + 1 + "번째 숫자 입력 : ");
				arr2[i] = scanner.nextInt();
			}

			int s = 0, b = 0;

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr2[j]) {
						if (i == j) {
							s += 1;
						} else {
							b += 1;
						}
					}
				}
			}

			if (s == arr.length) {
				System.out.println(arr.length + "스트라이크 아웃!");
				break;
			} else {
				System.out.println(s + "스트라이크, " + b + "볼");
			}
		}

	}
}
