import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 3:35:36
 * @content : 3�׿�����
 *
 */
public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num = scanner.nextInt();

		int size = 5;
		int box = num / 5;

		box += (box % size > 0) ? 1 : 0;

		System.out.println("�ʿ��� ������ �� : " + box);
	}

}
