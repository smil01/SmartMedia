package �佺Ƽ��;

import java.util.Scanner;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 3:09:36
 * @content	: ���̵� 1
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		// ���� �� �Էº�
		Scanner scanner = new Scanner(System.in);
		System.out.print("��������� : ");
		int n = scanner.nextInt(); // ���� ������
		System.out.print("��ǥ������ : ");
		int t = scanner.nextInt(); // ��ǥ ������
		int count = 0;

		while (!(n <= t)) { // ���� �����԰� ��ǥ�����Կ� ���ų� �������� ���� ���� ( ! = not = ���� �Ǵ� ����)
			count = count + 1; // ������ ���� ī����
			System.out.print(count + "���� ���� ������ : ");
			n = n - scanner.nextInt(); // ���� �����Կ� �Է¹��� �������Ը� ���� ��������Կ� ����
		}

		System.out.println(n + "kg �޼�!! �����մϴ�.");
	}

}
