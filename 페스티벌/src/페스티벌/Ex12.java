package 페스티벌;

import java.util.Scanner;
/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 5:12:53
 * @content	: 난이도2
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("최대 공약수 & 최소 공배수 구하기");
		System.out.print("숫자 1 입력 >>");
		int num = scanner.nextInt();
		System.out.print("숫자 2 입력 >>");
		int num2 = scanner.nextInt();

		if (num < num2) {
			int temp = num;
			num = num2;
			num2 = temp;
		}
		int temp = num;
		int temp2 = num2;

		int result = 1;
		while (result > 0) {
			result = num % num2;
			num = num2;
			num2 = result;
		}

		int GCD = num; // 공약수
		int LCM = temp * temp2 / num; // 공배수

		System.out.println("최대 공약수 : " + GCD);
		System.out.println("최소 공배수 : " + LCM);
	}

}
