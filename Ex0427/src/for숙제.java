import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 6:20:07
 * @content : ����
 *
 */
public class for���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scanner.close();
	}

}
