import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 5:43:15
 * @content : ����
 *
 */
public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���̸� �������ּ���");
		int age = scanner.nextInt();
		System.out.println("�ο����� �������ּ���");
		int count = scanner.nextInt();

		int t = 5000;
		double tt = 0.5;
		int val = 0;

		if (age > 20) {
			val = t * count;
		} else {
			val = (int) (t * count * tt);
		}

		System.out.println("��" + val + "�� �Դϴ�.");

		scanner.close();
	}

}
