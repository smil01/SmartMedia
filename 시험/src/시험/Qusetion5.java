package ����;

import java.util.Scanner;

public class Qusetion5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int student_size = 2;
		String[] col_talget = { "java", "web", "and" };
		int[][] arr = new int[4][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i < student_size && j < col_talget.length) {
					if (j == 0) {
						System.out.print(i + 1 + "��°");
					}
					System.out.print(col_talget[j] + " >> ");
					arr[i][j] = sc.nextInt();
				} else if (i < student_size && j == col_talget.length) {
					for (int x = 0; x < col_talget.length; x++) {
						arr[i][col_talget.length] += arr[i][x];
					}
					arr[i][col_talget.length + 1] = arr[i][col_talget.length] / col_talget.length;
				} else if (i > student_size && j < col_talget.length) {
					for (int x = 0; x < student_size; x++) {
						arr[student_size][j] += arr[x][j];
					}
					arr[student_size + 1][j] = arr[student_size][j] / student_size;
				}
			}
		}

		print(arr);
		sc.close();
	}

	// TODO: �˼��մϴ�. ó���� ����Ʈ ���� �����ϰ� ®���� 2���� �迭�� Object�� ��������ĵ�, ¥�ٰ� ���ϰ� ����Ʈ ���� �־
	// TODO: print�޼��带 �ſ� �����ϰ� ®���ϴ�.
	public static void print(int[][] arr) {
		String[] col_x = { "\tjava", "web", "and", "total", "avg" };
		for (int i = 0; i < col_x.length; i++) {
			System.out.print(col_x[i] + "\t");
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 && i == arr.length - 2) {
					System.out.print("sum \t");
				} else if (j == 0 && i == arr.length - 1) {
					System.out.print("avg \t");
				} else if (j == 0) {
					System.out.print("\t");
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
