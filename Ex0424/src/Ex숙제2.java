import java.util.Scanner;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 24.
 * @time	: ���� 6:17:22
 * @content	: ����2
 *
 */
public class Ex����2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�� �Է� >>");
		int totalSecond = scanner.nextInt();

		int hour = totalSecond / 3600;
		totalSecond = totalSecond % 3600;

		int minutes = totalSecond / 60;

		int second = totalSecond % 60;

		System.out.println(hour + "��" + minutes + "��" + second + "��");
	}

}
