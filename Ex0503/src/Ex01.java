import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = 5, val = 0; // �迭 ����, ���°�� �ִ��� ���� ����
		String[] arr = new String[size]; // �迭 ����
		String search = null; // ã�� �ܾ�

		arr = inputArr(size, scanner); // �迭�� �� �Է¹ޱ�
		search = input(scanner); // ã�� �ܾ� �Է¹ޱ�
		val = search(arr, search); // �˻�
		
		serchIf(search, val); // ��� ���
		
		scanner.close();
	}

	private static String[] inputArr(int size, Scanner scanner) {
		String[] arr = new String[size];

		System.out.println("�̸� 5���� �Է��Ͻÿ�.");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "��° �Է� >> ");
			arr[i] = scanner.nextLine();
		}
		return arr;
	}

	private static String input(Scanner scanner2) {
		String search = null;

		System.out.print("ã�� ���� ����� �Է��Ͻÿ�. >> ");
		search = scanner2.nextLine();

		return search;
	}

	private static int search(String[] arr, String search) {
		int val = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(search)) {
				val = i + 1;
			}
		}
		return val;
	}

	private static void serchIf(String search, int val) {
		System.out.println(val == -1 ? "�������� �ʽ��ϴ�." : search + "�� " + val + "�� �ֽ��ϴ�.");
	}

}
