package 페스티벌;

import java.util.Scanner;

public class Ex32_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		System.out.print("첫 자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = scanner.nextLine();

		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += arr[num.charAt(i)-48];
		}
		
		System.out.println("대시('-')의 총 합 >> " + sum);
	}

}
