import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 4:26:17
 * @content : ����
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		int db, keisan, os, data, soft, sum;

		Scanner scanner = new Scanner(System.in);

		System.out.print("DB : ");
		db = scanner.nextInt();

		System.out.print("���ڰ��� ���� : ");
		keisan = scanner.nextInt();

		System.out.print("OS : ");
		os = scanner.nextInt();

		System.out.print("��������� : ");
		data = scanner.nextInt();

		System.out.print("����Ʈ������� : ");
		soft = scanner.nextInt();

		
		sum = db + keisan + os + data + soft;
		

		if (db > 7 && keisan > 7 && os > 7 && data > 7 && soft > 7 && sum > 59) {
			System.out.println("�հ��Դϴ�!!!!!!");
		} else {
			System.out.println("���հ��Դϴ�!!!!!");
		}

	}

}
