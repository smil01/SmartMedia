import java.util.Scanner;

public class forEx¼÷Á¦3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i = 0, j = 0; i <= num*2; i++) {
			for (int k = 0; k <= j + (num - j) * 2 + 1; k++) {

				System.out.print((k <= j) ? " " : "*");

			}
			System.out.println();
			if (i < num) {
				j++;
			} else {
				j--;
			}
		}
	}

}
