import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 27.
 * @time : ���� 4:24:13
 * @content : �Ҽ� ���ϱ�
 *
 */
public class forEx08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է� >>");
		int num = scanner.nextInt(), num2 = scanner.nextInt();
		
		for (int i = num; i <= num2; i++) {
			boolean val = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					val = false;
					break;
				}
			}
			if (val) {
				System.out.print(i + " ");
			}
		}
	}

}
