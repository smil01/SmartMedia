import java.util.Scanner;

public class forEx����2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();

		for (int i = 0, j = 0; i < (num * 2 - 1); i++) {
			for (int k = 0; k < j + num; k++) {
				System.out.print((k < ((num - 1) - j)) ? " " : "*");
			}
			if (i < (num - 1)) {
				j++;
			} else {
				j--;
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
