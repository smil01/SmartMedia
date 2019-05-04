package OOP;

import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 5. 3.
 * @time : 오후 2:51:38
 * @content : 저금통
 *
 */
public class CoinBank_main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CoinBank ATM = new CoinBank();

		int menu = 0;

		do {
			System.out.print("[1]저금 [2]인출 [3]금액확인 [4]종료 >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("저금할 금액을 입력하세요 >> ");
				ATM.deposit(scanner.nextInt());
				break;
			case 2:
				System.out.print("출금할 금액을 입력하세요 >> ");
				ATM.withdraw(scanner.nextInt());
				break;
			case 3:
				System.out.println("현재 잔액은" + ATM.showMoney() + "원 입니다.");
				break;
			}
		} while (menu != 4);

		System.out.println("종료합니다.");

		scanner.close();
	}

}
