import java.util.Scanner;

/**
 * 
 * @author : �����
 * @date : 2019. 4. 25.
 * @time : ���� 5:05:18
 * @content : ����
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�뵿�ð��� �Է��ϼ��� :");
		int time = scanner.nextInt();
		int salary = 0;

		if (time > 8) {
			salary = (int) (40000 + (time - 8) * 5000 * 1.5);
		} else {
			salary *= 5000;
		}

		System.out.println("�� �ӱ���" + salary + "�� �Դϴ�.");
		//////////////////////////////////////////////////////////////////////////////////////////////
		double rate = 1.5;
		int bTime = 8;
		int bPay = 5000;
		int tPay = 0;
		int wTime = time;

		if (wTime > bTime) {
			tPay = (int) ((bTime * bPay) + ((wTime - bTime) * bPay * rate));
		} else {
			tPay = wTime * bPay;
		}
		System.out.println("�� �ӱ���" + tPay + "�� �Դϴ�.");
	}

}
