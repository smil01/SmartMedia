package OOP;

import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 5. 3.
 * @time : ���� 2:51:38
 * @content : ������
 *
 */
public class CoinBank_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CoinBank ATM = new CoinBank();

		int menu = 0;

		do {
			System.out.print("[1]���� [2]���� [3]�ݾ�Ȯ�� [4]���� >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("������ �ݾ��� �Է��ϼ��� >> ");
				ATM.deposit(scanner.nextInt());
				break;
			case 2:
				System.out.print("����� �ݾ��� �Է��ϼ��� >> ");
				ATM.withdraw(scanner.nextInt());
				break;
			case 3:
				System.out.println("���� �ܾ���" + ATM.showMoney() + "�� �Դϴ�.");
				break;
			}
		} while (menu != 4);

		System.out.println("�����մϴ�.");

		scanner.close();
	}

}
