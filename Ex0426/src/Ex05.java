import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 26.
 * @time : ���� 3:23:49
 * @content : while�� ����
 *
 */
public class Ex05 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int num = 0;

		while (num < 50) {
			System.out.print("���� �Է� >> ");
			num += scanner.nextInt();
		}

		System.out.println("50�� �ʰ� >> " + num);
		scanner.close();
	}
}
