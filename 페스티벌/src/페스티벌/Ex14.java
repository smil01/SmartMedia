package �佺Ƽ��;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 1:56:58
 * @content	: ���̵� 3
 *
 */

public class Ex14 {

	public static void main(String[] args) {
		// �����
		Random random = new Random();

		// �Էº�
		int size = 8;

		// ���� �����
		int[] arr = new int[size]; // �Է��� ������ ��ŭ�� �迭�� ����

		// �ݺ���
		for (int i = 0; i < size; i++) {
			int num = random.nextInt(45) + 1; // ������ �̱�
			boolean set = true; // �ߺ� ���� �ľ�
			for (int j = 0; j < size; j++) { // �迭�� ���ۺ��� ������ �ߺ����� �ִ��� Ȯ��
				if (arr[j] == num) { // ���� �ߺ����� ���� �Ѵٸ� set�� false�� �ؼ� �迭�� ���� ������ְ� �ϰ�,
					i--; // ���� �������� ������ arr[i]�迭�� ���� �ٽ� �̰� �ϱ����� --��(���� i�� 2���ٸ� �ι�° �ݺ����� ������ �ڵ����� 1�� �����ϱ⶧���� --�� ����)
					set = false;
					break; // �ϳ��� �ߺ����� �־��⶧���� Ž���� �����ϰ� �ٽ� �������� �̰� �ϱ� ���� ����
				}
			}

			if (set) { // ���۰� �����ϰ� set�� true��� �ߺ����� ���°����� �Ǻ�
				arr[i] = num;
			}
		}

		// ��º�
		System.out.print("�迭�� �ִ� ��� �� : ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.println("���� ū �� : " + arr[size - 1]);
		System.out.println("���� ������ : " + arr[0]);
	}

}
