package �佺Ƽ��;

import java.util.Scanner;

public class Ex32_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		System.out.print("ù �ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String num = scanner.nextLine();

		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += arr[num.charAt(i)-48];
		}
		
		System.out.println("���('-')�� �� �� >> " + sum);
	}

}
