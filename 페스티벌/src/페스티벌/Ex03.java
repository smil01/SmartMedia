package 페스티벌;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 2:47:10
 * @content	: 난이도3(소인수가 먼지 몰랐음)
 *
 */

public class Ex03 {

	public static void main(String[] args) {// 소인수 : 나눠서 몫이 소수가 나올때 까지의 인수
		// 선언부
		Scanner scanner = new Scanner(System.in);

		// 입력부
		System.out.print("소인수 분해할 할 수를 입력하세요. : ");
		int num = scanner.nextInt();
		System.out.print(num + " = ");

		// 반복부
		while (true) { // num이 소수인지 확인 -> 소수가 아니라면 나눠진 수 출력 -> 나눈 몫은 num으로 -> num이 소수가 될때까지
			int count = 0;

			for (int i = 2; i < num; i++) {// 1과 자기 자신은 나누면 0이 뜸 그래서 2부터 시작해서 자기자신 전까지 반복하게 함
				if (num % i == 0) { // 나머지가 없기때문에 소수가 아님
					System.out.print(i + " * "); // 나눠진 수 출력
					num = num / i; // 나눈 몫은 num으로
					break;
				}
				count++; // 소수 판별을 위해
			}

			if (count == num - 2) { // count가 자기자신과 1을 제외한 값만큼 나오면 소수라고 판정
				System.out.println(num);
				break;
			}
		}

	}

}
