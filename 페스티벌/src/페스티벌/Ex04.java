package 페스티벌;

import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 3:09:36
 * @content	: 난이도 1
 *
 */

public class Ex04 {

	public static void main(String[] args) {
		// 선언 및 입력부
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int n = scanner.nextInt(); // 현재 몸무게
		System.out.print("목표몸무게 : ");
		int t = scanner.nextInt(); // 목표 몸무게
		int count = 0;

		while (!(n <= t)) { // 현재 몸무게가 목표몸무게에 같거나 낮아지면 정지 조건 ( ! = not = 반전 또는 부정)
			count = count + 1; // 몇주차 인지 카운팅
			System.out.print(count + "주차 감량 몸무게 : ");
			n = n - scanner.nextInt(); // 현재 몸무게에 입력받은 감량무게를 빼서 현재몸무게에 저장
		}

		System.out.println(n + "kg 달성!! 축하합니다.");
	}

}
