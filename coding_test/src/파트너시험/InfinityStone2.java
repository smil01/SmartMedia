package ��Ʈ�ʽ���;

import java.util.Random;
import java.util.Scanner;

public class InfinityStone2 {
	public static void main(String[] args) {
		System.out.println("���Ǵ�Ƽ ������ ã�� ������");

		while (true) {

			System.out.println("[1]�����̽����� [2]�Ŀ����� [3]���ε彺�� [4]Ÿ�ӽ��� [5]����Ƽ����  [6]����");

			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				System.out.println("��Ű : �����̽������� ������ؼ���... �迭�� ������ Ȱ���� �� �˾ƾ��Ѵ�... ");
				int[] array = { 1, 2, 3, 4, 5 };
				System.out.println("��Ű : int[] array : {1,2,3,4,5} �迭�� ���� �Ŀ�... ������ ���� ����ϸ�");
				System.out.println("��Ű : �����̽� ������ ������ �� ���� ���̴�...");
				System.out.print("��� ->int[] array : {");
				for (int i = 0; i <= 3; i++) {
					array[i] = 5 - i;
					System.out.print(array[i] + ",");
					if (i == 3) {
						array[i + 1] = i - 2;
						System.out.print(array[i + 1]);
					}
				}
				System.out.print("}");
				System.out.println();

			} else if (choice == 2) {
				// ���������� �迭 ���� �ְ�
				System.out.println("�γ� : �Ŀ������� ������ؼ���... ��ǻ�Ϳ��� ����ºο��� �̰ܾ� �Ѵ�... ");
				System.out.println("�γ� : ��ǻ�Ϳ��� ������������ �Ͽ� �̰ܶ�");
				System.out.println("�γ� : 3�� ���� �¸��Ѵٸ� �Ŀ� ������ ������ �� ���� ���̴�...");

				int cntCom = 0;
				int cntUser = 0;

				String[] rsp = { "����", "����", "��" };

				Random rd = new Random();
				Scanner sc = new Scanner(System.in);
				while (true) {
					int com = rd.nextInt(3);

					System.out.print("����, ����, �� �� �ϳ��� �Է��ض� >> ");
					String user = sc.nextLine();

					System.out.println("com : " + rsp[com] + ", user : " + user);
					if (user.equals(rsp[com])) {
						System.out.println("���º�");
					} else if (user.equals("����") && com == 1) {
						cntCom += 1;
						System.out.println("���� " + cntCom + "��!");
					} else if (user.equals("����") && com == 2) {
						cntUser += 1;
						System.out.println("����� " + cntUser + "��!");
					} else if (user.equals("����") && com == 2) {
						cntCom += 1;
						System.out.println("���� " + cntCom + "��!");
					} else if (user.equals("����") && com == 0) {
						cntUser += 1;
						System.out.println("����� " + cntUser + "��!");
					} else if (user.equals("��") && com == 0) {
						cntCom += 1;
						System.out.println("���� " + cntCom + "��!");
					} else if (user.equals("��") && com == 1) {
						cntUser += 1;
						System.out.println("����� " + cntUser + "��!");
					} else {
						cntCom += 1;
						System.out.println("���� " + cntCom + "��!");
					}

					if (cntCom == 3) {
						System.out.println("���� �̸��� �ּ���..");
						break;
					} else if (cntUser == 3) {
						System.out.println("�Ŀ������� ���� �ڰ��� ����ϴ�...");
						break;
					}
				}
			} else if (choice == 3) {
				// ���ٿ� ����
				System.out.println("ġŸ�츮 ���� : ���ε彺���� ������ؼ���... ��ǻ�Ͱ� �� ���ڸ� �˾ƾ��Ѵ�... ");
				System.out.println("ġŸ�츮 ���� : ��ǻ�Ͱ� �� ���ڸ� �����Ͽ� ��ǻ���� ���ڸ� ���߾��");
				System.out.println("ġŸ�츮 ���� : 5ȸ�ȿ� ���ڸ� ����ٸ� ���ε彺���� ���� �� ������...\n");
				int answer = 0;
				Random random = new Random();
				int answerNumber = random.nextInt(99) + 1;

				int bool = 0;
				for (int i = 1; i <= 5; i++) {
					System.out.print("���ڸ� �Է��ض�..ũŪ(1~99) : ");
					answer = new Scanner(System.in).nextInt();
					if (answer > answerNumber) {
						if (i == 5) {
							continue;
						}
						System.out.println("Down!");
						System.out.println("����� " + (5 - i) + "�� ���Ҵ�..");
					} else if (answer < answerNumber) {
						if (i == 5) {
							continue;
						}
						System.out.println("Up!");
						System.out.println("����� " + (5 - i) + "�� ���Ҵ�..");
					} else if (answer == answerNumber) {
						System.out.println("���ε� ������ �� �����ϴ� ��..");
						bool = 1;
						break;
					}
				}
				if (bool == 0) {
					System.out.println("���ε� ������ �������� ���ߴ�..");
				}

			} else if (choice == 4) {
				// �ú��� ���
				// �ʴ��� �ð� �Է½� ����Ϸ�
				System.out.println("���μ�Ʈ �� : Ÿ�ӽ����� ������ؼ���... �ð��� Ȱ���� �� �˾ƾ��Ѵ�... ");
				System.out.println("���μ�Ʈ �� : �ʴ����� �Է¹����� �ʸ� �ð��� �а� �ʷ� �ٲ��� �ȴٸ�");
				System.out.println("���μ�Ʈ �� : Ÿ�ӽ����� ������ �� ���� ���̴�...");

				Scanner sc = new Scanner(System.in);
				System.out.print("�ʸ� �Է��ض� : ");
				int second = sc.nextInt();
				int hour = second / 3600;
				int min = (second - (hour * 3600)) / 60;
				int re_Second = (second - (hour * 3600)) % 60;
				System.out.println(hour + "��" + min + "��" + re_Second + "��");

				System.out.println("�ð��� ���� �ڰ��� ����ϴ�... � �������� ��ũ�������� ���� �츱 ������...");

			} else if (choice == 5) {
				// �̵ �ﰢ��
				System.out.println("�ݷ��� : ����Ƽ������ ������ؼ���... ���� ���� ���� ��ŭ ���� �ﰢ���� ������ �Ѵ�.. ");
				System.out.println("�ݷ��� : ���� ���ڸ� ���� ��(1 ~ 10) �� ���ڸ�ŭ �� �ﰢ���� ����ٸ�...");
				System.out.println("�ݷ��� : ����Ƽ������ ������ �� ���� ���̴�...");
				System.out.println("�ݷ��� : �ݺ����� �� �� ����Ѵٸ� ���ѷ����� �������� �𸥴ٱ�!");

				Random rd = new Random();
				int num = rd.nextInt(10) + 1;

				
				System.out.println("�ݷ��Ͱ� ���� ���� >>" + num);
				for (int i = 0, j = 0; i < num; i++) {
					for (int k = 0; k < j + num; k++) {
						System.out.print((k < ((num - 1) - j)) ? " " : "*");
					}
					if (i < (num - 1)) {
						j++;
					} 
					System.out.println();
				}

				System.out.println("¦¦¦! �Ϻ��ϱ�");

			} else if (choice == 6) {
				System.out.println("��� ���� ������� ���� ����...");
				break;
			} else {
				System.out.println("��Ʈ�� : ��Ȯ�� ���ڸ� �Է����� �ʴ´ٸ� ���ڿ����� �������� ����...!");

			}

		}

	}

}