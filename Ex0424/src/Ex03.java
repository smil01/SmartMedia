import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 24.
 * @time : ���� 4:50:43
 * @content : �ڹ� ���� ����
 *
 */

public class Ex03 {

	public static void main(String[] args) {
		// �� ���� �Է� �޾Ƽ� ���� ����� ���
		// �Էµ� �����, ������ ��m��, ��µ� ��m��.
		// but �Է��� ���ڵ�����
 
		Scanner scanner = new Scanner(System.in);

		System.out.print("ù ��° �� �Է� >>");
		int num = scanner.nextInt();
		System.out.print("�� ��° �� �Է� >>");
		int num2 = scanner.nextInt();

		int result_Add = num + num2;
		int result_Sub = num - num2;
		int result_Mul = num * num2;
		double result_Div = (double) num / num2;

		System.out.println(num + "��" + num2 + "�� ���� >>" + result_Add);
		System.out.println(num + "��" + num2 + "�� ���� >>" + result_Sub);
		System.out.println(num + "��" + num2 + "�� ���� >>" + result_Mul);
		System.out.println(num + "��" + num2 + "�� ���� >>" + result_Div);
	}

}
