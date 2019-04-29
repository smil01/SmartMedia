package Array_Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 초기 선언부
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		// 입력부
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 입력>>");
			arr[i] = sc.nextInt();
		}

		// 입력받은 수 그대로 출력부
		System.out.print("입력된 점수:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();

		// 최대값, 최소값, 총합 선언부
		int max = arr[0];
		int min = arr[0];
		int sum = 0;

		// 최대값, 최소값, 총합 계산부
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}

			sum += arr[i];
		}
		
		// 평균 선언 및 계산부
		float avg = (float)sum / arr.length;
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
		System.out.println("총   합 : " + sum);
		System.out.println("평   균 : " + avg);
	}

}
