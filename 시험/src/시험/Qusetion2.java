package ����;

import java.util.Scanner;

public class Qusetion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result[] = {0,0};
		int input = 0;
		
		while (true) {
			System.out.print("���� �Է� >> ");
			input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("���α׷� ����");
				sc.close();
				break;
			} else if(input % 2 == 0) {
				result[0] += 1;
			} else {
				result[1] += 1;
			}
			
			System.out.println("¦�� ���� : " + result[0]);
			System.out.println("Ȧ�� ���� : " + result[1]);
		}

	}

}
