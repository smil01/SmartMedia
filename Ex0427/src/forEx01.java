import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 3:08:50
 * @content : �ݺ���
 *
 */
public class forEx01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 3; i <= 100; i += 3) {
			if (i % 5 == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		System.out.print("���� �Է� >> ");
		int num = scanner.nextInt();

		for (int i = num; i <= num * 10; i += num) {
			System.out.print(i + " ");
		}

		scanner.close();
	}

}
