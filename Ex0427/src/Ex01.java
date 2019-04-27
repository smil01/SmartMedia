import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 27.
 * @time : 오전 9:38:01
 * @content : 숙제풀이
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] menu = { "콜라", "생수", "비타민워러" };
		int[] menuPrice = { 800, 500, 1500 };

		System.out.print("돈 입력 >>");
		int coin = scanner.nextInt();
		int choice = 0; // 내가 선택한 음료의 번호
		int price = 0; // 내가 선택한 음료의 가격
		String title = null; // 내가 선택한 음료의 이름
		String yn = null;

		while (true) {
			System.out.println("1.콜라(800), 2.생수(500), 3.비타민워터(1500)");
			choice = scanner.nextInt(); // 메뉴 선택

			price = menuPrice[choice - 1];
			title = menu[choice - 1];

			if (coin >= price) {
				System.out.println(title + "나옵니다.");
				coin -= price;
			} else {
				System.out.println("돈이 없습니다...");
			}

			System.out.println("잔액 : " + coin);

			if (coin < menuPrice[1]) {
				break;
			} else {
				System.out.print("계속 하시겠습니다.");
				yn = scanner.next();

				if (yn.equals("n")) {
					break;
				}
			}
		}
	}
}
