import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 9:38:01
 * @content : ����Ǯ��
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menu = { "�ݶ�", "����", "��Ÿ�ο���" };
		int[] menuPrice = { 800, 500, 1500 };

		System.out.print("�� �Է� >>");
		int coin = scanner.nextInt();
		int choice = 0; // ���� ������ ������ ��ȣ
		int price = 0; // ���� ������ ������ ����
		String title = null; // ���� ������ ������ �̸�
		String yn = null;

		while (true) {
			System.out.println("1.�ݶ�(800), 2.����(500), 3.��Ÿ�ο���(1500)");
			choice = scanner.nextInt(); // �޴� ����

			price = menuPrice[choice - 1];
			title = menu[choice - 1];

			if (coin >= price) {
				System.out.println(title + "���ɴϴ�.");
				coin -= price;
			} else {
				System.out.println("���� �����ϴ�...");
			}

			System.out.println("�ܾ� : " + coin);

			if (coin < menuPrice[1]) {
				break;
			} else {
				System.out.print("��� �Ͻðڽ��ϴ�.");
				yn = scanner.next();

				if (yn.equals("n")) {
					break;
				}
			}
		}
	}
}
