package Array_Ex01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "��° ���� �Է� : ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("�Է��� ���ڴ� : ");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
	}

}
