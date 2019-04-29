package Array_Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// �ʱ� �����
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		// �Էº�
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �Է�>>");
			arr[i] = sc.nextInt();
		}

		// �Է¹��� �� �״�� ��º�
		System.out.print("�Էµ� ����:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();

		// �ִ밪, �ּҰ�, ���� �����
		int max = arr[0];
		int min = arr[0];
		int sum = 0;

		// �ִ밪, �ּҰ�, ���� ����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}

			sum += arr[i];
		}
		
		// ��� ���� �� ����
		float avg = (float)sum / arr.length;
		
		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);
		System.out.println("��   �� : " + sum);
		System.out.println("��   �� : " + avg);
	}

}
