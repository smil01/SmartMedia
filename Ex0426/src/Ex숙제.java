import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 5:01:21
 * @content : ����
 *
 */
public class Ex���� {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int �ݶ� = 800, ���� = 500, ��Ÿ�ο��� = 1500, õ�� = 0, ����� = 0, ��� = 0;
		System.out.print("�� �Է� >>");
		int �� = scanner.nextInt();

		while (�� >= Math.min(Math.min(�ݶ�, ����), ��Ÿ�ο���)) {
			boolean flg = false;
			System.out.print("1.�ݶ�(" + �ݶ� + "), 2.����(" + ���� + "), 3.��Ÿ�ο���(" + ��Ÿ�ο��� + ") >>");
			switch (scanner.nextInt()) {
			case 1:
				if (�� >= �ݶ�) {
					�� -= �ݶ�;
				} else {
					flg = true;
				}
				break;
			case 2:
				if (�� >= ����) {
					�� -= ����;
				} else {
					flg = true;
				}
				break;
			case 3:
				if (�� >= ��Ÿ�ο���) {
					�� -= ��Ÿ�ο���;
				} else {
					flg = true;
				}
				break;
			}

			if (flg) {
				System.out.println("��! ������!! �� �� ���� �³�!!");
			}

			System.out.println("�ܾ� : " + ��);
			if (�� <= Math.min(Math.min(�ݶ�, ����), ��Ÿ�ο���)) {
				break;
			}

			System.out.print("��� �Ͻðڽ��ϱ�? (y/n)");
			String YesorNo = scanner.next();
			if (YesorNo.equals("n")) {
				break;
			}
		}

		System.out.println("�ܵ� : " + ��);
		õ�� = �� / 1000;
		�� = �� % 1000;
		����� = �� / 500;
		��� = (�� % 500) / 100;
		System.out.println("õ�� : " + õ�� + ", ����� : " + ����� + ", ��� : " + ���);
	}

}