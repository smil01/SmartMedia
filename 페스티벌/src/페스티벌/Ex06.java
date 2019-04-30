package Æä½ºÆ¼¹ú;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("ÃÑ ±Ý¾× : ");
		int coin = scanner.nextInt();

		int c_10000, c_5000, c_1000, c_500, c_100;
		System.out.println("ÀÜµ· : " + coin);

		c_10000 = coin / 10000;
		coin = coin % 10000;

		c_5000 = coin / 5000;
		coin = coin % 5000;

		c_1000 = coin / 1000;
		coin = coin % 1000;

		c_500 = coin / 500;
		coin = coin % 500;

		c_100 = coin / 100;
		
		System.out.println("10000¿ø : " + c_10000 + "°³");
		System.out.println("5000¿ø : " + c_5000 + "°³");
		System.out.println("1000¿ø : " + c_1000 + "°³");
		System.out.println("500¿ø : " + c_500 + "°³");
		System.out.println("100¿ø : " + c_100 + "°³");
	}

}
