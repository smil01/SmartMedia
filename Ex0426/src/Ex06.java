import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 3:41:07
 * @content : while�� ����
 *
 */
public class Ex06 {
	public static void main(String args[]) {
		int now = 0, goal = 0, count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("���� ������ : ");
		now = scanner.nextInt();
		System.out.print("��ǥ ������ : ");
		goal = scanner.nextInt();

		while (now > goal) {
			System.out.print(++count + "���� ���� ������ : ");
			now -= scanner.nextInt();
		}

		System.out.println(now + "kg �޼�!! �����մϴ�!");

		scanner.close();
	}
}
