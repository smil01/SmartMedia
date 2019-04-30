package 페스티벌;

import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 3:50:47
 * @content	: 난이도 1
 *
 */
public class Ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("총 금액 : ");
		int coin = scanner.nextInt();

		int c_10000, c_5000, c_1000, c_500, c_100;
		System.out.println("잔돈 : " + coin);

		c_10000 = coin / 10000;
		coin = coin % 10000;

		c_5000 = coin / 5000;
		coin = coin % 5000;

		c_1000 = coin / 1000;
		coin = coin % 1000;

		c_500 = coin / 500;
		coin = coin % 500;

		c_100 = coin / 100;

		System.out.println("10000원 : " + c_10000 + "개");
		System.out.println("5000원 : " + c_5000 + "개");
		System.out.println("1000원 : " + c_1000 + "개");
		System.out.println("500원 : " + c_500 + "개");
		System.out.println("100원 : " + c_100 + "개");
	}

}
