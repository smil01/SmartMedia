package Array_Ex01;

import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 29.
 * @time : ���� 6:35:40
 * @content : ����
 *
 */

public class Ex���� {

	public static void main(String[] args) {
		// �����
		Scanner scanner = new Scanner(System.in);
		int size = 10;
		int[] arr = new int[size];

		// �Էº�
		for (int i = 0; i < size; i++) {
			System.out.print(i + 1 + "�� ° ���� �Է� >>");
			arr[i] = scanner.nextInt();
		}

		// ��º�
		System.out.print("3�� ��� : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] % 3 == 0 ? arr[i] + " " : "");
		}

		scanner.close();
	}

}
