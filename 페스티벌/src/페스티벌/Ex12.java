package �佺Ƽ��;

import java.util.Scanner;
/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 5:12:53
 * @content	: ���̵�2
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�ִ� ����� & �ּ� ����� ���ϱ�");
		System.out.print("���� 1 �Է� >>");
		int num = scanner.nextInt();
		System.out.print("���� 2 �Է� >>");
		int num2 = scanner.nextInt();

		if (num < num2) {
			int temp = num;
			num = num2;
			num2 = temp;
		}
		int temp = num;
		int temp2 = num2;

		int result = 1;
		while (result > 0) {
			result = num % num2;
			num = num2;
			num2 = result;
		}

		int GCD = num; // �����
		int LCM = temp * temp2 / num; // �����

		System.out.println("�ִ� ����� : " + GCD);
		System.out.println("�ּ� ����� : " + LCM);
	}

}
