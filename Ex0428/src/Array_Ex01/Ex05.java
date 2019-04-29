package Array_Ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "번째 숫자 입력 : ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("입력한 숫자는 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

}
