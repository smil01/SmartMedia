import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 4:02:31
 * @content : ����
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		int now = 0, goal = 1, count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("���� ������ : ");
		now = scanner.nextInt();
		System.out.print("��ǥ ������ : ");
		goal = scanner.nextInt();

		while (now < goal) {
			System.out.print("�ٽ� �Է��ϼ���.\n��ǥ ������ : ");
			goal = scanner.nextInt();
		}

		while (now > goal) {
			System.out.print(++count + "���� ���� ������ : ");
			now -= scanner.nextInt();
		}

		System.out.println(now + "kg �޼�!! �����մϴ�!");

		scanner.close();
	}

}
