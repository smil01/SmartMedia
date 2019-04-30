package 페스티벌;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author	: 오대근
 * @date	: 2019. 4. 30.
 * @time	: 오후 1:56:58
 * @content	: 난이도 3
 *
 */

public class Ex01 {

	public static void main(String[] args) {
		// 선언부
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		// 입력부 (고정수 나오면 사용하지 않아도 됨)
		System.out.print("행운의 숫자 갯수 선택 >>");
		int size = scanner.nextInt();

		// 변수 선언부
		int[] arr = new int[size]; // 입력한 사이즈 만큼만 배열을 만듬

		// 반복부
		for (int i = 0; i < size; i++) {
			int num = random.nextInt(5) + 1; // 랜덤수 뽑기
			boolean set = true; // 중복 여부 파악
			for (int j = 0; j < size; j++) { // 배열의 시작부터 끝까지 중복수가 있는지 확인
				if (arr[j] == num) { // 만약 중복수가 존재 한다면 set을 false로 해서 배열에 값을 못집어넣게 하고,
					i--; // 현재 진행중인 순서의 arr[i]배열의 값을 다시 뽑게 하기위해 --함(현재 i가 2였다면 두번째 반복문이 끝나면 자동으로 1을 증가하기때문에 --로 막음)
					set = false;
					break; // 하나라도 중복수가 있었기때문에 탐색을 종료하고 다시 랜덤수를 뽑게 하기 위한 종료
				}
			}

			if (set) { // 시작과 동일하게 set이 true라면 중복수가 없는것으로 판별
				arr[i] = num;
			}
		}

		// 출력부
		for (int i = 0; i < size; i++) {
			System.out.println("행운의 숫자 : " + arr[i]);
		}
	}

}
