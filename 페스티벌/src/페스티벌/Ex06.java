package �佺Ƽ��;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("�� �ݾ� : ");
		int coin = scanner.nextInt();

		int c_10000, c_5000, c_1000, c_500, c_100;
		System.out.println("�ܵ� : " + coin);

		c_10000 = coin / 10000;
		coin = coin % 10000;

		c_5000 = coin / 5000;
		coin = coin % 5000;

		c_1000 = coin / 1000;
		coin = coin % 1000;

		c_500 = coin / 500;
		coin = coin % 500;

		c_100 = coin / 100;
		
		System.out.println("10000�� : " + c_10000 + "��");
		System.out.println("5000�� : " + c_5000 + "��");
		System.out.println("1000�� : " + c_1000 + "��");
		System.out.println("500�� : " + c_500 + "��");
		System.out.println("100�� : " + c_100 + "��");
	}

}
