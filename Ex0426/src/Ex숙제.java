import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 26.
 * @time : 오후 5:01:21
 * @content : 문제
 *
 */
public class Ex숙제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int 콜라 = 800, 생수 = 500, 비타민워터 = 1500, 천원 = 0, 오백원 = 0, 백원 = 0;
		System.out.print("돈 입력 >>");
		int 돈 = scanner.nextInt();

		while (돈 >= Math.min(Math.min(콜라, 생수), 비타민워터)) {
			boolean flg = false;
			System.out.print("1.콜라(" + 콜라 + "), 2.생수(" + 생수 + "), 3.비타민워터(" + 비타민워터 + ") >>");
			switch (scanner.nextInt()) {
			case 1:
				if (돈 >= 콜라) {
					돈 -= 콜라;
				} else {
					flg = true;
				}
				break;
			case 2:
				if (돈 >= 생수) {
					돈 -= 생수;
				} else {
					flg = true;
				}
				break;
			case 3:
				if (돈 >= 비타민워터) {
					돈 -= 비타민워터;
				} else {
					flg = true;
				}
				break;
			}

			if (flg) {
				System.out.println("마! 돈없다!! 돈 더 가져 온나!!");
			}

			System.out.println("잔액 : " + 돈);
			if (돈 <= Math.min(Math.min(콜라, 생수), 비타민워터)) {
				break;
			}

			System.out.print("계속 하시겠습니까? (y/n)");
			String YesorNo = scanner.next();
			if (YesorNo.equals("n")) {
				break;
			}
		}

		System.out.println("잔돈 : " + 돈);
		천원 = 돈 / 1000;
		돈 = 돈 % 1000;
		오백원 = 돈 / 500;
		백원 = (돈 % 500) / 100;
		System.out.println("천원 : " + 천원 + ", 오백원 : " + 오백원 + ", 백원 : " + 백원);
	}

}