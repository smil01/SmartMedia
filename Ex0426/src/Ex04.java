import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 3:10:06
 * @content : while
 *
 */
public class Ex04 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// �Է¹��� ���� 10���� ������ ��� �Է�,
		// 10���� ū���� �Է��ϸ� ���α׷� ����
		while (true) {
			System.out.print("�Է� : ");
			int num = scanner.nextInt();
			if (num > 10) {
				break;
			}
		}

		scanner.close();
	}
}
