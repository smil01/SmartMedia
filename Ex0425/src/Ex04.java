import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 4:03:32
 * @content : ���ǹ�
 *
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int age = scanner.nextInt();

		if (age >= 20) {
			System.out.println("�����Դϴ�.");
			System.out.println("����Դϴ�.");
		} else {
			System.out.println("��¥�Դϴ�.");
			System.out.println("���ư��Ӹ�.");
		}

		System.out.println("����Ǿ����ϴ�.");
	}

}
