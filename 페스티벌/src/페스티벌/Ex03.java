package �佺Ƽ��;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 2:47:10
 * @content	: ���̵�3(���μ��� ���� ������)
 *
 */

public class Ex03 {

	public static void main(String[] args) {// ���μ� : ������ ���� �Ҽ��� ���ö� ������ �μ�
		// �����
		Scanner scanner = new Scanner(System.in);

		// �Էº�
		System.out.print("���μ� ������ �� ���� �Է��ϼ���. : ");
		int num = scanner.nextInt();
		System.out.print(num + " = ");

		// �ݺ���
		while (true) { // num�� �Ҽ����� Ȯ�� -> �Ҽ��� �ƴ϶�� ������ �� ��� -> ���� ���� num���� -> num�� �Ҽ��� �ɶ�����
			int count = 0;

			for (int i = 2; i < num; i++) {// 1�� �ڱ� �ڽ��� ������ 0�� �� �׷��� 2���� �����ؼ� �ڱ��ڽ� ������ �ݺ��ϰ� ��
				if (num % i == 0) { // �������� ���⶧���� �Ҽ��� �ƴ�
					System.out.print(i + " * "); // ������ �� ���
					num = num / i; // ���� ���� num����
					break;
				}
				count++; // �Ҽ� �Ǻ��� ����
			}

			if (count == num - 2) { // count�� �ڱ��ڽŰ� 1�� ������ ����ŭ ������ �Ҽ���� ����
				System.out.println(num);
				break;
			}
		}

	}

}
