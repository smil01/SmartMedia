import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 3:26:54
 * @content : ��� ���ϱ�
 *
 */
public class forEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� >>");
		int num = sc.nextInt();
		System.out.print(num + "�� ��� ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

		sc.close();
	}

}
