import java.util.Scanner;

/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 24.
 * @time	: ���� 6:14:15
 * @content	: ����1
 *
 */
public class Ex����1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���Է� >>");
		int num = scanner.nextInt();
		int result = num - (num%100);
		
		System.out.println("���Ȯ�� >>" + result);
	}
}
