package �佺Ƽ��;

import java.util.Scanner;
/**
 * 
 * @author	: �����
 * @date	: 2019. 4. 30.
 * @time	: ���� 4:43:26
 * @content	: ���̵�1
 *
 */
public class Ex11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		float num = (float)scanner.nextInt();
		num = num * 0.1f + 0.5f;
		int num2 = (int)num * 10;
		System.out.println("�ݿø� �� : " + num2);
	}

}
