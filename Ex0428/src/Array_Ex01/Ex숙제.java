package Array_Ex01;

import java.util.Scanner;

/**
 * 
 * @author : 오대근
 * @date : 2019. 4. 29.
 * @time : 오후 6:35:40
 * @content : 숙제
 *
 */

public class Ex숙제 {

	public static void main(String[] args) {
		// 선언부
		Scanner scanner = new Scanner(System.in);
		int size = 10;
		int[] arr = new int[size];

		// 입력부
		for (int i = 0; i < size; i++) {
			System.out.print(i + 1 + "번 째 정수 입력 >>");
			arr[i] = scanner.nextInt();
		}

		// 출력부
		System.out.print("3의 배수 : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] % 3 == 0 ? arr[i] + " " : "");
		}

		scanner.close();
	}

}
