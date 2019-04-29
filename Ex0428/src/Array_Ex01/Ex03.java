package Array_Ex01;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] a = { 7, 10, 5, 1, 3, 75, 44, 35, 94, 15 };
		System.out.println(Arrays.toString(a));

		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			} else if (a[i] < min) { 
				min = a[i];
			}
		}
		System.out.println("���� ū ���� " + max + " �Դϴ�.");
		System.out.println("���� �������� " + min + " �Դϴ�.\n");


		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("���� ū ���� " + a[0] + " �Դϴ�.");
		System.out.println("���� �������� " + a[a.length - 1] + " �Դϴ�.");

	}
}
