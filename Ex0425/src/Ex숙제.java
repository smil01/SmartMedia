import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 5:54:06
 * @content : ����
 *
 */
public class Ex���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("����� ��ǰ ������ �Է��ϼ���");
		int count = scanner.nextInt();
		double discount = 0.9;
		int value = 10000;
		int total = 0;

		if (count > 10) {
			total = (int) (value * count * discount);
		} else {
			total = value * count;
		}

		System.out.println("������ " + total + "�� �Դϴ�");
	}

}
